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

public class ExcludeCountry {
	static String[] countries = Locale.getISOCountries();
	static Vector<String> allCountries = new Vector<String>();
	static Map<String, String> ISOCountries = new HashMap<>();
	
	
	public Vector <String> initilizeCountries(){
		for(int i = 0; i < countries.length; i++) { 	
			String country = countries[i];
			Locale locale = new Locale("en", country);
			allCountries.add(locale.getDisplayCountry());
//				System.out.print("\""+locale.getDisplayCountry()+"\", " ); // Prints all countries
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
}
