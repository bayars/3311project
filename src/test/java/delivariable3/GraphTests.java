package delivariable3;

import static org.junit.Assert.*;
import org.junit.Test;
import statsVisualiser.factory.GraphFactory;
import statsVisualiser.graph.BarGraph;
import statsVisualiser.graph.Graph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.graph.PieGraph;
import statsVisualiser.graph.ReportGraph;
import statsVisualiser.graph.ScatterGraph;

public class GraphTests {
	@Test
	public void TestScatter() throws Exception {
		Graph g = new ScatterGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}


	@Test
	public void TestScatter2() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.wrongAnalysisType = true;
		assertEquals(null, gf.createGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution", "Pie Chart"));
	}
	
	@Test
	public void TestLine() throws Exception {
		Graph g = new LineGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}

	
	
	@Test
	public void TestBar() throws Exception {
		Graph g = new BarGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}

	
	
	@Test
	public void TestPie() throws Exception {
		Graph g = new PieGraph("CAN", 2017, 2019, "Average Forest Area");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2017, 2019, "Average Forest Area"), gf.isEmpty);
	}
	
	@Test
	public void Report() throws Exception {
		Graph g = new ReportGraph("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		GraphFactory gf = new GraphFactory();
		assertEquals(g.isEmpty("CAN", 2000, 2019, "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution"), gf.isEmpty);
	}

	

}
