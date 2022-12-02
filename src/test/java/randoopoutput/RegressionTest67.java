package randoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest67 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.util.List<java.lang.String> strList1 = analysis.Analysis.captions("");
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        analysis.Analysis analysis0 = new analysis.Analysis();
        java.lang.Class<?> wildcardClass1 = analysis0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.util.List<java.lang.String> strList1 = analysis.Analysis.captions("hi!");
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

