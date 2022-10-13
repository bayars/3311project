package statsVisualiser.gui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Main extends JFrame {
	
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
	public static JComboBox<String> viewsList;
	public static JComboBox<String> analysisMode;
	public static JComboBox<String> countriesList;
	public static JComboBox<Integer> fromList;
	public static JComboBox<Integer> toList;


	
	public Main() {
		super("Country Statistics");
		
//Top Bar----------------------------------------------------------------------		
		//create country List
		JLabel chooseCountryLabel = new JLabel("Choose a country: ");
		Vector<String> countriesNames = new Vector<String>();
		countriesNames.add("USA");
		countriesNames.add("Canada");
		countriesNames.add("France");
		countriesNames.add("China");
		countriesNames.add("Brazil");
		countriesNames.sort(null);
		countriesList = new JComboBox<String>(countriesNames);
		
		//create to and from lists
		JLabel from = new JLabel("From");
		JLabel to = new JLabel("To");
		Vector<Integer> years = new Vector<Integer>();
		for (int i = 2021; i >= 2010; i--) {
			years.add(i);
		}
		fromList = new JComboBox<Integer>(years);
		toList = new JComboBox<Integer>(years);

		//add country list and to/from lists to north JPanel
		JPanel north = new JPanel();
		north.add(chooseCountryLabel);
		north.add(countriesList);
		north.add(from);
		north.add(fromList);
		north.add(to);
		north.add(toList);
		recalculate = new JButton("Recalculate");
		r = false;
		remove = false;
//------------------------------------------------------------------------------			
//Bottom Bar--------------------------------------------------------------------
		JLabel viewsLabel = new JLabel("Available Views: ");

		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Line Chart");
		viewsNames.add("Pie Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		viewsList = new JComboBox<String>(viewsNames);
		view = "Line";

		addView = new JButton("+");
	    removeView = new JButton("-");
	    yearStart = 2021;
	    yearEnd = 2021;

		JLabel methodLabel = new JLabel("        Choose analysis method: ");
		
		Vector<String> methodsNames = new Vector<String>();
		methodsNames.add("Analysis 1");  //a1
		methodsNames.add("Analysis 2");  //a2
		methodsNames.add("Analysis 3");  //a3
		methodsNames.add("Analysis 4");  //a4
		methodsNames.add("Analysis 5");  //a5
		methodsNames.add("Analysis 6");  //a6
		methodsNames.add("Analysis 7");  //a7
		methodsNames.add("Analysis 8");  //a8
		analysisMode = new JComboBox<String>(methodsNames);
		
		analysis = "a1";

		//add +/- and recalculate buttons to south JPanel
		JPanel south = new JPanel();
		south.add(viewsLabel);
		south.add(viewsList);
		south.add(addView);
		south.add(removeView);

		south.add(methodLabel);
		south.add(analysisMode);
		south.add(recalculate);
//------------------------------------------------------------------------------
//Finish setup------------------------------------------------------------------
		JPanel east = new JPanel();
		JPanel west = new JPanel();
		west.setLayout(new GridLayout(5, 5));
		
		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(south, BorderLayout.SOUTH);
		getContentPane().add(west, BorderLayout.WEST);
//------------------------------------------------------------------------------
	}
	
	//Action Listener for country selection
	public String getCountry() {
		countriesList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				String selectedBook = (String) combo.getSelectedItem();
 
				if (selectedBook.equals("Canada")) {
					country = "CAN";
				} else if (selectedBook.equals("Brazil")) {
					country = "BRA";

				} else if (selectedBook.equals("USA")) {
					country = "USA";

				} else if (selectedBook.equals("China")) {
					country = "CHN";

				} else if (selectedBook.equals("France")) {
					country = "FRA";

				} 
			}
		});
		return country;
	}	
	
	//Action Listener for start year selection
	public int getyearStart() {
		fromList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				yearStart = (Integer) combo.getSelectedItem();
 
				
			}
		});
		
		return yearStart;
	}	
	
	//Action Listener for end year selection
	public int getyearEnd() {
		toList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				yearEnd = (Integer) combo.getSelectedItem();
 
				
			}
		});
		
		return yearEnd;
	}	
	
	
	//Action Listener for analysis
	
	public String getAnalysisMode() {
		analysisMode.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				String am = (String) combo.getSelectedItem();
				if (am.equals("Analysis 1")) {
					analysis = "a1";
				} else if (am.equals("Analysis 2")) {
					analysis = "a2";
				} else if (am.equals("Analysis 3")) {
					analysis = "a3";
				} else if (am.equals("Analysis 4")) {
					analysis = "a4";
				} else if (am.equals("Analysis 5")) {
					analysis = "a5";
				} else if (am.equals("Analysis 6")) {
					analysis = "a6";
				} else if (am.equals("Analysis 7")) {
					analysis = "a7";
				}else if (am.equals("Analysis 8")) {
					analysis = "a8";
				}
 
				
			}
		});
		return analysis;
		
		
	}
	
	
	
	//Action Listener for viewer
		public void getView() {
			viewsList.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event) {
					JComboBox<String> combo = (JComboBox<String>) event.getSource();
					String v = (String) combo.getSelectedItem();
					if (v.equals("Pie Chart")) {
						view = "Pie";
					} else if (v.equals("Line Chart")) {
						view = "Line";
					} else if (v.equals("Bar Chart")) {
						view = "Bar";
					} else if (v.equals("Scatter Chart")) {
						view = "Scatter";
					} 
	 
					
				}
			});
		}	
	
