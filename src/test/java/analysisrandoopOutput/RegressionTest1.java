package analysisrandoopOutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 100, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 10, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) -1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 100, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) 'a', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '4', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) -1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 0, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '#', (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 0, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 0, 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) '4', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) '#', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 0, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (-1), (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) ' ', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) 'a', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '4', 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) 'a', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 0, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) '4', 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) ' ', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) -1, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 0, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (byte) 1, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (-1), 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 10, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 10, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) 10, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) ' ', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) ' ', (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 100, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (short) -1, (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) '#', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 100, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '4', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 100, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', 100, "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) 10, 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) 10, (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) 0, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (short) -1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (-1), (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) (byte) -1, (-1), "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 100, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) '#', (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (int) (short) 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, 100, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) 'a', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (short) -1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", (int) (byte) -1, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", (int) (byte) 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("", (int) '#', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.util.List<fetchers.DataSet> dataSetList4 = analysis.Analysis.getData("hi!", 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSetList4.getClass();
        org.junit.Assert.assertNotNull(dataSetList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("", 100, (-1), "");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        fetchers.PieDataSet pieDataSet4 = analysis.Analysis.getPieData("hi!", (-1), (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = pieDataSet4.getClass();
        org.junit.Assert.assertNotNull(pieDataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

