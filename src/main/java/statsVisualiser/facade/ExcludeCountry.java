package statsVisualiser.facade;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class ExcludeCountry implements Exclude{
	private static String[] countries = Locale.getISOCountries();
	private static Vector<String> allCountries = new Vector<String>();
	private static Map<String, String> ISOCountries = new HashMap<>();
	
	
	public Vector <String> initilizeCountries(){
		for(int i = 0; i < countries.length; i++) { 	
			String country = countries[i];
			Locale locale = new Locale("en", country);
			allCountries.add(locale.getDisplayCountry());
		}	
		return allCountries;
	}

	public Vector <String> findExcludedCountries(Vector <String> allCountries){
		try {
			JsonElement jelement = new JsonParser().parse(new FileReader("./data.json"));
			JsonObject jobject = jelement.getAsJsonObject();
			JsonArray jarray = jobject.getAsJsonArray("excludedlCountries");
			for(int k = 0;k<jarray.size();k++) {
				allCountries.remove(jarray.get(k).toString().replaceAll("\"", ""));
			}
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
	    return allCountries;	
	}
	
	public Map<String, String> ISOconverter() {
		Map<String, String> countries = new HashMap<>();
		for (String iso : Locale.getISOCountries()) {
			Locale l = new Locale("", iso);
		    countries.put(l.getDisplayCountry(), iso);
		}
		return countries;
	}

	@Override
	public Vector<String> excludeCountry(Vector<Integer> years, HashMap<String, ArrayList<String>> excludedList,
			String analysis) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Integer> excludeYears(Vector<Integer> years, HashMap<String, ArrayList<String>> excludedList,
			String analysis, Vector<String> analysisName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<String, ArrayList<String>> readJson() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<String> analysisType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<Integer> removeExcludedYears(Vector<Integer> fromandtoyears,
			HashMap<String, ArrayList<String>> excludedList, String analysis, Vector<String> analysisName) {
		// TODO Auto-generated method stub
		return null;
	}
}
