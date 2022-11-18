package statsVisualiser.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
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

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import statsVisualiser.command.Command;
import statsVisualiser.command.DrawGraph;
import statsVisualiser.command.EraseGraph;
import statsVisualiser.factory.GraphFactory;
import statsVisualiser.graph.Graph;

public class Main {
	
	Main UI = this;

	
	//dynamic values of buttons
	public String country;
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
	public static HashMap<String, String> conversionofAnalysis = new HashMap<String, String>();
	String[] countries = Locale.getISOCountries();
	Vector<String> allCountries = new Vector<String>();
	Map<String, String> ISOCountries = new HashMap<>();
	
	
	private Vector <String> initilizeCountries(){
		for(int i = 0; i < countries.length; i++) { 	
			String country = countries[i];
			Locale locale = new Locale("en", country);
			allCountries.add(locale.getDisplayCountry());
//				System.out.print("\""+locale.getDisplayCountry()+"\", " ); // Prints all countries
		}	
		return allCountries;
	}
	
	private Map<String, String> ISOconverter() {
		Map<String, String> countries = new HashMap<>();
		for (String iso : Locale.getISOCountries()) {
			Locale l = new Locale("", iso);
		    countries.put(l.getDisplayCountry(), iso);
		}
		return countries;
	}

	private Vector <String> findExcludedCountries(Vector <String> allCountries){
		try {
			JsonElement jelement = new JsonParser().parse(new FileReader("./data.json"));
			JsonObject jobject = jelement.getAsJsonObject();
			JsonArray jarray = jobject.getAsJsonArray("excludedlCountries");
			for(int k = 0;k<jarray.size();k++) {
				allCountries.remove(jarray.get(k).toString().replaceAll("\"", ""));
			}	
        } catch (JsonIOException e) {
	            System.out.println("IO failure");
	            e.printStackTrace();
	    } catch (JsonSyntaxException e) {
	            System.out.println("JSON format is not correct!!");
	            e.printStackTrace();
	    } catch (FileNotFoundException e) {
	            System.out.println("File not found!!");
	            e.printStackTrace();
	    }
	    return allCountries;
		
	}
	
	HashMap<String, ArrayList<String>> availableYearsforAnalysis = new HashMap<String, ArrayList<String>>();
	private HashMap<String, ArrayList<String>> readJsonforFindAvailableYears(){
		try {
			JsonElement jelement = new JsonParser().parse(new FileReader("./data.json"));
			JsonObject jobject = jelement.getAsJsonObject();
			jobject = jobject.getAsJsonObject("excludedYears");
			for( int i = 1; i < jobject.size()+1;i++) {
				ArrayList<String> years = new ArrayList<String>();
				String analysisName = "Analysis " + i;
				JsonArray jarray = jobject.getAsJsonArray(analysisName);
				for(int y = 0; y < jarray.size(); y++) {
					years.add(jarray.get(y).toString());
				}
				availableYearsforAnalysis.put(analysisName, years);
			}
			return availableYearsforAnalysis;
        } catch (JsonIOException e) {
	            System.out.println("IO failure");
	            e.printStackTrace();
	    } catch (JsonSyntaxException e) {
	            System.out.println("JSON format is not correct!!");
	            e.printStackTrace();
	    } catch (FileNotFoundException e) {
	            System.out.println("File not found!!");
	            e.printStackTrace();
	    }

		if (availableYearsforAnalysis == null) {
			System.out.println("availableYearsforAnalysis is null");
		}
		return null;
	}
	
	private Vector<Integer> removeExcludedYears(Vector<Integer> fromandtoyears, HashMap<String, ArrayList<String>> excludedList ,String analysis){
		conversionofAnalysis = makeConversionMap(analyses);
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for (String myInt : excludedList.get(conversionofAnalysis.get(analysis))) 
        { 
          newList.add(Integer.parseInt(myInt.toString().replaceAll("\"", ""))); 
        }
        fromandtoyears.removeAll(newList);
		return fromandtoyears;
	}
	
	private Vector<Integer> makeYears(Vector<Integer> a) {
		a.clear();
		for(int i = 1972; i < 2022; i++) {
			a.add(i);
		}
		return a;
	}
	
	private HashMap<String, String> makeConversionMap(Vector <String> analysis){
		int t = 1;
		for(String k: analysis) {
			String name = "a" + t;
			t++;
			conversionofAnalysis.put(name,k);
		}
		return conversionofAnalysis;
	}

	
	public Main() {
		panelNorth.setLayout(new FlowLayout());
		panelSouth.setLayout(new FlowLayout());
		panelCenter.setLayout(new GridLayout(0,3));
		f.add(panelNorth,BorderLayout.NORTH);
		f.add(panelSouth,BorderLayout.SOUTH);
		f.add(panelCenter,BorderLayout.CENTER);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Vector<String> countriesNames = new Vector<String>();
		
		countriesNames = findExcludedCountries(initilizeCountries());
		availableYearsforAnalysis = readJsonforFindAvailableYears();
		
		fromYears = new Vector<Integer>();
		fromYears = makeYears(fromYears);
		
		toYears = new Vector<Integer>();
		toYears = makeYears(toYears);
		
		DefaultComboBoxModel fromYearsComboBox = new DefaultComboBoxModel(fromYears);
		DefaultComboBoxModel toYearsComboBox = new DefaultComboBoxModel(toYears);
		
		
		fromSelector = new JComboBox<Integer>();
		toSelector = new JComboBox<Integer>();

		fromSelector.setModel(fromYearsComboBox);
		toSelector.setModel(toYearsComboBox);

		analyses.add("Analysis 1");  
		analyses.add("Analysis 2");  
		analyses.add("Analysis 3");  
		analyses.add("Analysis 4");  
		analyses.add("Analysis 5");  
		analyses.add("Analysis 6");  
		analyses.add("Analysis 7");  
		analyses.add("Analysis 8");  
		
		conversionofAnalysis = makeConversionMap(analyses);

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

		
		yearStart = 1972;
		yearEnd = 1972;

		country = "USA";
		analysis = "a1";
		view = "Line Chart";
		
		fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
		toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
		
		countrySelector.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String selected = (String) countrySelector.getSelectedItem();
				ISOCountries =  ISOconverter();
				
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
				case "Analysis 1":
					analysis = "a1";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 2":
					analysis = "a2";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 3":
					analysis = "a3";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 4":
					analysis = "a4";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 5":
					analysis = "a5";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 6":
					analysis = "a6";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 7":
					analysis = "a7";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
					break;
				case "Analysis 8":
					analysis = "a8";
					fromYears = makeYears(fromYears);
					toYears = makeYears(toYears);
					toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
					fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
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
			toYears = removeExcludedYears(toYears, availableYearsforAnalysis, analysis);
		}
		
		private void remakeFromSelector(){
			fromYears.clear();
			for(int i = 1972; i < yearEnd; i++) {
				fromYears.add(i);
			}
			fromYears = removeExcludedYears(fromYears, availableYearsforAnalysis, analysis);
		}
		
		void executeCommand(Command command){
			command.execute();
		}
}
		