//Listen for clicks------------------------------------------------------------------
	public class Clicklistener implements ActionListener {
		public int clicked;
		
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == addView){
				if (clicked < 6){
					clicked++;
					plus = true;
				}
				
				
			
			} else if (e.getSource() == recalculate) {
				r = true;
				
			}else if (e.getSource() == removeView) {
				if (clicked > 0) {
					clicked--;
					remove = true;
				}
				

			}
	    
		}
	}
	Clicklistener click = new Clicklistener();
//------------------------------------------------------------------------------
	public static void run() {
		Main f = new Main();
		
		f.setPreferredSize(new Dimension(1600, 800));
	
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel content = new JPanel(new GridLayout(2,2));
	    f.add(content);
		
		f.pack();
		
		f.setVisible(true);
		
		f.addView.addActionListener(f.click);
		f.removeView.addActionListener(f.click);
		
		
		JPanel blank = null;
		int cl = 0;
		while (true) {
			if (f.addView.isSelected()){
				System.out.println("here");
			}
			cl = f.click.clicked;
			
				//System.out.println(cl);
				f.recalculate.addActionListener(f.click);	//recalculate button
				f.getView();
				f.getAnalysisMode();

				
				
				if (f.view == "Line" && f.plus == true){
					blank = Graph.createBlankLine();
					content.add(blank);
				}else if (f.view == "Pie" && f.plus == true){
					blank = Graph.createBlankPie();
					content.add(blank);
				}else if (f.view == "Scatter" && f.plus == true){
					blank = Graph.createBlankScatter();
					content.add(blank);
				}else if (f.view == "Bar" && f.plus == true){
					blank = Graph.createBlankScatter();
					content.add(blank);
				}
				f.validate();
				f.plus = false;
				
				if (f.remove == true){
					
					content.remove(f.getComponentCount() - 1);
					
					
					content.validate();
					content.repaint();
					f.remove = false;
				}
				
			
			String c = f.getCountry();
			int yearStart = f.getyearStart();
			int yearEnd = f.getyearEnd();
		
			if (c != null && yearStart > 0 && yearEnd > 0 && cl >= 0 && cl < 7) {
				
				if (f.r) {		//recalculate is pressed
					JPanel graph = null;
					if (f.view == "Line") {
						graph = Graph.createLine(f.getCountry(), f.getyearStart(), f.getyearEnd() + 1, f.getAnalysisMode()); //always add 1 to year end

					}else if (f.view == "Pie") {
						graph = Graph.createPie(f.getCountry(), f.getyearStart(), f.getyearEnd() + 1, f.getAnalysisMode()); //always add 1 to year end
				  
				  	}else if (f.view == "Scatter") {
				  		graph = Graph.createScatter(f.getCountry(), f.getyearStart(), f.getyearEnd() + 1, f.getAnalysisMode()); //always add 1 to year end
				  	
					}else if (f.view == "Bar") {
						graph = Graph.createBar(f.getCountry(), f.getyearStart(), f.getyearEnd() + 1, f.getAnalysisMode()); //always add 1 to year end
						
					} 
					//content.remove(f.getComponentCount());
					content.add(graph);
					f.getContentPane().remove(blank);
					f.validate();
					f.r = false;
					f.plus = false;
					f.remove = false;
					
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Main.run();
	}
}
		
		

