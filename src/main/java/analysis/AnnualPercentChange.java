package analysis;

import fetchers.DataSet;
import fetchers.Point;

public class AnnualPercentChange {
	public static DataSet getPercent(DataSet ds) {

		DataSet sol = new DataSet();
		// System.out.println(ds.getPoints().size());

		for (int i = 1; i < ds.getPoints().size(); i++) {

			double x = ds.p.get(i).x;
			// System.out.println(x);
			double fv = ds.p.get(i).y;
			// System.out.println(fv);
			double iv = ds.p.get(i - 1).y;
			double pc = ((fv - iv) / iv) * 100;
		    //System.out.println(pc);
			Point p = new Point(x, pc);
			sol.addPoint(p);
		}

		return sol;

	}
}
