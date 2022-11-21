package statsVisualiser.graph;

import javax.swing.JPanel;

public abstract class Graph {
	public JPanel panel;
	public Graph(String country, int yearStart, int yearEnd, String analysis) {}
	public Graph() {}
	
	
	public abstract boolean wrongAnalysisType(String country, int yearStart, int yearEnd, String analysis);
	public abstract boolean isEmpty(String country, int yearStart, int yearEnd, String analysis);
}
