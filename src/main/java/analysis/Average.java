package analysis;

import fetchers.DataSet;
import fetchers.PieDataSet;

public class Average {
	public static PieDataSet getAverage(DataSet ds) {
		PieDataSet sol = new PieDataSet();
		double sum = 0;
		//System.out.println(ds.p.size());
		for (int i = 0; i < ds.p.size(); i++) {
			sum += ds.p.get(i).y;
			//System.out.println(sum);
		}
		sol.ds.add(sum / ds.p.size());
		sol.ds.add(100 - (sum / ds.p.size()));
		//System.out.println("in pie dataset " + sol.ds.get(0) + " " + sol.ds.get(1));
		return sol;

	}
}
