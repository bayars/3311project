package statsVisualiser.factory;

import javax.swing.JLabel;
import javax.swing.JPanel;

import statsVisualiser.graph.BarGraph;
import statsVisualiser.graph.LineGraph;
import statsVisualiser.graph.PieGraph;
import statsVisualiser.graph.ReportGraph;
import statsVisualiser.graph.ScatterGraph;
import statsVisualiser.graph.graph;

public class GraphFactory {
	
	public boolean isEmpty = false;
	public boolean wrongAnalysisType = false;

	public graph createGraph (String country, int yearStart, int yearEnd, String analysis,String graphType){
	    if(graphType == "Line Chart") {
	    	LineGraph line = new LineGraph(country,yearStart,yearEnd,analysis);
	    	if(line.wrongAnalysisType(country, yearStart, yearEnd, analysis)){
				wrongAnalysisType = true;
	    		return null;
			}
	    	if (line.isEmpty(country, yearStart, yearEnd, analysis)) {
	    		isEmpty =  true;
	    	}else {
	    	
	    		return(line);
	    	}
		} else if(graphType == "Bar Chart") {
			BarGraph bar = new  BarGraph(country,yearStart,yearEnd,analysis);
			if(bar.wrongAnalysisType(country, yearStart, yearEnd, analysis)){
				wrongAnalysisType = true;
	    		return null;
			}
	    	if (bar.isEmpty(country, yearStart, yearEnd, analysis)) {
	    		isEmpty =  true;
	    	}else {
	    	
	    		return(bar);
	    	}
		} else if (graphType == "Pie Chart") {	
			
			PieGraph pie = new PieGraph(country,yearStart,yearEnd,analysis);
			if(pie.wrongAnalysisType(country, yearStart, yearEnd, analysis)){
				wrongAnalysisType = true;
	    		return null;
			}
	    	if (pie.isEmpty(country, yearStart, yearEnd, analysis)) {
	    		isEmpty =  true;
	    	}else {  	
	    		return(pie);
	    	}						
		} else if (graphType == "Report") {		
			ReportGraph report = new ReportGraph(country,yearStart,yearEnd,analysis);
			if(report.wrongAnalysisType(country, yearStart, yearEnd, analysis)){
				wrongAnalysisType = true;
	    		return null;
			}
	    	if (report.isEmpty(country, yearStart, yearEnd, analysis)) {
	    		isEmpty =  true;
	    	}else {
	    	
	    		return(report);
	    	}				
		} else if (graphType == "Scatter Chart") {		
			ScatterGraph scatter = new ScatterGraph(country,yearStart,yearEnd,analysis);
			if(scatter.wrongAnalysisType(country, yearStart, yearEnd, analysis)){
				wrongAnalysisType = true;
	    		return null;
			}
	    	if (scatter.isEmpty(country, yearStart, yearEnd, analysis)) {
	    		isEmpty =  true;
	    	}else {
	    	
	    		return(scatter);
	    	}				
		}
		return null;
	}
}
