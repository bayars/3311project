package fetchers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

import analysis.Analysis;


public class Data {

	
	public static String makeURL(String country, int yearStart, int yearEnd, String analysisMode) {
		return new Url.UrlBuilder().setCountry(country).setYearStart(yearStart).setYearEnd(yearEnd).setanalysisMode(analysisMode).build().toString();

	}
	
	
	public static DataSet fetchData(String country, int yearStart, int yearEnd, String analysisMode) {

		String urlString = makeURL(country, yearStart, yearEnd, analysisMode);
		DataSet ds = new DataSet();

		try {
			URL url = new URL(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responsecode = conn.getResponseCode();
			if (responsecode == 200) {
				String inline = "";
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					inline += sc.nextLine();
				}
				sc.close();
				//System.out.println(inline);
				JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();	
				
				int x = yearStart;
				for (int i = jsonArray.get(1).getAsJsonArray().size() - 1; i >= 0; i--) {
					if (jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").isJsonNull()) {
						ds.addPoint(new Point(x,0));
					}else {
						double y = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsDouble();
						Point p = new Point(x, y);
						ds.addPoint(p);
					}
					x++;
				}			
			}

		} catch (IOException e) {
		}
		return ds;
	}
	
	public static void main(String[] args) {
//	
		String country = "CAN";
		int startYear = 2000;
		int endYear = 2021;
//		
//	
//		String Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution = "SP.POP.TOTL";
//		String Annual Percentage Change of PM2.5 Air Pollution and Forest Area = "EN.ATM.CO2E.PC";
//		String CO2 Emissions Per GDP ="EN.ATM.PM25.MC.M3";
//		String Average Forest Area ="AG.LND.FRST.ZS";
//		String Average Government Expenditure on Educati ="NY.GDP.PCAP.CD";
//		String Health Expenditure Per Hospital Beds ="SH.MED.BEDS.ZS";
//		String Annual Percent Change of Expenditure on Education And Mortality Rate ="SE.XPD.TOTL.GD.ZS";
//		String Annual Percent Change of Expenditure on Education And Health Expenditure ="SH.STA.MMRT";
//		String a9 ="SH.XPD.CHEX.PC.CD";
//		String a10 ="SH.XPD.CHEX.GD.ZS";
//		String a11 ="SP.DYN.IMRT.IN";
//		String a12 ="SH.ACS.MONY.Q1.ZS";
//		
//		
//		DataSet ds = Data.fetchData(country, startYear, endYear, Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution);
//		PieDataSet pie = Average.getAverage(ds);
//		System.out.println(pie.getSections());
		
		//
//		DataSet ds = Data.fetchData(country, startYear, endYear, Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution);
//		System.out.println(ds.getPoints());
		
		//DataSet ratio = Analysis.ratio(ds, ds2);
		//System.out.println(ratio.getPoints());

		//DataSet dsLine = Analysis.annualPercentChange(ds);
		//System.out.println(dsLine.getPoints());
	}	
	
}

