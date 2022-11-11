package statsVisualiser.factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import statsVisualiser.graph.BarGraph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.graph.PieGraph;
import statsVisualiser.graph.ReportGraph;
import statsVisualiser.graph.graph;

public class GraphFactory {

	
	
	
	
	
	public graph createGraph (String country, int yearStart, int yearEnd, String analysis,String graphType){
		
		
	    if(graphType == "Line Chart") {
			
			return(new LineGraph(country,yearStart,yearEnd,analysis));
	    	
		} else if(graphType == "Bar Chart") {
			
			return(new BarGraph(country,yearStart,yearEnd,analysis));

		} else if (graphType == "Pie Chart") {
			return(new PieGraph(country,yearStart,yearEnd,analysis));

			
		} else if (graphType == "Report") {
			
			return(new ReportGraph(country,yearStart,yearEnd,analysis));

			
		}
		
		
		return null;
		

		
	}
	
	
	
}
