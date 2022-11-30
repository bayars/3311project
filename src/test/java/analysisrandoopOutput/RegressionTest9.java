package analysisrandoopOutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        analysis.Ratio ratio0 = new analysis.Ratio();
        java.lang.Class<?> wildcardClass1 = ratio0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        analysis.Ratio ratio0 = new analysis.Ratio();
        fetchers.DataSet[] dataSetArray1 = new fetchers.DataSet[] {};
        java.util.ArrayList<fetchers.DataSet> dataSetList2 = new java.util.ArrayList<fetchers.DataSet>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<fetchers.DataSet>) dataSetList2, dataSetArray1);
        // The following exception was thrown during execution in test generation
        try {
            fetchers.DataSet dataSet4 = ratio0.getAnalyzedData((java.util.List<fetchers.DataSet>) dataSetList2);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dataSetArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        analysis.Ratio ratio0 = new analysis.Ratio();
        java.util.List<fetchers.DataSet> dataSetList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            fetchers.DataSet dataSet2 = ratio0.getAnalyzedData(dataSetList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.List.get(int)\" because \"dataSets\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

