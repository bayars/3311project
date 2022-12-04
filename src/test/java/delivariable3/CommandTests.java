package delivariable3;

import org.junit.Test;

import statsVisualiser.command.Command;
import statsVisualiser.command.DrawGraph;
import statsVisualiser.command.EraseGraph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.gui.Main;

public class CommandTests {
	 
	
	@Test
	public void sampleCommand() throws Exception {
		
		Main m = new Main();
	    Command c = new DrawGraph(m);
	
	}
	
	@Test
	public void draw() throws Exception {
		
		Main m = new Main();
		m.currentGraph = new LineGraph("CAN", 2000, 2002,  "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		DrawGraph c = new DrawGraph(m);
	
	}
	
	@Test
	public void drawAndExcecute() throws Exception {
		
		Main m = new Main();
		m.currentGraph = new LineGraph("CAN", 2000, 2002,  "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		DrawGraph c = new DrawGraph(m);
		c.execute();
	}
	
	@Test
	public void erase() throws Exception {
		
		Main m = new Main();
		m.currentGraph = new LineGraph("CAN", 2000, 2002,  "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		DrawGraph c = new DrawGraph(m);
		c.execute();
		EraseGraph e = new EraseGraph(m);
	}
	
	@Test
	public void eraseAndExcecute() throws Exception {
		
		Main m = new Main();
		m.currentGraph = new LineGraph("CAN", 2000, 2002,  "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");
		DrawGraph c = new DrawGraph(m);
		c.execute();
		EraseGraph e = new EraseGraph(m);
		e.execute();
	}

}
