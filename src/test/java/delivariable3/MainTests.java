package delivariable3;

import java.awt.event.ActionEvent;
import static org.junit.Assert.*;
import org.junit.Test;
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
	
	
	
	
	

}
