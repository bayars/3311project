package deliverable3;

import static org.junit.Assert.assertEquals;

import java.awt.event.ActionEvent;

import org.junit.jupiter.api.Test;

import statsVisualiser.factory.GraphFactory;
import statsVisualiser.graph.Graph;
import statsVisualiser.graph.ScatterGraph;
import statsVisualiser.gui.Main;

public class MainTests {
	
	@Test
	public void main1() throws Exception {
		Main m = new Main();
		String selected = "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution";
		m.analysisSelector.actionPerformed(null);
		
	}
	
	@Test
	public void main2() throws Exception {
		Main m = new Main();
		String selected = "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution";
		
		m.analysisSelector.actionPerformed(null);
		m.yearStart = 2000;
		m.fromSelector.actionPerformed(null);
		
	}
	
	
	
	

}
