package fetchers;

import java.util.ArrayList;
import java.util.List;

public class PieDataSet {
	
	public List<Double> ds;
	public PieDataSet() {
		this.ds = new ArrayList<Double>();
	}
	
	public void addSection(double s) {
		this.ds.add(s);
	}
	
	public List<Double> getSections() {
		for (int i = 0; i < ds.size(); i++) {
			System.out.println(ds.get(i));
		}
		return this.ds;
	}
}
