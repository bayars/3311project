package fetchers;

import java.util.ArrayList;
import java.util.List;


public class DataSet{
	public List<Point> p;
	
	public DataSet() {
		this.p = new ArrayList<Point>();
	}
	
	public void addPoint(Point p) {
		this.p.add(p);
	}
	
	public List<Point> getPoints() {

		return this.p;
	}

	public int length() {
		return this.p.size();
	}
}
