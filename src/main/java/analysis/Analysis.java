package analysis;

import fetchers.Data;
import fetchers.DataSet;
import fetchers.PieDataSet;
import fetchers.Point;

public class Analysis {
	/*
	 * 	Go To document from eClass:
	 *  EECS3311-Project-Description-Use-Cases-README-FIRST.docx
	 *  (page 9-10)
	 */
	
	
	/*
	 * returns a new DataSet corresponding to the annual percent change of parameter ds 
	 */
	public static DataSet annualPercentChange(DataSet ds) {
		
		DataSet sol = new DataSet();
		
		for (int i = 1; i < ds.getPoints().size(); i++) {
			
			double x = ds.p.get(i - 1).x;
			double fv = ds.p.get(i).y;
			double iv = ds.p.get(i - 1).y;
			double pc = ((fv - iv)/iv) * 100;
			Point p = new Point(x, pc);
			sol.addPoint(p);
		}
	
		sol.addPoint(ds.p.get(ds.getPoints().size() - 1));
		
		return sol;
		
	
	}
	
	/*
	 * returns a new DataSet corresponding to the ratio of ds1 and ds2
	 */
	public static DataSet ratio(DataSet ds1, DataSet ds2) {
		
		if (ds1.p.size() != ds2.p.size()) {
			System.out.println("Data Sets different sizes");
		}
		
		DataSet sol = new DataSet();
		
		for (int i = 0; i < ds1.p.size(); i++) {
			double x = ds1.p.get(i).x;
			double y = ds2.p.get(i).y / ds1.p.get(i).y;
			Point p = new Point(x, y);
			sol.addPoint(p);
		}
		return sol;
	}
	
	
	/*
	 * return 
	 */
	public static PieDataSet average(DataSet ds) {
		PieDataSet sol = new PieDataSet();
		double sum = 0;
		for (int i = 0; i < ds.p.size(); i++) {
			sum += ds.p.get(i).y;
		}
		sol.ds.add(sum / ds.p.size());
		sol.ds.add(100 - (sum / ds.p.size()));
		return sol;
		
	}
	
	public static void main(String[] args) {
		DataSet here = Analysis.annualPercentChange(Data.fetchData("CAN", 2010, 2019, "EN.ATM.CO2E.PC"));
		System.out.println(here.getPoints());
	}
	
	
}
