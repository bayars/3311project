package statsVisualiser.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import statsVisualiser.command.Command;
import statsVisualiser.command.DrawGraph;
import statsVisualiser.command.EraseGraph;
import statsVisualiser.facade.Exclude;
import statsVisualiser.facade.ExcludeCountry;
import statsVisualiser.facade.ExcludeYears;
import statsVisualiser.factory.GraphFactory;
import statsVisualiser.graph.Graph;

public class Main {
	
	Main UI = this;

	
	//dynamic values of buttons
	public static String country;
	public int yearStart, yearEnd;
	
	//+/- buttons and recalculate
	public JButton addView, removeView, recalculate; 
	
	//how program checks if button pressed/graph selected
	public String view;
	public boolean r, plus, line, pie, scatter, bar, remove;
	public String analysis;

	//ComboBoxes
	public static JComboBox<String> viewSelector;
	public static JComboBox<String> countrySelector;
	public static JComboBox<Integer> fromSelector;
	public static JComboBox<Integer> toSelector;
	public static JComboBox<String> analysisSelector;
	
	public HashMap<String, ArrayList<String>> availableYearsforAnalysis = new HashMap<String, ArrayList<String>>();
	public HashMap<String, String> conversionofAnalysis = new HashMap<String, String>();
	Map<String, String> ISOCountries = new HashMap<>();
	Vector<String> countriesNames = new Vector<String>();

	//Sections of ui
	JPanel panelNorth = new JPanel();
	JPanel panelSouth = new JPanel();
	public JPanel panelCenter = new JPanel();
	
	
	Vector<Integer> fromYears;
	Vector<Integer> toYears;
	
	
	 public JFrame f = new JFrame();

	 public Graph currentGraph;
	 public JPanel currentJPanel;
	
	int counter = 0;
	
	public Stack<JPanel> graphStack = new Stack<JPanel>();  

	public static Vector<String> analyses = new Vector<String>();

	
	private Vector<Integer> makeYears(Vector<Integer> a) {
		a.clear();
		for(int i = 1972; i < 2022; i++) {
			a.add(i);
		}
		return a;
	}

	Exclude yearsExcluded = new ExcludeYears();
	Exclude countryExcluded = new ExcludeCountry();
	
	
	public Main() {

		panelNorth.setLayout(new FlowLayout());
		panelSouth.setLayout(new FlowLayout());
		panelCenter.setLayout(new GridLayout(0,3));
		f.add(panelNorth,BorderLayout.NORTH);
		f.add(panelSouth,BorderLayout.SOUTH);
		f.add(panelCenter,BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		yearStart = 1972;
		yearEnd = 1972;
		
		ISOCountries = countryExcluded.ISOconverter();
		country = ISOCountries.get("Afghanistan");
		
		analysis = "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution";
		view = "Line Chart";
		
		fromYears = new Vector<Integer>();
		fromYears = makeYears(fromYears);
		
		toYears = new Vector<Integer>();
		toYears = makeYears(toYears);
		
		analyses.add("Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");  
		analyses.add("Annual Percentage Change of PM2.5 Air Pollution and Forest Area");  
		analyses.add("CO2 Emissions Per GDP");  
		analyses.add("Average Forest Area");  
		analyses.add("Average Government Expenditure on Education");  
		analyses.add("Health Expenditure Per Hospital Beds");  
		analyses.add("Annual Percent Change of Expenditure on Education And Mortality Rate");  
		analyses.add("Annual Percent Change of Expenditure on Education And Health Expenditure");  
		
		availableYearsforAnalysis = yearsExcluded.readJson();
		countriesNames = countryExcluded.initilizeCountries();
		countryExcluded.findExcludedCountries(countriesNames);
		
		DefaultComboBoxModel fromYearsComboBox = new DefaultComboBoxModel(fromYears);
		DefaultComboBoxModel toYearsComboBox = new DefaultComboBoxModel(toYears);
		
		
		fromSelector = new JComboBox<Integer>();
		toSelector = new JComboBox<Integer>();

		fromSelector.setModel(fromYearsComboBox);
		toSelector.setModel(toYearsComboBox);

		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Line Chart");
		viewsNames.add("Pie Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		
		 viewSelector = new JComboBox<String>(viewsNames);
		 countrySelector = new JComboBox<String>(countriesNames);
		 analysisSelector = new JComboBox<String>(analyses);
		
		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		JLabel to = new JLabel("to");
		JButton recalculateButton = new JButton("Recalculate");

		
		countrySelector.setBorder(new EmptyBorder(10,1,1,1));
		fromSelector.setBorder(new EmptyBorder(10,1,1,1));
		toSelector.setBorder(new EmptyBorder(10,1,1,1));
		to.setBorder(new EmptyBorder(10,1,1,1));
		
		countrySelector.setPreferredSize(new Dimension(200,35));
		
		panelNorth.add(countrySelector);
		panelNorth.add(fromSelector);
		panelNorth.add(to);
		panelNorth.add(toSelector);
		
		panelSouth.add(analysisSelector);
		panelSouth.add(viewSelector);
		panelSouth.add(plusButton);
		panelSouth.add(minusButton);
		panelSouth.add(recalculateButton);

		fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
		toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);

		countrySelector.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String selected = (String) countrySelector.getSelectedItem();				
				if ( ISOCountries.containsKey(selected)) {
					country = ISOCountries.get(selected);
				}else{
					System.out.println("Country conversion Error");
				}
			}
		});
		
		analysisSelector.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent e) {
				String selected = (String) analysisSelector.getSelectedItem();
				analysis = selected;
				System.out.println(selected);
				switch (selected){	
				case "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "Annual Percentage Change of PM2.5 Air Pollution and Forest Area":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "CO2 Emissions Per GDP":
					analysis = "CO2 Emissions Per GDP";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "Average Forest Area":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "Average Government Expenditure on Education":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "Health Expenditure Per Hospital Beds":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "Annual Percent Change of Expenditure on Education And Mortality Rate":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				case "Annual Percent Change of Expenditure on Education And Health Expenditure":
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
					fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
					break;
				}
			}
			});
			
			viewSelector.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
						String selected = (String) viewSelector.getSelectedItem();
						view = selected;
