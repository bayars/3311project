package statsVisualiser.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Stack;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

public class Main  {
	
private static final long serialVersionUID = 1L;
	
	

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
	JPanel panelCenter = new JPanel();
	
	static JFrame f = new JFrame();

	JPanel latestAdded;
	
	int counter = 0;
	
	 Stack<JPanel> graphStack = new Stack<JPanel>();  

	
	public Main() {
		






		panelNorth.setLayout(new FlowLayout());
		panelSouth.setLayout(new FlowLayout());
		panelCenter.setLayout(new GridLayout(0,3));

		

		f.add(panelNorth,BorderLayout.NORTH);
		f.add(panelSouth,BorderLayout.SOUTH);
		f.add(panelCenter,BorderLayout.CENTER);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Vector<String> countriesNames = new Vector<String>();
		countriesNames.add("USA");
		countriesNames.add("Canada");
		countriesNames.add("France");
		countriesNames.add("China");
		countriesNames.add("Brazil");
		
		
		Vector<Integer> years = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			years.add(i);
		}
	
		
		Vector<String> analyses = new Vector<String>();
		analyses.add("Analysis 1");  
		analyses.add("Analysis 2");  
		analyses.add("Analysis 3");  
		analyses.add("Analysis 4");  
		analyses.add("Analysis 5");  
		analyses.add("Analysis 6");  
		analyses.add("Analysis 7");  
		analyses.add("Analysis 8");  
		
		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Line Chart");
		viewsNames.add("Pie Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		view = "Line";
		
		 viewSelector = new JComboBox<String>(viewsNames);
		 countrySelector = new JComboBox<String>(countriesNames);
		 fromSelector = new JComboBox<Integer>(years);
	  	 toSelector = new JComboBox<Integer>(years);
		 analysisSelector = new JComboBox<String>(analyses);
		
		JButton plusButton = new JButton("+");
		JButton minusButton = new JButton("-");
		JLabel to = new JLabel("to");

		
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

		
		country = "USA";
		view = "Line Chart";
		yearStart = 1972;
		yearEnd = 1972;
		analysis = "a1";

		
		countrySelector.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					String selected = (String) countrySelector.getSelectedItem();
					switch(selected) {
					
					case "USA":
						country = "USA";
						break;
					case "Canada":
						country = "CA";
						break;	
					case "Brazil":
						country = "BRA";
						break;
					case "China":
						country = "CHN";
						break;	
					case "France":
						country = "FRA";
						break;

					
					
					
					
					
					}
			}
			
		});
		
		analysisSelector.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					String selected = (String) analysisSelector.getSelectedItem();
					analysis = selected;
			}
			
		});
		
		viewSelector.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					String selected = (String) viewSelector.getSelectedItem();
					view = selected;
					System.out.println(selected);
			}
			
		});
		
		fromSelector.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int selected = (Integer) fromSelector.getSelectedItem();
				yearStart = selected;
			}
			
		});
			
		toSelector.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int selected = (Integer) toSelector.getSelectedItem();
				yearEnd = selected;
			}
			
			
			
			
		});
		
		plusButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				JPanel graph = null;
				

					switch(view) {
						case "Line Chart":
							 graph = Graph.createLine(country, yearStart, yearEnd, analysis);
							 System.out.println(analysis);
							 System.out.println(country);
							 System.out.println(yearStart);
							 System.out.println(yearEnd);
							 System.out.println(view);

						break;
						case "Pie Chart":
							 graph = Graph.createPie(country, yearStart, yearEnd, analysis);
							 System.out.println(analysis);
							 System.out.println(country);
							 System.out.println(yearStart);
							 System.out.println(yearEnd);
							 System.out.println(view);

						break;
						case "Scatter Chart":
							 graph = Graph.createScatter(country, yearStart, yearEnd, analysis);
							 System.out.println(analysis);
							 System.out.println(country);
							 System.out.println(yearStart);
							 System.out.println(yearEnd);
							 System.out.println(view);

						break;
						case "Bar Chart":
							 graph = Graph.createBar(country, yearStart, yearEnd, analysis);
							 System.out.println(analysis);
							 System.out.println(country);
							 System.out.println(yearStart);
							 System.out.println(yearEnd);
							 System.out.println(view);

						break;
					}
					
					
					graph.setVisible(true);
					panelCenter.add(graph);
					panelCenter.repaint();
					f.pack();
					graphStack.push(graph);
					

			}
			
			
			
			
		});
		
		
		minusButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				panelCenter.remove(graphStack.peek());
				panelCenter.repaint();
				f.pack();
				graphStack.pop();

			}
			
			
			
			
		});

		
		f.pack();
		f.setVisible(true);


		
		
		
		
	
	}
	
	




	
	
	
	

	
	
	

	
	public static void main(String[] args) {

	
	
	
		Main main = new Main();
		
		
		
		
		
		
		
		
	}
}
		
		
		
		
		
		

		
		
		

	




	


