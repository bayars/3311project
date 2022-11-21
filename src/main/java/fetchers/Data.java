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
	
	
		
	
}

