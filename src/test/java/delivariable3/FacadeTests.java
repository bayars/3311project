package delivariable3;

import static org.junit.Assert.*;
import org.junit.Test;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import statsVisualiser.facade.Exclude;
import statsVisualiser.facade.ExcludeCountry;
import statsVisualiser.facade.ExcludeYears;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Vector;

public class FacadeTests {

	Exclude yearsExcluded = new ExcludeYears();
	Exclude countryExcluded = new ExcludeCountry();
	String[] countries = Locale.getISOCountries();
	Vector<String> allCountries = new Vector<String>();
	HashMap<String, ArrayList<String>> availableYearsforAnalysis = new HashMap<String, ArrayList<String>>();

	@Test
	public void testISOConverterforCountry() {
		Map<String, String> countries = new HashMap<>();
		for (String iso : Locale.getISOCountries()) {
			Locale l = new Locale("", iso);
		    countries.put(l.getDisplayCountry(), iso);
		}
		assertEquals(countryExcluded.ISOconverter(), countries);
	}

	@Test
	public void testISOConverterforYears() {
		assertEquals(yearsExcluded.ISOconverter(), null);
	}
	
	@Test
	public void testinitializeCountries() {
		for(int i = 0; i < countries.length; i++) { 	
			String country = countries[i];
			Locale locale = new Locale("en", country);
			allCountries.add(locale.getDisplayCountry());
		}	
		assertEquals(countryExcluded.initilizeCountries(), allCountries);
	}
	
	@Test
	public void testinitializeCountriesbyYears() {
		assertEquals(yearsExcluded.initilizeCountries(), null);
	}
	
	@Test
	public void checkIfFileExists() {
		File file = new File("./data.json");
		assertTrue(file.exists());
	}
	
	@Test
	public void findExcludedCountrybyCountry() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		allCountries = countryExcluded.initilizeCountries();
		JsonElement jelement = new JsonParser().parse(new FileReader("./data.json"));
		JsonObject jobject = jelement.getAsJsonObject();
		JsonArray jarray = jobject.getAsJsonArray("excludedlCountries");
		for(int k = 0;k<jarray.size();k++) {
			allCountries.remove(jarray.get(k).toString().replaceAll("\"", ""));
		}

		Vector<String> allCountriesTest = countryExcluded.findExcludedCountries(countryExcluded.initilizeCountries());
		assertEquals(allCountries.size(), allCountriesTest.size() );
	}
	
	@Test
	public void findExcludedCountrybyYears() {
		Vector<String> allCountriesTest = yearsExcluded.findExcludedCountries(countryExcluded.initilizeCountries());
		assertEquals(null, allCountriesTest );
	}
	
	@Test
	public void analysisTypebyCountry() {
		assertEquals(countryExcluded.analysisType(), null);
	}
	
	@Test
	public void analysisTypebyYears() {
		ArrayList<String> analysis = new ArrayList<>();
		analysis.add("Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");  
		analysis.add("Annual Percentage Change of PM2.5 Air Pollution and Forest Area");  
		analysis.add("CO2 Emissions Per GDP");  
		analysis.add("Average Forest Area");  
		analysis.add("Average Government Expenditure on Education");  
		analysis.add("Health Expenditure Per Hospital Beds");  
		analysis.add("Annual Percent Change of Expenditure on Education And Mortality Rate");  
		analysis.add("Annual Percent Change of Expenditure on Education And Health Expenditure");
		assertTrue(yearsExcluded.analysisType().containsAll(analysis));
	}
	
	@Test
	public void readJsonbyCountry() {
		assertEquals(countryExcluded.readJson(), null);
	}
	
	@Test
	public void readJsonbyYears() throws JsonIOException, JsonSyntaxException, FileNotFoundException {
		ArrayList<String> analysis = yearsExcluded.analysisType();
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
		assertEquals(yearsExcluded.readJson(), availableYearsforAnalysis);
	}
	private Vector<String> analyses = new Vector<String>();
	ArrayList<String> analysis = new ArrayList<>();
	String analysisNameExample = "Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution";


	private Vector<String> makeAnalyses(){
		analyses.add("Annual Percentage Change of CO2 Emissions, Energy Use and PM2.5 Air Pollution");  
		analyses.add("Annual Percentage Change of PM2.5 Air Pollution and Forest Area");  
		analyses.add("CO2 Emissions Per GDP");  
		analyses.add("Average Forest Area");  
		analyses.add("Average Government Expenditure on Education");  
		analyses.add("Health Expenditure Per Hospital Beds");  
		analyses.add("Annual Percent Change of Expenditure on Education And Mortality Rate");  
		analyses.add("Annual Percent Change of Expenditure on Education And Health Expenditure");  
		return analyses;
	}
	
	@Test
	public void excludeYearsbyCountry() {
		Vector<Integer> fromYears = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			fromYears.add(i);
		}

		assertEquals(countryExcluded.excludeYears(fromYears, yearsExcluded.readJson(),
			analysisNameExample, makeAnalyses()), null);
	}

	@Test
	public void excludeYearsbyYears() {
		Vector<Integer> fromYears = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			fromYears.add(i);
		}
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1972, 1973, 1974, 1975, 1976, 
				1977, 1978, 1979, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 
				2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 
				2017, 2018, 2019, 2020, 2021));
		Vector<Integer> answer = new Vector<Integer>();
		answer.addAll(numbers);
		assertEquals(yearsExcluded.excludeYears(fromYears, yearsExcluded.readJson(),
			analysisNameExample, makeAnalyses()), answer);
	}
	
	@Test
	public void removeExcludedYearsbyCountry() {
		Vector<Integer> fromYears = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			fromYears.add(i);
		}
		assertEquals(countryExcluded.removeExcludedYears(fromYears, yearsExcluded.readJson(),
				analysisNameExample, analyses), null);
	}
	
	
	@Test
	public void removeExcludedYearsbyYears() {
		Vector<Integer> fromYears = new Vector<Integer>();
		for(int i = 1972; i < 2022; i++) {
			fromYears.add(i);
		}
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1972, 1973, 1974, 1975, 1976, 1977, 1978,
				1979, 1994, 1995, 1996, 1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007,
				2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021));
		Vector<Integer> answer = new Vector<Integer>();
		answer.addAll(numbers);
		assertEquals(yearsExcluded.removeExcludedYears(fromYears, yearsExcluded.readJson(),
				analysisNameExample, analyses), answer);
	}
}
