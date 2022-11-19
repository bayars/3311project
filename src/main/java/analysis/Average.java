package analysis;

import fetchers.DataSet;
import fetchers.PieDataSet;

public class Average {
	public static PieDataSet getAverage(DataSet ds) {
		PieDataSet sol = new PieDataSet();
		double sum = 0;
		//System.out.println(ds.p.size());
		int listSize = 0;
		
		for (int i = 0; i < ds.p.size(); i++) {
			if (ds.p.get(i).y > 0) {
				listSize++;
				System.out.println("y " + ds.p.get(i).y);
				System.out.println("ListSize "+ listSize);
			}
		}
		
		for (int i = 0; i < listSize; i++) {
			if (ds.p.get(i).y != 0) {
				sum += ds.p.get(i).y;
			}
			System.out.println("Sum " + sum);
		}
		
		sol.ds.add(sum / listSize);
		sol.ds.add(100 - (sum / listSize));
		//System.out.println("in pie dataset " + sol.ds.get(0) + " " + sol.ds.get(1));
		return sol;

	}
}
