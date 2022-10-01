package statsVisualiser.gui;

import java.awt.BorderLayout;
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
	
	public String country;
	public int yearStart;
	
	public JButton addView;
	
	public JButton recalculate; 
	public boolean r;

	public boolean line;
	public static JComboBox<String> methodsList;
	public static JComboBox<String> countriesList;
	public static JComboBox<Integer> fromList;
	public static JComboBox<Integer> toList;

	public Main() {
		super("Country Statistics");
		
		// Set top bar
		JLabel chooseCountryLabel = new JLabel("Choose a country: ");
		Vector<String> countriesNames = new Vector<String>();
		countriesNames.add("USA");
		countriesNames.add("Canada");
		countriesNames.add("France");
		countriesNames.add("China");
		countriesNames.add("Brazil");
		countriesNames.sort(null);
		countriesList = new JComboBox<String>(countriesNames);
		

		JLabel from = new JLabel("From");
		JLabel to = new JLabel("To");
		Vector<Integer> years = new Vector<Integer>();
		for (int i = 2021; i >= 2010; i--) {
			years.add(i);
		}
		
	
		fromList = new JComboBox<Integer>(years);
		fromList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
		        JComboBox<Integer> combo = (JComboBox<Integer>) event.getSource();
		        int fromList = (Integer) combo.getSelectedItem();
		        yearStart = fromList;
		    }
		});
		
		
		toList = new JComboBox<Integer>(years);

		JPanel north = new JPanel();
		north.add(chooseCountryLabel);
		north.add(countriesList);
		north.add(from);
		north.add(fromList);
		north.add(to);
		north.add(toList);

		// Set bottom bar
		recalculate = new JButton("Recalculate");
		r = false;
		

		JLabel viewsLabel = new JLabel("Available Views: ");

		Vector<String> viewsNames = new Vector<String>();
		viewsNames.add("Pie Chart");
		viewsNames.add("Line Chart");
		viewsNames.add("Bar Chart");
		viewsNames.add("Scatter Chart");
		viewsNames.add("Report");
		JComboBox<String> viewsList = new JComboBox<String>(viewsNames);
		
		
		
		addView = new JButton("+");
		
		
		
		
		
		
		JButton removeView = new JButton("-");

		JLabel methodLabel = new JLabel("        Choose analysis method: ");
		
		
		
		Vector<String> methodsNames = new Vector<String>();
		methodsNames.add("Mortality");
		methodsNames.add("Mortality vs Expenses");
		methodsNames.add("Mortality vs Expenses & Hospital Beds");
		methodsNames.add("Mortality vs GDP");
		methodsNames.add("Unemployment vs GDP");
		methodsNames.add("Unemployment");
		methodsList = new JComboBox<String>(methodsNames);
		//method = (String) methodsList.getSelectedItem();
	
		

		JPanel south = new JPanel();
		south.add(viewsLabel);
		south.add(viewsList);
		south.add(addView);
		south.add(removeView);

		south.add(methodLabel);
		south.add(methodsList);
		south.add(recalculate);

		JPanel east = new JPanel();
		
	
		JPanel west = new JPanel();
		west.setLayout(new GridLayout(5, 5));
		
		getContentPane().add(north, BorderLayout.NORTH);
		getContentPane().add(east, BorderLayout.EAST);
		getContentPane().add(south, BorderLayout.SOUTH);
		
		getContentPane().add(west, BorderLayout.WEST);
	}
	
	public String getCountry() {
		countriesList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				JComboBox<String> combo = (JComboBox<String>) event.getSource();
				String selectedBook = (String) combo.getSelectedItem();
 
				if (selectedBook.equals("Canada")) {
					country = "CAN";
					System.out.println(country);
					
           
				} 
				if (selectedBook.equals("USA")) {
					country = "USA";
					System.out.println(country);
           
				} 
			}
		});
		return country;
	}	
	
	
	
	
	

	public static void plotGraph(Main f) {
		
	
			JPanel graph = Graph.createLine(f.getCountry(), 2010, 2019, "EN.ATM.CO2E.PC");
			f.getContentPane().add(graph);
			f.resize(f.getWidth(), 500);
			f.validate();
		
	}
	public class Clicklistener implements ActionListener
	{
	  public void actionPerformed(ActionEvent e)
	  {
	    if (e.getSource() == addView)
	    {
	      line = true;
	    }
	    if (e.getSource() == recalculate) {
	    	r = true;
	    }
	    
	  }
	}
	Clicklistener click = new Clicklistener();
	
	
	public static void main(String[] args) {
		Main f = new Main();
	
		f.setSize(900, 900);
		f.pack();
		f.setVisible(true);
		
		
	
		while (true) {
			JPanel blank = null;
			String c = null;
			JPanel graph;
			f.addView.addActionListener(f.click);
			f.recalculate.addActionListener(f.click);
			if (f.line){
				blank = Graph.createBlankLine();
				f.getContentPane().add(blank);
				f.resize(f.getWidth(), 500);
			}
			
			c = f.getCountry();
				
			if (c != null) {
				
				if (f.r) {
					
			
					
					plotGraph(f);
					f.r = false;
					f.line = false;
					
					
						
						
					}
					
				}
		
		
		}
		
		
	} 
}
		
		
		
		
		
		

		
		
		

	




	


