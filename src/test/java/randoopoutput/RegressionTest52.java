package randoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest52 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass3 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass6 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass14 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = graph10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(graph10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) 'a', (int) (byte) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        java.lang.Class<?> wildcardClass14 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = graph8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(graph8);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("hi!", (int) (byte) 100, 0, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = graph9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(graph9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("", (int) (short) 0, (int) (short) 1, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = graph19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph19);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass24 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        java.lang.Class<?> wildcardClass8 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass17 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass5 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        java.lang.Class<?> wildcardClass8 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        java.lang.Class<?> wildcardClass1 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) '4', (int) (short) -1, "", "");
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass8 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass10 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = graph21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        java.lang.Class<?> wildcardClass9 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass5 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = graph10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(graph10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", (int) (short) 10, (int) (short) 0, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(graph16);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        boolean boolean10 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("", (int) (short) 100, (int) ' ', "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(graph16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass7 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass17 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass10 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) '4', "", "");
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass9 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertNull(graph8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass17 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass17 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", 100, (-1), "", "hi!");
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph16);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass14 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (short) 0, 1, "", "");
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass25 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertNull(graph6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        boolean boolean16 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass17 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("", (-1), (int) (byte) 0, "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNull(graph19);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) 'a', (int) (byte) 0, "", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean7 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean6 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass11 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean13 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        boolean boolean15 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass16 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass20 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", 0, (int) (byte) 100, "", "");
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("", (int) (byte) 100, (int) (byte) -1, "hi!", "");
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph12);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = true;
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass15 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.isEmpty;
        boolean boolean9 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass12 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("", (int) (short) 0, 100, "", "");
        java.lang.Class<?> wildcardClass13 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass3 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        boolean boolean20 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", (int) (short) 10, (int) (short) 0, "hi!", "");
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(graph16);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("", (int) '#', 0, "", "");
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", (int) (byte) 10, (int) (short) -1, "", "hi!");
        statsVisualiser.graph.Graph graph36 = graphFactory0.createGraph("hi!", (int) (byte) -1, 1, "", "hi!");
        java.lang.Class<?> wildcardClass37 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(graph30);
        org.junit.Assert.assertNull(graph36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass12 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass15 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", 0, (int) (byte) 100, "", "");
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("", (int) (byte) 100, (int) (byte) -1, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = graph12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (byte) 0, "hi!", "");
        boolean boolean32 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph38 = graphFactory0.createGraph("", 1, (int) (byte) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(graph38);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean6 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("", (int) (short) 100, 0, "", "");
        java.lang.Class<?> wildcardClass10 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        boolean boolean9 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass7 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("hi!", 10, 0, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        boolean boolean9 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", (int) (short) 10, (int) (short) 0, "hi!", "");
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, (int) ' ', "", "hi!");
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass25 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(graph16);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("", 100, 1, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = graph9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", 0, (int) '#', "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNull(graph30);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass18 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", (int) (byte) 10, (int) (short) -1, "", "hi!");
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass33 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(graph30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        boolean boolean26 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph32 = graphFactory0.createGraph("", (int) (short) 0, 10, "", "hi!");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(graph32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean19 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", (int) (byte) -1, (int) (byte) -1, "", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = graph8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(graph8);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph17 = graphFactory0.createGraph("hi!", (-1), (-1), "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        boolean boolean26 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass27 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass12 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("", (int) (byte) 1, 0, "hi!", "");
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph12);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (short) -1, "", "");
        statsVisualiser.graph.Graph graph33 = graphFactory0.createGraph("hi!", 1, (int) (byte) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
        org.junit.Assert.assertNull(graph33);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        graphFactory0.isEmpty = false;
        boolean boolean11 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertNull(graph10);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass29 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = false;
        boolean boolean3 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass4 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        boolean boolean15 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass25 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        boolean boolean15 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.isEmpty;
        boolean boolean9 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean12 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean29 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = false;
        boolean boolean13 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        boolean boolean26 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean29 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass19 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass16 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        boolean boolean15 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph8 = graphFactory0.createGraph("hi!", 0, (int) ' ', "", "");
        graphFactory0.isEmpty = true;
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean12 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph18 = graphFactory0.createGraph("hi!", (int) ' ', (int) 'a', "", "");
        graphFactory0.isEmpty = true;
        boolean boolean21 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(graph18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (short) 1, 10, "", "hi!");
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("hi!", 1, (-1), "hi!", "");
        boolean boolean24 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean8 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        boolean boolean24 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("", (int) (short) 100, 0, "", "");
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        boolean boolean4 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean7 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("hi!", 1, (-1), "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (byte) 0, "hi!", "");
        boolean boolean32 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph38 = graphFactory0.createGraph("", (int) (short) 0, 1, "hi!", "hi!");
        boolean boolean39 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(graph38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        boolean boolean9 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        boolean boolean14 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass15 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertNull(graph10);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = false;
        boolean boolean3 = graphFactory0.isEmpty;
        boolean boolean4 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass7 = graphFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph17 = graphFactory0.createGraph("", (int) (short) 10, 1, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph17);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        boolean boolean18 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph24 = graphFactory0.createGraph("", (int) (byte) 0, (int) (byte) 1, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(graph24);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        boolean boolean7 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (-1), 1, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("", (int) (byte) -1, (int) (byte) 10, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass20 = graph19.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNull(graph19);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", 0, (int) (byte) 100, "", "");
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("hi!", (int) (byte) -1, (int) (short) -1, "hi!", "");
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertNull(graph6);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        boolean boolean18 = graphFactory0.isEmpty;
        boolean boolean19 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) '#', (int) (byte) 100, "", "hi!");
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("", (int) '#', 0, "", "");
        boolean boolean17 = graphFactory0.isEmpty;
        boolean boolean18 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean6 = graphFactory0.wrongAnalysisType;
        boolean boolean7 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (short) -1, "", "");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        boolean boolean26 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph11 = graphFactory0.createGraph("hi!", (int) '#', (-1), "hi!", "hi!");
        graphFactory0.wrongAnalysisType = true;
        boolean boolean14 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass15 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(graph11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("", (int) (byte) -1, (int) (byte) 10, "", "hi!");
        boolean boolean20 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNull(graph19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (short) 100, 0, "hi!", "hi!");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass18 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean13 = graphFactory0.isEmpty;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph34 = graphFactory0.createGraph("", (int) '#', (int) (byte) -1, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNull(graph34);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean12 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph18 = graphFactory0.createGraph("hi!", (int) ' ', (int) 'a', "", "");
        boolean boolean19 = graphFactory0.wrongAnalysisType;
        boolean boolean20 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(graph18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) '#', (int) (byte) 100, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = graph23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        java.lang.Class<?> wildcardClass14 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = false;
        boolean boolean3 = graphFactory0.isEmpty;
        boolean boolean4 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean8 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass9 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean8 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        java.lang.Class<?> wildcardClass11 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) '#', (int) (byte) 100, "", "hi!");
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass11 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", 10, 0, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = false;
        boolean boolean15 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        boolean boolean4 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) '#', (int) (byte) 100, "", "hi!");
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("", 100, 1, "hi!", "");
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", 100, (int) (byte) -1, "hi!", "");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph9);
        org.junit.Assert.assertNull(graph15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        boolean boolean18 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean17 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (short) -1, "", "");
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph34 = graphFactory0.createGraph("", 0, (int) (byte) 0, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(graph34);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        boolean boolean15 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass16 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean8 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("", 0, (-1), "", "hi!");
        java.lang.Class<?> wildcardClass17 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(graph16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("hi!", (int) (byte) 100, 0, "", "hi!");
        java.lang.Class<?> wildcardClass10 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(graph9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) '4', (int) (short) -1, "", "");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean17 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass18 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", 0, (int) ' ', "hi!", "");
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", (int) '4', (int) (short) 100, "", "");
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("", (int) (short) 0, 100, "", "");
        statsVisualiser.graph.Graph graph18 = graphFactory0.createGraph("", 0, (-1), "hi!", "");
        org.junit.Assert.assertNull(graph12);
        org.junit.Assert.assertNull(graph18);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        boolean boolean7 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean6 = graphFactory0.wrongAnalysisType;
        boolean boolean7 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) '4', "", "");
        graphFactory0.wrongAnalysisType = false;
        boolean boolean9 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("", (int) (byte) 0, 0, "hi!", "hi!");
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        boolean boolean9 = graphFactory0.isEmpty;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("", 100, 1, "hi!", "");
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("", (int) (byte) 1, 0, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph9);
        org.junit.Assert.assertNull(graph15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) (byte) 1, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("hi!", (int) (short) 1, (int) (short) 100, "hi!", "hi!");
        boolean boolean13 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.isEmpty = true;
        boolean boolean9 = graphFactory0.isEmpty;
        boolean boolean10 = graphFactory0.isEmpty;
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        boolean boolean6 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("hi!", (int) (byte) 100, 100, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNull(graph19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        boolean boolean15 = graphFactory0.isEmpty;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        boolean boolean18 = graphFactory0.wrongAnalysisType;
        boolean boolean19 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (short) 100, 0, "hi!", "hi!");
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (short) -1, "", "");
        graphFactory0.wrongAnalysisType = true;
        java.lang.Class<?> wildcardClass30 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (byte) 100, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) (short) -1, "", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertNull(graph31);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph24 = graphFactory0.createGraph("", (int) 'a', (int) (byte) 100, "hi!", "");
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph32 = graphFactory0.createGraph("hi!", (-1), (int) (byte) 100, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph24);
        org.junit.Assert.assertNull(graph32);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass29 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) '#', (int) ' ', "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(graph31);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", (int) (byte) 10, (int) (short) -1, "", "hi!");
        graphFactory0.wrongAnalysisType = true;
        boolean boolean33 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(graph30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("", (int) (short) 100, 0, "", "");
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", 1, (int) (byte) 10, "hi!", "");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("hi!", (int) (byte) 10, 100, "", "hi!");
        java.lang.Class<?> wildcardClass28 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.isEmpty;
        boolean boolean9 = graphFactory0.isEmpty;
        boolean boolean10 = graphFactory0.isEmpty;
        boolean boolean11 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph17 = graphFactory0.createGraph("", (int) (byte) 0, 1, "", "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(graph17);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (short) 0, 1, "", "");
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph32 = graphFactory0.createGraph("hi!", (int) (short) 10, (int) (short) 0, "hi!", "hi!");
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertNull(graph32);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean13 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("hi!", 0, 0, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(graph19);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean27 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph9 = graphFactory0.createGraph("hi!", (int) (short) 1, (int) (short) -1, "hi!", "hi!");
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph17 = graphFactory0.createGraph("", (int) (short) 10, 0, "", "hi!");
        boolean boolean18 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(graph9);
        org.junit.Assert.assertNull(graph17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = false;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass11 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (byte) 100, 10, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass28 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph14 = graphFactory0.createGraph("", (int) '4', (int) (byte) 0, "hi!", "");
        boolean boolean15 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("", 0, (int) (short) -1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph37 = graphFactory0.createGraph("", 100, 0, "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertNull(graph37);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", (int) (byte) 10, (int) (short) -1, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = graph30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(graph30);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (byte) 0, "hi!", "");
        boolean boolean32 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph38 = graphFactory0.createGraph("", (int) (short) 0, 1, "hi!", "hi!");
        boolean boolean39 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass40 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(graph38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) (short) 1, 100, "hi!", "");
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (byte) 0, 1, "hi!", "hi!");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("", (int) ' ', (int) ' ', "", "");
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        boolean boolean11 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) '4', "", "");
        graphFactory0.wrongAnalysisType = false;
        boolean boolean9 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("", (int) (short) 0, 0, "hi!", "hi!");
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(graph15);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph14 = graphFactory0.createGraph("", (int) '4', (int) (byte) 0, "hi!", "");
        boolean boolean15 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) (short) -1, (int) (short) -1, "hi!", "");
        statsVisualiser.graph.Graph graph27 = graphFactory0.createGraph("", 1, (int) (byte) 1, "", "");
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(graph21);
        org.junit.Assert.assertNull(graph27);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        boolean boolean18 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = false;
        boolean boolean21 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (short) 100, 0, "hi!", "hi!");
        boolean boolean24 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (byte) 100, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (short) -1, (int) (byte) 10, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        boolean boolean34 = graphFactory0.wrongAnalysisType;
        java.lang.Class<?> wildcardClass35 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        boolean boolean29 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        java.lang.Class<?> wildcardClass32 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (short) -1, (int) (short) 10, "hi!", "");
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (byte) 100, 10, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        boolean boolean25 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) (byte) 1, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", (int) (short) 1, (-1), "", "");
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph14 = graphFactory0.createGraph("", (int) '4', (int) (byte) 0, "hi!", "");
        graphFactory0.wrongAnalysisType = true;
        boolean boolean17 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (short) 10, 0, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", (int) (short) 10, (int) (short) 0, "hi!", "");
        boolean boolean17 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(graph16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 100, (int) (byte) -1, "", "");
        org.junit.Assert.assertNull(graph10);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("hi!", (int) 'a', (int) (byte) -1, "", "hi!");
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph21);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", 10, (int) (short) 10, "", "hi!");
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", 0, (int) (short) 100, "", "hi!");
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(graph16);
        org.junit.Assert.assertNull(graph22);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("", 0, (int) (byte) 100, "", "");
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("", (int) (byte) 100, (int) (byte) -1, "hi!", "");
        graphFactory0.wrongAnalysisType = true;
        boolean boolean15 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("hi!", (int) 'a', (int) (short) -1, "", "");
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertNull(graph12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(graph21);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (byte) 100, 10, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (byte) 1, 0, "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertNull(graph31);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertNull(graph10);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 10, (int) (short) 10, "hi!", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean13 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.isEmpty;
        boolean boolean9 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass10 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph17 = graphFactory0.createGraph("hi!", (int) (byte) 1, 10, "", "hi!");
        boolean boolean18 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        boolean boolean26 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass8 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) '#', (int) (byte) 100, "", "hi!");
        graphFactory0.wrongAnalysisType = false;
        java.lang.Class<?> wildcardClass26 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        boolean boolean28 = graphFactory0.wrongAnalysisType;
        boolean boolean29 = graphFactory0.isEmpty;
        boolean boolean30 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        boolean boolean10 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph16 = graphFactory0.createGraph("hi!", (int) (byte) -1, (int) (short) 1, "", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(graph16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (short) 100, 0, "hi!", "hi!");
        graphFactory0.wrongAnalysisType = false;
        boolean boolean26 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph32 = graphFactory0.createGraph("", (int) '#', (int) 'a', "", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(graph32);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        statsVisualiser.graph.Graph graph6 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) '4', "", "");
        graphFactory0.wrongAnalysisType = false;
        boolean boolean9 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("", (int) (byte) 0, 0, "hi!", "hi!");
        boolean boolean16 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) ' ', "hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = graphFactory0.getClass();
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) '#', (int) (byte) 100, "", "hi!");
        graphFactory0.wrongAnalysisType = false;
        boolean boolean26 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean14 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph20 = graphFactory0.createGraph("", (int) (short) 0, (int) (byte) 1, "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph20);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("", 0, (int) (short) -1, "hi!", "hi!");
        boolean boolean32 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph38 = graphFactory0.createGraph("", (int) (short) 10, (int) '#', "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(graph38);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph19 = graphFactory0.createGraph("", (int) (short) 0, (int) (short) 1, "", "");
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph19);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean12 = graphFactory0.isEmpty;
        java.lang.Class<?> wildcardClass13 = graphFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", (int) (byte) 10, (int) (short) -1, "", "hi!");
        graphFactory0.wrongAnalysisType = true;
        boolean boolean33 = graphFactory0.wrongAnalysisType;
        boolean boolean34 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(graph30);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("hi!", (int) (byte) -1, 10, "", "");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph31 = graphFactory0.createGraph("hi!", (int) (byte) 10, (int) (byte) 0, "hi!", "");
        boolean boolean32 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(graph31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph15 = graphFactory0.createGraph("hi!", (int) '#', (int) 'a', "", "");
        boolean boolean16 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.isEmpty = false;
        boolean boolean16 = graphFactory0.wrongAnalysisType;
        boolean boolean17 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph23 = graphFactory0.createGraph("", (int) (byte) 100, 1, "", "hi!");
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        boolean boolean25 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(graph23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 100, (int) 'a', "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean6 = graphFactory0.isEmpty;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        boolean boolean12 = graphFactory0.wrongAnalysisType;
        graphFactory0.isEmpty = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = false;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (short) 10, 1, "", "hi!");
        boolean boolean23 = graphFactory0.wrongAnalysisType;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph12 = graphFactory0.createGraph("hi!", (int) (short) 1, (int) (short) 100, "hi!", "hi!");
        statsVisualiser.graph.Graph graph18 = graphFactory0.createGraph("hi!", (int) (short) 0, 0, "hi!", "");
        org.junit.Assert.assertNull(graph12);
        org.junit.Assert.assertNull(graph18);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = false;
        graphFactory0.wrongAnalysisType = true;
        statsVisualiser.graph.Graph graph10 = graphFactory0.createGraph("", (int) (short) 0, (int) ' ', "hi!", "hi!");
        graphFactory0.isEmpty = false;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", 10, 0, "", "hi!");
        graphFactory0.isEmpty = false;
        boolean boolean25 = graphFactory0.isEmpty;
        boolean boolean26 = graphFactory0.isEmpty;
        org.junit.Assert.assertNull(graph10);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        boolean boolean8 = graphFactory0.wrongAnalysisType;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        boolean boolean23 = graphFactory0.isEmpty;
        boolean boolean24 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph30 = graphFactory0.createGraph("", (int) (byte) 10, (int) (short) -1, "", "hi!");
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(graph30);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        boolean boolean3 = graphFactory0.wrongAnalysisType;
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.isEmpty = true;
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("", (int) ' ', (int) ' ', "hi!", "hi!");
        graphFactory0.wrongAnalysisType = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(graph13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        statsVisualiser.graph.Graph graph22 = graphFactory0.createGraph("", (int) (byte) -1, 10, "hi!", "");
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(graph22);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.isEmpty = true;
        graphFactory0.wrongAnalysisType = false;
        graphFactory0.wrongAnalysisType = false;
        boolean boolean7 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        boolean boolean2 = graphFactory0.isEmpty;
        boolean boolean3 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = true;
        graphFactory0.isEmpty = false;
        boolean boolean8 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("hi!", (int) (short) 1, 0, "", "");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) (byte) 1, (int) (byte) 1, "hi!", "");
        graphFactory0.wrongAnalysisType = false;
        statsVisualiser.graph.Graph graph21 = graphFactory0.createGraph("", (int) 'a', (int) '4', "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertNull(graph21);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        graphFactory0.wrongAnalysisType = true;
        graphFactory0.wrongAnalysisType = true;
        boolean boolean5 = graphFactory0.isEmpty;
        graphFactory0.wrongAnalysisType = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        statsVisualiser.factory.GraphFactory graphFactory0 = new statsVisualiser.factory.GraphFactory();
        boolean boolean1 = graphFactory0.isEmpty;
        statsVisualiser.graph.Graph graph7 = graphFactory0.createGraph("", (-1), (int) '4', "", "hi!");
        statsVisualiser.graph.Graph graph13 = graphFactory0.createGraph("hi!", (int) 'a', (int) 'a', "hi!", "");
        boolean boolean14 = graphFactory0.isEmpty;
        graphFactory0.isEmpty = false;
        boolean boolean17 = graphFactory0.isEmpty;
        boolean boolean18 = graphFactory0.wrongAnalysisType;
        statsVisualiser.graph.Graph graph24 = graphFactory0.createGraph("hi!", (int) (short) 10, (int) (short) 1, "", "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(graph7);
        org.junit.Assert.assertNull(graph13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(graph24);
    }
}

