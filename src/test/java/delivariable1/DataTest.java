package delivariable1;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


import fetchers.Data;
import fetchers.DataSet;
import fetchers.Point;

public class DataTest {
	
	/*
	 * Test makeURL to validate that it is creating a valid URL,
	 * later to be used to fetch data with
	 */
	@Test 
	public void validURL() throws Exception {
		String make = Data.makeURL("CAN", 2000, 2002, "SP.POP.TOTL");
		System.out.println(make);
		String URL = "http://api.worldbank.org/v2/country/CAN/indicator/SP.POP.TOTL?date=2000:2002&format=json";
		assertEquals(make, URL);
	}

	/*
	 * Test to validate that inputting years corresponds to the years 
	 * that are fetched from the WorldBank API
	 */
	@Test
	public void validXValues() throws Exception {

		DataSet set = Data.fetchData("CAN", 2000, 2002, "EN.ATM.CO2E.PC");
		DataSet set2 = new DataSet();
		
		Point p1 = new Point(2000.0, 0);
		Point p2 = new Point(2001.0, 0);
		Point p3 = new Point(2002.0, 0);

		set2.addPoint(p1);
		set2.addPoint(p2);
		set2.addPoint(p3);
		
		for (int i = 0; i < set.p.size(); i++) {
			assertEquals(set.p.get(i).x, set2.p.get(i).x, 0.0);
		}
	}
	
	/*
	 * Test to validate that Y values corresponding to the given years
	 * are correct and match the values on WorldBank API
	 */
	@Test
	public void validYValues() throws Exception {

		DataSet set = Data.fetchData("CAN", 2000, 2002, "SP.POP.TOTL");
		DataSet set2 = new DataSet();
		
		Point p1 = new Point(0, 30685730);
		Point p2 = new Point(0, 31020902);
		Point p3 = new Point(0, 31360079);

		set2.addPoint(p1);
		set2.addPoint(p2);
		set2.addPoint(p3);
		
		for (int i = 0; i < set.p.size(); i++) {
			assertEquals(set.p.get(i).y, set2.p.get(i).y, 0.0);
		}
	}
	
	/*
	 * Test to make sure the Point type has the correct values for x and y
	 */
	@Test
	public void validPoints() throws Exception {
		
		DataSet set = Data.fetchData("CAN", 2000, 2002, "SP.POP.TOTL");
		DataSet set2 = new DataSet();
		
		Point p1 = new Point(2000.0, 30685730);
		Point p2 = new Point(2001.0, 31020902);
		Point p3 = new Point(2002.0, 31360079);

		set2.addPoint(p1);
		set2.addPoint(p2);
		set2.addPoint(p3);
		
		for (int i = 0; i < set.p.size(); i++) {
			assertEquals(set.p.get(i).x, set2.p.get(i).x, 0.0);
			assertEquals(set.p.get(i).y, set2.p.get(i).y, 0.0);
		}
	}
	
	
}
