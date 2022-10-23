package analysis;

import fetchers.DataSet;
import fetchers.Point;

public class Ratio2 extends Analysis {
	public static DataSet getRatio(DataSet ds1, DataSet ds2, DataSet ds3) {

		// System.out.println(ds1.p.size());

		if (ds1.p.size() != ds2.p.size() && ds2.p.size() != ds3.p.size()) {
			System.out.println("Data Sets different sizes");
		}

		DataSet sol = new DataSet();

		for (int i = 0; i < ds1.p.size(); i++) {
			double x = ds1.p.get(i).x;
			// System.out.println(x);
			double y = ((ds1.p.get(i).y / ds2.p.get(i).y) * 1000) / ds3.p.get(i).y;
			//System.out.println(y);
			Point p = new Point(x, y);
			sol.addPoint(p);
		}
		return sol;
	}
}
