package delivariable3;


import static org.junit.Assert.assertTrue;

import java.awt.event.ActionEvent;

import org.junit.Test;

import statsVisualiser.factory.GraphFactory;
import statsVisualiser.gui.Main;

public class MainTests {

	
	
	@Test
	public void main1() throws Exception {
		
		new Main();

		
		 Main.countrySelector.setSelectedIndex(5);
		 
		 Main.viewSelector.setSelectedIndex(0);
		
		 Main.analysisSelector.setSelectedIndex(0);
		
		 Main.fromSelector.setSelectedIndex(30);
		
		 Main.toSelector.setSelectedIndex(5);
		
		
		 assertTrue(Main.analysis.equals("Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"));
		 assertTrue(Main.country.equals("CA"));
		 assertTrue(Main.view.equals("Line Chart"));
		 assertTrue(Main.yearStart == (2016));
		 assertTrue(Main.yearEnd == 2021);

	}
	
	@Test
	public void main2() throws Exception {
		new Main();
		
	 
		
		 Main.countrySelector.setSelectedIndex(8);
		 
		 Main.viewSelector.setSelectedIndex(1);
		
		 Main.analysisSelector.setSelectedIndex(3);
		
		 Main.fromSelector.setSelectedIndex(25);
		
		 Main.toSelector.setSelectedIndex(3);
		
		 
		
		 assertTrue(Main.analysis.equals("Average Forest Area"));
		 assertTrue(Main.country.equals("DE"));
		 assertTrue(Main.view.equals("Pie Chart"));
		 assertTrue(Main.yearStart == (1997));
		 assertTrue(Main.yearEnd == 2000);

	}
	
	
	@Test
	public void main3() throws Exception {
		new Main();
		
	 
		
		 Main.countrySelector.setSelectedIndex(9);
		 
		 Main.viewSelector.setSelectedIndex(2);
		
		 Main.analysisSelector.setSelectedIndex(2);
		
		 Main.fromSelector.setSelectedIndex(20);
		
		 Main.toSelector.setSelectedIndex(10);
				
		 assertTrue(Main.analysis.equals("CO2 Emissions Per GDP"));
		 assertTrue(Main.country.equals("DK"));
		 assertTrue(Main.view.equals("Bar Chart"));
		 assertTrue(Main.yearStart == (2002));
		 assertTrue(Main.yearEnd == 2012);
		 

	}
	
	@Test
	public void main4() throws Exception {
		new Main();
		
	 
		
		 Main.countrySelector.setSelectedIndex(12);
		 
		 Main.viewSelector.setSelectedIndex(3);
		
		 Main.analysisSelector.setSelectedIndex(4);
		
		 Main.fromSelector.setSelectedIndex(18);
		
		 Main.toSelector.setSelectedIndex(5);
		
		 
		
		 assertTrue(Main.analysis.equals("Average Government Expenditure on Education"));
		 assertTrue(Main.country.equals("FR"));
		 assertTrue(Main.view.equals("Scatter Chart"));
		 assertTrue(Main.yearStart == (1997));
		 assertTrue(Main.yearEnd == 2002);

	}
	
	@Test
	public void main5() throws Exception {
		new Main();

		
	 
		
		 Main.countrySelector.setSelectedIndex(13);
		 
		 Main.viewSelector.setSelectedIndex(4);
		
		 Main.analysisSelector.setSelectedIndex(5);
		
		 Main.fromSelector.setSelectedIndex(12);
		
		 Main.toSelector.setSelectedIndex(8);
		
		 
		
		 assertTrue(Main.analysis.equals("Health Expenditure Per Hospital Beds"));
		 assertTrue(Main.country.equals("GB"));
		 assertTrue(Main.view.equals("Report Chart"));
		 assertTrue(Main.yearStart == (1991));
		 assertTrue(Main.yearEnd == 1999);

	}
}
