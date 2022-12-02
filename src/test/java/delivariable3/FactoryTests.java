package delivariable3;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import statsVisualiser.factory.GraphFactory;
import statsVisualiser.graph.BarGraph;
import statsVisualiser.graph.Graph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.graph.PieGraph;
import statsVisualiser.graph.ReportGraph;
import statsVisualiser.graph.ScatterGraph;

public class FactoryTests {



	@Test
	public void wrongAnalysisTypeLine() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.wrongAnalysisType = true;
		assertEquals(null, gf.createGraph("CAN", 2000, 2019, "Average Forest Area", "Line Chart"));
	}
	
	@Test
	public void returnLine() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1972, 1972, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Line Chart");
	}
	
	@Test
	public void isEmptyLine() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1970, 1970, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Line Chart");
		assertEquals(true, gf.isEmpty);
	}
	
	@Test
	public void wrongAnalysisTypeBar() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.wrongAnalysisType = true;
		assertEquals(null, gf.createGraph("CAN", 2000, 2019, "Average Forest Area", "Bar Chart"));
	}
	
	@Test
	public void returnBar() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1972, 1972, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Bar Chart");
	}
	
	@Test
	public void isEmptyBar() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1970, 1970, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Bar Chart");
		assertEquals(true, gf.isEmpty);
	}
	
	@Test
	public void wrongAnalysisTypeScater() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.wrongAnalysisType = true;
		assertEquals(null, gf.createGraph("CAN", 2000, 2019, "Average Forest Area", "Scatter Chart"));
	}
	
	@Test
	public void returnScatter() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1972, 1972, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Scatter Chart");
	}
	
	@Test
	public void isEmptySactter() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1970, 1970, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Scatter Chart");
		assertEquals(true, gf.isEmpty);
	}
	
	@Test
	public void isEmptyPie() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1970, 1970, "Average Forest Area", "Pie Chart");
		assertEquals(true, gf.isEmpty);
	}
	
	@Test
	public void returnPie() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 2000, 2002, "Average Forest Area", "Pie Chart");
	}
	
	@Test
	public void wrongAnalysisTypeReport() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.wrongAnalysisType = true;
		assertEquals(null, gf.createGraph("CAN", 2000, 2019, "Average Forest Area", "Report Chart"));
	}
	
	@Test
	public void returnReport() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1972, 1972, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Report Chart");
	}
	
	@Test
	public void isEmptyReport() throws Exception {
		GraphFactory gf = new GraphFactory();
		gf.createGraph("CAN", 1970, 1970, "Annual Percent Change of Expenditure on Education And Health Expenditure", "Report Chart");
		assertEquals(true, gf.isEmpty);
	}
	
	
	
}