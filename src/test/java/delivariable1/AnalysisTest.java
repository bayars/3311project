package delivariable1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import analysis.Analysis;
import fetchers.DataSet;
import fetchers.PieDataSet;
import fetchers.Point;

class AnalysisTest {

	@Test
	public void Analysis1Test() throws Exception {
		java.util.List<DataSet> data = Analysis.getData("CA", 2013, 2014, "a1");

		DataSet setA1 = data.get(0);

		DataSet setA2 = new DataSet();
		Point p1 = new Point(2013.0, 0.66088205886719);
		setA2.addPoint(p1);
		Point p2 = new Point(2014.0, 0.07226167647251883);
		setA2.addPoint(p2);

		assertTrue(setA1.length() == setA2.length());

		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).x == setA2.p.get(i).x);
		}
		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).y == setA2.p.get(i).y);
		}

		DataSet setB1 = data.get(1);

		DataSet setB2 = new DataSet();
		Point p3 = new Point(2013.0, 0.13337046905228936);
		setB2.addPoint(p3);
		Point p4 = new Point(2014.0, 1.9903839328776405);
		setB2.addPoint(p4);

		assertTrue(setB1.length() == setB2.length());

		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).x == setB2.p.get(i).x);
		}
		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).y == setB2.p.get(i).y);
		}

		DataSet setC1 = data.get(2);

		DataSet setC2 = new DataSet();
		Point p5 = new Point(2013.0, -3.89488567794262);
		setC2.addPoint(p5);
		Point p6 = new Point(2014.0, -4.661617341617734);
		setC2.addPoint(p6);

		assertTrue(setC1.length() == setC2.length());

		for (int i = 0; i < setC1.length(); i++) {
			assertTrue(setC1.p.get(i).x == setC2.p.get(i).x);
		}
		for (int i = 0; i < setC1.length(); i++) {
			assertTrue(setC1.p.get(i).y == setC2.p.get(i).y);
		}

	}

	@Test
	public void Analysis2Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("CA", 2016, 2017, "a2");
		// System.out.println(data.size());

		DataSet setA1 = data.get(0);

		DataSet setA2 = new DataSet();
		Point p1 = new Point(2016.0, -8.424812456352997);
		setA2.addPoint(p1);
		Point p2 = new Point(2017.0, -1.8428806069182628);
		setA2.addPoint(p2);

		assertTrue(setA1.length() == setA2.length());

		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).x == setA2.p.get(i).x);
		}
		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).y == setA2.p.get(i).y);
		}

		DataSet setB1 = data.get(1);

		DataSet setB2 = new DataSet();
		Point p3 = new Point(2016.0, -0.011428465741217331);
		setB2.addPoint(p3);
		Point p4 = new Point(2017.0, -0.010657606903764372);
		setB2.addPoint(p4);

		assertTrue(setB1.length() == setB2.length());

		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).x == setB2.p.get(i).x);
		}
		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).y == setB2.p.get(i).y);
		}

	}

	@Test
	public void Analysis3Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("USA", 2010, 2016, "a3");

		DataSet set = data.get(0);

		DataSet set2 = new DataSet();
		Point p1 = new Point(2010.0, 0.00035830437923793954);
		set2.addPoint(p1);
		Point p2 = new Point(2011.0, 0.00033164681184593017);
		set2.addPoint(p2);
		Point p3 = new Point(2012.0, 0.00030491377667339343);
		set2.addPoint(p3);
		Point p4 = new Point(2013.0, 0.0003023239539213515);
		set2.addPoint(p4);
		Point p5 = new Point(2014.0, 0.0002909978365683765);
		set2.addPoint(p5);
		Point p6 = new Point(2015.0, 0.00027412415002353634);
		set2.addPoint(p6);
		Point p7 = new Point(2016.0, 0.00026180641780438767);
		set2.addPoint(p7);

		assertTrue(set.length() == set2.length());

		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).x == set2.p.get(i).x);
		}
		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).y == set2.p.get(i).y);
		}
	}

	@Test
	public void Analysis4Test() throws Exception {
		PieDataSet data = Analysis.getPieData("FR", 2005, 2020, "a4");

		PieDataSet set2 = new PieDataSet();
		set2.addSection(30.3158506785595);
		set2.addSection(100 - 30.3158506785595);

		for (int i = 0; i < data.length(); i++) {
			assertEquals(data.ds.get(0), set2.ds.get(0), 0.0);
		}
	}

	@Test
	public void Analysis5Test() throws Exception {

		PieDataSet data = Analysis.getPieData("CHN", 2008, 2008, "a5");

		PieDataSet set2 = new PieDataSet();

		set2.addSection(3.63000011444092);
		set2.addSection(100.0 - 3.63000011444092);

		for (int i = 0; i < data.length(); i++) {
			assertEquals(data.ds.get(0), set2.ds.get(0), 0.0);
		}

	}

	@Test
	public void Analysis6Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("CA", 2000, 2003, "a6");

		DataSet set = data.get(0);

		DataSet set2 = new DataSet();
		Point p1 = new Point(2000.0, 0.017356419169708138);
		set2.addPoint(p1);
		Point p2 = new Point(2001.0, 0.018030744017429327);
		set2.addPoint(p2);
		Point p3 = new Point(2002.0, 0.01891636366040299);
		set2.addPoint(p3);
		Point p4 = new Point(2003.0, 0.023140584385238725);
		set2.addPoint(p4);

		assertTrue(set.length() == set2.length());

		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).x == set2.p.get(i).x);
		}
		for (int i = 0; i < set.length(); i++) {
			assertTrue(set.p.get(i).y == set2.p.get(i).y);
		}
	}

	@Test
	public void Analysis8Test() throws Exception {

		java.util.List<DataSet> data = Analysis.getData("BRA", 2001, 2002, "a8");

		DataSet setA1 = data.get(0);

		DataSet setA2 = new DataSet();
		Point p1 = new Point(2001.0, -2.639954457561476);
		setA2.addPoint(p1);
		Point p2 = new Point(2002.0, -2.4530011211256713);
		setA2.addPoint(p2);

		assertTrue(setA1.length() == setA2.length());

		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).x == setA2.p.get(i).x);
		}
		for (int i = 0; i < setA1.length(); i++) {
			assertTrue(setA1.p.get(i).y == setA2.p.get(i).y);
		}

		DataSet setB1 = data.get(1);

		DataSet setB2 = new DataSet();
		Point p3 = new Point(2001.0, 2.5797720973728544);
		setB2.addPoint(p3);
		Point p4 = new Point(2002.0, 1.722314741621916);
		setB2.addPoint(p4);

		assertTrue(setB1.length() == setB2.length());

		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).x == setB2.p.get(i).x);
		}
		for (int i = 0; i < setB1.length(); i++) {
			assertTrue(setB1.p.get(i).y == setB2.p.get(i).y);
		}

	}

}
