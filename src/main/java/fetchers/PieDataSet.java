package fetchers;

import java.util.ArrayList;
import java.util.List;

public class PieDataSet {
	//
	public List<Double> ds;
	public PieDataSet() {
		this.ds = new ArrayList<Double>();
	}
	
	public void addSection(double s) {
		this.ds.add(s);
	}
	
	public List<Double> getSections() {
		return this.ds;
	}
	
	public int length() {
		return this.ds.size();
	}

	
}
