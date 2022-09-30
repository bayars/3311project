package fetchers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;


public class Data {
	
	
	/*
	 * 1. Based on the analysis mode, the method selects the appropriate link.
	 * 2. Puts the data from the URL into a JsonArray
	 * 3. For each year (chosen from range in UI), grab the corresponding y-value
	 * 4. Put the (x, y) Point into the DataSet
	 * 5. "Return (for now)" the DataSet of Points
	 * 
	 */
	public static DataSet fetchData(String country, int yearStart, int yearEnd, int analysisMode) {
		
		String urlString = "";
		
		
		/*
		 * API: http://api.worldbank.org/v2/source/75/indicators
		 * Some do not work so well, so try different ones if you're having trouble
		 */
		
		switch (analysisMode) {
			case 0: 
				urlString = String.format("http://api.worldbank.org/v2/country/%s/indicator/SP.POP.TOTL?date=%d:%d&format=json", country, yearStart, yearEnd);

				break;
			case 1:
				urlString = String.format("http://api.worldbank.org/v2/country/%s/indicator/SH.MED.BEDS.ZS?date=%d:%d&format=json", country, yearStart, yearEnd);
				break;
			case 2:
				//urlString =
				break;
			case 3:
				//urlString =
				break;
			case 4:
				//urlString =
				break;
			case 5:
				//urlString =
				break;
			case 6:
				//urlString =
				break;
			case 7:
				//urlString =
				break;
		}
	
		
		DataSet ds = new DataSet();

		
	//Prof wrote this to form connection:	
	//----------------------------------------------------------------------------------------
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
				JsonArray jsonArray = new JsonParser().parse(inline).getAsJsonArray();
	//----------------------------------------------------------------------------------------	
				switch (analysisMode) {
				case 0: 
	
					for (int x = yearStart, i = 0; x <= yearEnd && i < jsonArray.get(1).getAsJsonArray().size(); x++, i++) {
						double y = jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsInt();
						Point p = new Point(x, y);
						ds.addPoint(p);

					}	
					break;
					
				case 1:
					
					for (int x = yearStart, i = 0; x <= yearEnd && i < jsonArray.get(1).getAsJsonArray().size(); x++, i++) {
						double y = Double.parseDouble(jsonArray.get(1).getAsJsonArray().get(i).getAsJsonObject().get("value").getAsString());
						Point p = new Point(x, y);
						ds.addPoint(p);
					}
					break;
					
				case 2:
					//logic to parse data from URL to DataSet (example in case 0 and 1)
					break;
				case 3:
					//logic to parse data from URL to DataSet (example in case 0 and 1)					
					break;
				case 4:
					//logic to parse data from URL to DataSet (example in case 0 and 1)
					break;
				case 5:
					//logic to parse data from URL to DataSet (example in case 0 and 1)
					break;
				case 6:
					//logic to parse data from URL to DataSet (example in case 0 and 1)
					break;
				case 7:
					//logic to parse data from URL to DataSet (example in case 0 and 1)
					break;
			}
				
							
			}

		} catch (IOException e) {
		}
		return ds;
	}
	
	public static void main(String[] args) {
		
		//This will become the options that are chosen from the UI
		String country = "USA";
		int startYear = 2000;
		int endYear = 2005;
		
		//test your analysis mode here
		int analysisMode = 0;
		
		DataSet ds = Data.fetchData(country, startYear, endYear, analysisMode);
		System.out.println(ds.getPoints());
	}
	
	
	
}
