package statsVisualiser.factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import statsVisualiser.graph.BarGraph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.graph.PieGraph;
import statsVisualiser.graph.ReportGraph;
import statsVisualiser.graph.graph;

public class GraphFactory {

	
	
	public boolean isEmpty = false;
	
	
	public graph createGraph (String country, int yearStart, int yearEnd, String analysis,String graphType){
		
		
	    if(graphType == "Line Chart") {
	    	LineGraph line = new LineGraph(country,yearStart,yearEnd,analysis);
	    	if (line.isEmpty(country, yearStart, yearEnd, analysis)) {
	    		isEmpty =  true;
	    	}else {
	    	
	    		return(line);
	    	}
	    	
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
