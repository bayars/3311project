package fetchers;

import analysis.Analysis;
import analysis.Average;

public class FetchersMain {

	public static void main(String[] args) {

		String country = "CAN";
		int startYear = 2000;
		int endYear = 2021;
		
	
		String a1 = "SP.POP.TOTL";
		String a9 ="SH.XPD.CHEX.PC.CD";
		String a10 ="SH.XPD.CHEX.GD.ZS";
		String a11 ="SP.DYN.IMRT.IN";
		String a12 ="SH.ACS.MONY.Q1.ZS";
		
		
		DataSet ds = Data.fetchData(country, startYear, endYear, a1);
		PieDataSet pie = Average.getAverage(ds);
		System.out.println(pie.getSections());
		DataSet ds2 = Data.fetchData(country, startYear, endYear, a1);
		System.out.println(ds.getPoints());
		
		

	}

}
