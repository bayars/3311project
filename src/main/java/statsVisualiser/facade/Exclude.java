package statsVisualiser.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public interface Exclude {
	public Vector<String> excludeCountry(Vector<Integer> years, HashMap<String, ArrayList<String>> excludedList, String analysis);
	public Vector<Integer> excludeYears(Vector<Integer> fromandtoyears, HashMap<String, ArrayList<String>> excludedList, String analysis, Vector <String> analysisName);
	public HashMap<String, ArrayList<String>> readJson();
	public Map<String, String> ISOconverter();
	public Vector <String> initilizeCountries();
	public Vector <String> findExcludedCountries(Vector <String> allCountries);
	public ArrayList<String> analysisType();
	public Vector<Integer> removeExcludedYears(Vector<Integer> fromandtoyears, HashMap<String, ArrayList<String>> excludedList, String analysis, Vector <String> analysisName);
}
