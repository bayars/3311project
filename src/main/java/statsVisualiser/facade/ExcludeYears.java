package statsVisualiser.facade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ExcludeYears {
	public HashMap<String, ArrayList<String>> availableYearsforAnalysis = new HashMap<String, ArrayList<String>>();

	private Vector<Integer> removeExcludedYears(Vector<Integer> fromandtoyears, HashMap<String, ArrayList<String>> excludedList, String analysis, Vector <String> analysisName){
		ArrayList<Integer> newList = new ArrayList<Integer>();
//		System.out.println("List as dasdasd: "+excludedList);
//		System.out.println(analysis.toString());
//		System.out.println("analysis asas: "+excludedList.get(analysis.replaceAll("\"", "")));

		for (String myInt : excludedList.get(analysis)){ 
          newList.add(Integer.parseInt(myInt.toString().replaceAll("\"", ""))); 
        }
        fromandtoyears.removeAll(newList);
		return fromandtoyears;
	}

	private ArrayList<String> analysisType(){
		ArrayList<String> analysis = new ArrayList<>();
		analysis.add("Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");  
		analysis.add("Annual Percentage Change of PM2.5 Air Pollution and Forest Area");  
		analysis.add("CO2 Emissions Per GDP");  
		analysis.add("Average Forest Area");  
		analysis.add("Average Government Expenditure on Education");  
		analysis.add("Health Expenditure Per Hospital Beds");  
		analysis.add("Expenditure on Education VS Mortality Rate");  
		analysis.add("Anual Percent Change of Expenditure on Education And Health Expenditure");  
		return analysis; 
	}

	public HashMap<String, ArrayList<String>> readJson() {
		ArrayList<String> analysis = analysisType();
		try {
			JsonElement jelement = new JsonParser().parse(new FileReader("./data.json"));
			JsonObject jobject = jelement.getAsJsonObject();
			jobject = jobject.getAsJsonObject("excludedYears");
			for( int i = 0; i < jobject.size();i++) {
				ArrayList<String> years = new ArrayList<String>();
				String analysisName = analysis.get(i).toString();
				JsonArray jarray = jobject.getAsJsonArray(analysisName);
				for(int y = 0; y < jarray.size(); y++) {
					years.add(jarray.get(y).toString());
				}
				availableYearsforAnalysis.put(analysisName, years);
			}
			return availableYearsforAnalysis;
        } catch (JsonIOException e) {
	            System.out.println("IO failure");
	            e.printStackTrace();
	    } catch (JsonSyntaxException e) {
	            System.out.println("JSON format is not correct!!");
	            e.printStackTrace();
	    } catch (FileNotFoundException e) {
	            System.out.println("File not found!!");
	            e.printStackTrace();
	    }

		if (availableYearsforAnalysis == null) {
			System.out.println("availableYearsforAnalysis is null");
		}
		return null;
	}

	public Vector<Integer> excludeYears(Vector<Integer> years, HashMap<String, ArrayList<String>> excludedList,
			String analysis, Vector<String> analysisName) {
		return removeExcludedYears(years, excludedList, analysis, analysisName);
	}

	
}
