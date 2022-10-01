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
		
		for (int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i).x + ", " + p.get(i).y);
		}
		
		return this.p;
	}

	
}
