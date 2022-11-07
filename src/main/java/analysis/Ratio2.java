package analysis;

import java.util.List;

import fetchers.DataSet;
import fetchers.Point;

public class Ratio2 implements AnalysisMethod {
	public DataSet getAnalyzedData(List<DataSet> dataSets) {

		// System.out.println(ds1.p.size());
		
		DataSet ds1 = dataSets.get(0);
		DataSet ds2 = dataSets.get(1);
		DataSet ds3 = dataSets.get(2);

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
