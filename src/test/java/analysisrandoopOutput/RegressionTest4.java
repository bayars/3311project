package analysisrandoopOutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

