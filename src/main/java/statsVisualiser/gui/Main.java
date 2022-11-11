package statsVisualiser.gui;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import statsVisualiser.factory.*;
import statsVisualiser.graph.graph;

public class Main  {
	
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
	
	
	Vector<Integer> fromYears;
	Vector<Integer> toYears;
	
	
	 JFrame f = new JFrame();

	 graph currentGraph;
	 JPanel currentJPanel;
	
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

		
		 fromYears = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			fromYears.add(i);
			
		}
		
		 toYears = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			toYears.add(i);
			
		}
		
		
		
		DefaultComboBoxModel fromYearsComboBox = new DefaultComboBoxModel(fromYears);
		DefaultComboBoxModel toYearsComboBox = new DefaultComboBoxModel(toYears);
		
		
		fromSelector = new JComboBox<Integer>();
		toSelector = new JComboBox<Integer>();

		fromSelector.setModel(fromYearsComboBox);
		toSelector.setModel(toYearsComboBox);

		
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
					System.out.println(selected);

					switch (selected){
					
					case "Analysis 1":
						analysis = "a1";
						break;
					case "Analysis 2":
						analysis = "a2";
						break;
					case "Analysis 3":
						analysis = "a3";
						break;
					case "Analysis 4":
						analysis = "a4";
						break;
					case "Analysis 5":
						analysis = "a5";
						break;
					case "Analysis 6":
						analysis = "a6";
						break;
					case "Analysis 7":
						analysis = "a7";
						break;
					case "Analysis 8":
						analysis = "a8";
						break;
						
					}

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

					drawGraph();
					
				
			}
		});
		
		

		
		minusButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				eraseGraph();

			}
		});
		
		recalculateButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			
				eraseGraph();
				drawGraph();
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

	}
	
	private void remakeFromSelector(){
		
		fromYears.clear();
		for(int i = 1972; i < yearEnd; i++) {
			fromYears.add(i);
			
		}

	}
	
	
	private void eraseGraph() {
		
		panelCenter.remove(graphStack.peek());
		panelCenter.repaint();
		f.pack();
		graphStack.pop();
		
	}
	

	private void drawGraph() {	
		
		GraphFactory graphfactory = new GraphFactory();
		currentGraph = graphfactory.createGraph(country, yearStart, yearEnd, analysis, view);
		
		
		currentJPanel = currentGraph.panel;
		this.currentJPanel.setVisible(true);
		panelCenter.add(currentJPanel);
		panelCenter.repaint();
		f.pack();
		graphStack.push(currentJPanel);
		
	}
	
	
	
}
		
		