//						System.out.println(selected);
				}
			});
			
			fromSelector.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int selected = (Integer) fromSelector.getSelectedItem();
					yearStart = selected;
					remakeToSelector();
				}	
			});
				
			toSelector.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int selected = (Integer) toSelector.getSelectedItem();
					yearEnd = selected;
					remakeFromSelector();			
				}
			});
			
			plusButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {	
					GraphFactory graphfactory = new GraphFactory();
					currentGraph = graphfactory.createGraph(country, yearStart, yearEnd, analysis, view);
					if( yearStart > yearEnd ) {
						JOptionPane.showMessageDialog(addView, "Start year should not smaller than end year!");
					}else if(graphfactory.isEmpty) {
						JOptionPane.showMessageDialog(addView, "Data not found");
					}else if(graphfactory.wrongAnalysisType) {
						JOptionPane.showMessageDialog(addView, "Graph not applicable for this analysis type");
					}else {
						DrawGraph drawgraph = new DrawGraph(UI);
						executeCommand(drawgraph);
					}
				}
			});
			
			minusButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(graphStack.empty()) {
						JOptionPane.showMessageDialog(removeView, "Cannot remove non-exist graph!!");
					}
					EraseGraph erasegraph = new EraseGraph(UI);
					executeCommand(erasegraph);
				}
			});
			
			recalculateButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					GraphFactory graphfactory = new GraphFactory();
					currentGraph = graphfactory.createGraph(country, yearStart, yearEnd, analysis, view);
					
					EraseGraph erasegraph = new EraseGraph(UI);
					executeCommand(erasegraph);
					
					DrawGraph drawgraph = new DrawGraph(UI);
					executeCommand(drawgraph);
				}
			});
			f.pack();
			f.setVisible(true);
		}
		
		private void remakeToSelector(){
			toYears.clear();
			for(int i = yearStart; i < 2022; i++) {
				toYears.add(i);
			}
			toYears = yearsExcluded.excludeYears(toYears, availableYearsforAnalysis, analysis,analyses);
		}
		
		private void remakeFromSelector(){
			fromYears.clear();
			for(int i = 1972; i < yearEnd; i++) {
				fromYears.add(i);
			}
			fromYears = yearsExcluded.excludeYears(fromYears, availableYearsforAnalysis, analysis,analyses);
		}
		
		void executeCommand(Command command){
			command.execute();
		}
}
		

