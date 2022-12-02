package graphrandoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) '#', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 100, "hi!");
        boolean boolean25 = reportGraph4.isEmpty("", (int) (byte) 10, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean42 = reportGraph32.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean62 = reportGraph47.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel68 = reportGraph67.panel;
        reportGraph47.panel = jPanel68;
        reportGraph32.panel = jPanel68;
        boolean boolean75 = reportGraph32.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        boolean boolean80 = reportGraph32.isEmpty("", (int) (byte) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph85 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean90 = reportGraph85.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel91 = reportGraph85.panel;
        javax.swing.JPanel jPanel92 = reportGraph85.panel;
        reportGraph32.panel = jPanel92;
        reportGraph4.panel = jPanel92;
        java.lang.Class<?> wildcardClass95 = jPanel92.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '4', "");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, 100, "hi!");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph14.panel = jPanel35;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph41.panel;
        reportGraph14.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph60.panel = jPanel71;
        reportGraph50.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        boolean boolean79 = reportGraph4.wrongAnalysisType("hi!", 1, (-1), "hi!");
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        boolean boolean85 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph9.panel = jPanel36;
        boolean boolean42 = reportGraph9.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph9.panel;
        javax.swing.JPanel jPanel44 = reportGraph9.panel;
        boolean boolean49 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        boolean boolean54 = reportGraph9.isEmpty("hi!", 1, 0, "hi!");
        javax.swing.JPanel jPanel55 = reportGraph9.panel;
        reportGraph4.panel = jPanel55;
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        javax.swing.JPanel jPanel58 = null;
        reportGraph4.panel = jPanel58;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 1, (int) (byte) 10, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", 100, (-1), "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) (short) -1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 10, "");
        javax.swing.JPanel jPanel31 = reportGraph30.panel;
        reportGraph20.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel31);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", (-1), (int) (short) 0, "");
        boolean boolean25 = reportGraph4.isEmpty("", (int) 'a', 1, "");
        boolean boolean30 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean39 = reportGraph34.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph24.panel = jPanel40;
        boolean boolean46 = reportGraph24.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel47 = reportGraph24.panel;
        reportGraph19.panel = jPanel47;
        reportGraph4.panel = jPanel47;
        boolean boolean54 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (short) 1, "hi!");
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        reportGraph4.panel = jPanel26;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean42 = reportGraph32.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        reportGraph47.panel = jPanel58;
        reportGraph32.panel = jPanel58;
        boolean boolean65 = reportGraph32.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel76 = reportGraph75.panel;
        javax.swing.JPanel jPanel77 = reportGraph75.panel;
        boolean boolean82 = reportGraph75.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel83 = reportGraph75.panel;
        javax.swing.JPanel jPanel84 = reportGraph75.panel;
        reportGraph70.panel = jPanel84;
        reportGraph32.panel = jPanel84;
        reportGraph4.panel = jPanel84;
        boolean boolean92 = reportGraph4.isEmpty("", 100, 100, "hi!");
        boolean boolean97 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 100, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "hi!");
        boolean boolean15 = reportGraph4.isEmpty("", (int) (byte) 10, 0, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean60 = reportGraph50.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph50.panel = jPanel71;
        reportGraph40.panel = jPanel71;
        reportGraph30.panel = jPanel71;
        reportGraph25.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph9.panel = jPanel30;
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        reportGraph9.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        javax.swing.JPanel jPanel40 = reportGraph4.panel;
        boolean boolean45 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        boolean boolean51 = reportGraph4.isEmpty("", (int) (byte) 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 1, "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (short) 1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph20.panel = jPanel36;
        boolean boolean42 = reportGraph20.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        boolean boolean47 = reportGraph20.wrongAnalysisType("", 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel48 = reportGraph20.panel;
        reportGraph9.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 100, "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean15 = reportGraph10.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel16 = reportGraph10.panel;
        boolean boolean21 = reportGraph10.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean46 = reportGraph36.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean66 = reportGraph51.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel72 = reportGraph71.panel;
        reportGraph51.panel = jPanel72;
        reportGraph36.panel = jPanel72;
        boolean boolean79 = reportGraph36.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph36.panel;
        reportGraph26.panel = jPanel80;
        javax.swing.JPanel jPanel82 = reportGraph26.panel;
        reportGraph10.panel = jPanel82;
        reportGraph4.panel = jPanel82;
        boolean boolean89 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 1, "");
        javax.swing.JPanel jPanel90 = reportGraph4.panel;
        boolean boolean95 = reportGraph4.isEmpty("hi!", 1, 100, "");
        javax.swing.JPanel jPanel96 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(jPanel96);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) 10, "hi!");
        boolean boolean47 = reportGraph4.isEmpty("", 100, (int) ' ', "");
        boolean boolean52 = reportGraph4.isEmpty("", (int) 'a', (int) 'a', "");
        java.lang.Class<?> wildcardClass53 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        boolean boolean22 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        boolean boolean58 = reportGraph47.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean63 = reportGraph47.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel64 = reportGraph47.panel;
        reportGraph37.panel = jPanel64;
        boolean boolean70 = reportGraph37.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean75 = reportGraph37.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel76 = reportGraph37.panel;
        reportGraph32.panel = jPanel76;
        reportGraph27.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        boolean boolean84 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) 'a', "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean46 = reportGraph36.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean66 = reportGraph51.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel72 = reportGraph71.panel;
        reportGraph51.panel = jPanel72;
        reportGraph36.panel = jPanel72;
        boolean boolean79 = reportGraph36.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph36.panel;
        reportGraph26.panel = jPanel80;
        reportGraph4.panel = jPanel80;
        javax.swing.JPanel jPanel83 = reportGraph4.panel;
        boolean boolean88 = reportGraph4.isEmpty("hi!", 10, (int) ' ', "");
        javax.swing.JPanel jPanel89 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(jPanel89);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean32 = reportGraph27.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean37 = reportGraph27.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean42 = reportGraph27.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel48 = reportGraph47.panel;
        reportGraph27.panel = jPanel48;
        reportGraph22.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        javax.swing.JPanel jPanel52 = reportGraph4.panel;
        boolean boolean57 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) -1, "hi!");
        boolean boolean62 = reportGraph4.isEmpty("", (int) ' ', (int) 'a', "hi!");
        javax.swing.JPanel jPanel63 = reportGraph4.panel;
        javax.swing.JPanel jPanel64 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass65 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 10, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, 0, "hi!");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 100, 0, "");
        boolean boolean24 = reportGraph4.isEmpty("", 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        boolean boolean36 = reportGraph29.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel47 = reportGraph41.panel;
        boolean boolean52 = reportGraph41.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean57 = reportGraph41.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel58 = reportGraph41.panel;
        reportGraph29.panel = jPanel58;
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean74 = reportGraph64.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean89 = reportGraph84.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph84.panel;
        reportGraph79.panel = jPanel90;
        reportGraph64.panel = jPanel90;
        javax.swing.JPanel jPanel93 = reportGraph64.panel;
        reportGraph29.panel = jPanel93;
        reportGraph4.panel = jPanel93;
        javax.swing.JPanel jPanel96 = reportGraph4.panel;
        javax.swing.JPanel jPanel97 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertNotNull(jPanel96);
        org.junit.Assert.assertNotNull(jPanel97);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean32 = reportGraph22.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean47 = reportGraph42.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph42.panel;
        reportGraph37.panel = jPanel48;
        reportGraph22.panel = jPanel48;
        boolean boolean55 = reportGraph22.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel56 = reportGraph22.panel;
        javax.swing.JPanel jPanel57 = reportGraph22.panel;
        reportGraph4.panel = jPanel57;
        java.lang.Class<?> wildcardClass59 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 0, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        reportGraph4.panel = jPanel11;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) 'a', "hi!");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (byte) 10, "");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) 100, "hi!");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph19.panel = jPanel40;
        reportGraph9.panel = jPanel40;
        javax.swing.JPanel jPanel43 = reportGraph9.panel;
        reportGraph4.panel = jPanel43;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean35 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        boolean boolean40 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel46 = reportGraph45.panel;
        boolean boolean51 = reportGraph45.isEmpty("", (int) (byte) 10, (int) (byte) -1, "hi!");
        boolean boolean56 = reportGraph45.isEmpty("hi!", 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel57 = reportGraph45.panel;
        reportGraph4.panel = jPanel57;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 10, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.isEmpty("", 10, 10, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        boolean boolean31 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        boolean boolean41 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        boolean boolean57 = reportGraph46.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean62 = reportGraph46.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel63 = reportGraph46.panel;
        boolean boolean68 = reportGraph46.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean73 = reportGraph46.isEmpty("", (int) (byte) 10, (int) '4', "hi!");
        javax.swing.JPanel jPanel74 = reportGraph46.panel;
        reportGraph4.panel = jPanel74;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jPanel74);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean15 = reportGraph10.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel16 = reportGraph10.panel;
        boolean boolean21 = reportGraph10.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean46 = reportGraph36.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean66 = reportGraph51.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel72 = reportGraph71.panel;
        reportGraph51.panel = jPanel72;
        reportGraph36.panel = jPanel72;
        boolean boolean79 = reportGraph36.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph36.panel;
        reportGraph26.panel = jPanel80;
        javax.swing.JPanel jPanel82 = reportGraph26.panel;
        reportGraph10.panel = jPanel82;
        reportGraph4.panel = jPanel82;
        boolean boolean89 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (short) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 10, "");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph15.panel = jPanel41;
        javax.swing.JPanel jPanel44 = reportGraph15.panel;
        reportGraph4.panel = jPanel44;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel57 = null;
        reportGraph4.panel = jPanel57;
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        boolean boolean64 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph4.panel = jPanel70;
        boolean boolean76 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, 0, "");
        boolean boolean81 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean46 = reportGraph31.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean66 = reportGraph61.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph51.panel = jPanel67;
        reportGraph31.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        boolean boolean75 = reportGraph4.isEmpty("", (int) '#', (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph80 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, 0, "");
        javax.swing.JPanel jPanel81 = reportGraph80.panel;
        reportGraph4.panel = jPanel81;
        javax.swing.JPanel jPanel83 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel83);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph30.panel = jPanel46;
        reportGraph9.panel = jPanel46;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean63 = reportGraph53.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel74 = reportGraph68.panel;
        reportGraph53.panel = jPanel74;
        reportGraph9.panel = jPanel74;
        reportGraph4.panel = jPanel74;
        java.lang.Class<?> wildcardClass78 = jPanel74.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean21 = reportGraph16.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel22 = reportGraph16.panel;
        boolean boolean27 = reportGraph16.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean32 = reportGraph16.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph16.panel;
        reportGraph4.panel = jPanel33;
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean49 = reportGraph39.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean64 = reportGraph59.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        reportGraph54.panel = jPanel65;
        reportGraph39.panel = jPanel65;
        javax.swing.JPanel jPanel68 = reportGraph39.panel;
        reportGraph4.panel = jPanel68;
        javax.swing.JPanel jPanel70 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass71 = jPanel70.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 10, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.isEmpty("", (int) (byte) 100, 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel17 = reportGraph9.panel;
        boolean boolean22 = reportGraph9.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean32 = reportGraph27.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean37 = reportGraph27.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean52 = reportGraph47.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph42.panel = jPanel53;
        reportGraph27.panel = jPanel53;
        boolean boolean60 = reportGraph27.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel61 = reportGraph27.panel;
        javax.swing.JPanel jPanel62 = reportGraph27.panel;
        reportGraph9.panel = jPanel62;
        reportGraph4.panel = jPanel62;
        boolean boolean69 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        boolean boolean74 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 1, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 10, "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) '#', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) 10, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) '#', (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean47 = reportGraph37.isEmpty("hi!", 100, 100, "");
        boolean boolean52 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel53 = reportGraph37.panel;
        reportGraph4.panel = jPanel53;
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 100, "hi!");
        boolean boolean64 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) '#', "");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph4.panel = jPanel70;
        javax.swing.JPanel jPanel72 = reportGraph4.panel;
        boolean boolean77 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel78 = null;
        reportGraph4.panel = jPanel78;
        boolean boolean84 = reportGraph4.isEmpty("", (int) (short) 10, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        boolean boolean51 = reportGraph4.isEmpty("hi!", (int) (short) 0, 0, "hi!");
        boolean boolean56 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (-1), "hi!");
        boolean boolean61 = reportGraph4.isEmpty("hi!", 0, (int) (short) -1, "");
        boolean boolean66 = reportGraph4.isEmpty("", (int) '4', 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 10, "hi!");
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        boolean boolean26 = reportGraph15.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean41 = reportGraph36.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        reportGraph31.panel = jPanel42;
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean63 = reportGraph58.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel64 = reportGraph58.panel;
        reportGraph48.panel = jPanel64;
        reportGraph31.panel = jPanel64;
        reportGraph15.panel = jPanel64;
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel73 = reportGraph72.panel;
        reportGraph15.panel = jPanel73;
        reportGraph4.panel = jPanel73;
        java.lang.Class<?> wildcardClass76 = jPanel73.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (short) 100, "hi!");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (short) 10, "");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph19.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        javax.swing.JPanel jPanel28 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel39 = reportGraph38.panel;
        javax.swing.JPanel jPanel40 = reportGraph38.panel;
        boolean boolean45 = reportGraph38.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel56 = reportGraph50.panel;
        boolean boolean61 = reportGraph50.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean66 = reportGraph50.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel67 = reportGraph50.panel;
        reportGraph38.panel = jPanel67;
        boolean boolean73 = reportGraph38.wrongAnalysisType("", 0, 1, "");
        boolean boolean78 = reportGraph38.isEmpty("hi!", 1, (int) (short) 1, "hi!");
        boolean boolean83 = reportGraph38.isEmpty("hi!", (int) 'a', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel84 = reportGraph38.panel;
        reportGraph33.panel = jPanel84;
        reportGraph4.panel = jPanel84;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jPanel84);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph14.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel56 = reportGraph55.panel;
        reportGraph4.panel = jPanel56;
        javax.swing.JPanel jPanel58 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.isEmpty("hi!", (int) '#', (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) -1, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass43 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel43 = reportGraph42.panel;
        reportGraph4.panel = jPanel43;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph15.panel = jPanel41;
        javax.swing.JPanel jPanel44 = reportGraph15.panel;
        reportGraph4.panel = jPanel44;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel57 = null;
        reportGraph4.panel = jPanel57;
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        boolean boolean64 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph4.panel = jPanel70;
        javax.swing.JPanel jPanel72 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(jPanel72);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), (int) (byte) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) ' ', "");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", 1, 1, "hi!");
        java.lang.Class<?> wildcardClass12 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 100, "");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean51 = reportGraph41.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph56 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean61 = reportGraph56.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel62 = reportGraph56.panel;
        reportGraph41.panel = jPanel62;
        reportGraph31.panel = jPanel62;
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph31.panel = jPanel70;
        boolean boolean76 = reportGraph31.isEmpty("", (-1), (int) (short) 0, "");
        javax.swing.JPanel jPanel77 = reportGraph31.panel;
        reportGraph4.panel = jPanel77;
        java.lang.Class<?> wildcardClass79 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph24.panel = jPanel35;
        javax.swing.JPanel jPanel37 = reportGraph24.panel;
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean62 = reportGraph47.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel68 = reportGraph67.panel;
        reportGraph47.panel = jPanel68;
        reportGraph42.panel = jPanel68;
        reportGraph24.panel = jPanel68;
        reportGraph19.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel68);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '4', 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph20.panel = jPanel41;
        boolean boolean47 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean52 = reportGraph20.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph20.panel;
        javax.swing.JPanel jPanel54 = reportGraph20.panel;
        reportGraph4.panel = jPanel54;
        boolean boolean60 = reportGraph4.wrongAnalysisType("hi!", 0, 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (byte) 100, "hi!");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph24.panel = jPanel40;
        boolean boolean46 = reportGraph24.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        boolean boolean51 = reportGraph24.wrongAnalysisType("", 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel52 = reportGraph24.panel;
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean72 = reportGraph62.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel73 = reportGraph62.panel;
        boolean boolean78 = reportGraph62.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        javax.swing.JPanel jPanel79 = reportGraph62.panel;
        reportGraph57.panel = jPanel79;
        reportGraph24.panel = jPanel79;
        reportGraph4.panel = jPanel79;
        java.lang.Class<?> wildcardClass83 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jPanel79);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 100, "hi!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 10, "");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) '#', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", 0, 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 10, "");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        statsVisualiser.graph.ReportGraph reportGraph11 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean16 = reportGraph11.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel17 = reportGraph11.panel;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean37 = reportGraph32.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel38 = reportGraph32.panel;
        reportGraph22.panel = jPanel38;
        reportGraph11.panel = jPanel38;
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        boolean boolean50 = reportGraph45.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean65 = reportGraph55.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel66 = reportGraph55.panel;
        reportGraph45.panel = jPanel66;
        reportGraph11.panel = jPanel66;
        javax.swing.JPanel jPanel69 = reportGraph11.panel;
        reportGraph4.panel = jPanel69;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNotNull(jPanel69);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (short) -1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) '4', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean46 = reportGraph31.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean66 = reportGraph61.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph51.panel = jPanel67;
        reportGraph31.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        javax.swing.JPanel jPanel71 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass72 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 100, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph14.panel = jPanel35;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph41.panel;
        reportGraph14.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        boolean boolean51 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean56 = reportGraph4.isEmpty("", (-1), (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass12 = jPanel11.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        boolean boolean21 = reportGraph14.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel22 = reportGraph14.panel;
        boolean boolean27 = reportGraph14.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel28 = reportGraph14.panel;
        reportGraph9.panel = jPanel28;
        reportGraph4.panel = jPanel28;
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        boolean boolean52 = reportGraph4.isEmpty("", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 100, "");
        boolean boolean62 = reportGraph4.isEmpty("", (int) ' ', (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 10, "");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 1, (int) (byte) 10, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 100, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph4.panel = jPanel23;
        boolean boolean29 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean35 = reportGraph25.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean40 = reportGraph25.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel46 = reportGraph45.panel;
        reportGraph25.panel = jPanel46;
        reportGraph20.panel = jPanel46;
        reportGraph4.panel = jPanel46;
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        javax.swing.JPanel jPanel19 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass20 = jPanel19.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertNotNull(jPanel19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        reportGraph24.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph47.panel = jPanel68;
        reportGraph37.panel = jPanel68;
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel76 = reportGraph75.panel;
        reportGraph37.panel = jPanel76;
        reportGraph24.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        boolean boolean85 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        boolean boolean90 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean40 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel41 = reportGraph24.panel;
        reportGraph14.panel = jPanel41;
        boolean boolean47 = reportGraph14.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph14.panel;
        javax.swing.JPanel jPanel49 = reportGraph14.panel;
        reportGraph4.panel = jPanel49;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel49);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        boolean boolean26 = reportGraph15.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        reportGraph31.panel = jPanel52;
        reportGraph15.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        boolean boolean60 = reportGraph4.isEmpty("hi!", (int) (short) 10, 10, "hi!");
        javax.swing.JPanel jPanel61 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", 0, 1, "");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph4.panel = jPanel67;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertNotNull(jPanel67);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = jPanel6.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "hi!");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (-1), "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) ' ', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) -1, "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (int) '#', "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", 0, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        boolean boolean51 = reportGraph4.isEmpty("hi!", (int) (short) 0, 0, "hi!");
        boolean boolean56 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (-1), "hi!");
        boolean boolean61 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 0, "hi!");
        javax.swing.JPanel jPanel62 = reportGraph4.panel;
        boolean boolean67 = reportGraph4.isEmpty("", (int) (short) 0, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        boolean boolean77 = reportGraph72.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
        boolean boolean82 = reportGraph72.isEmpty("", (int) 'a', (-1), "hi!");
        javax.swing.JPanel jPanel83 = reportGraph72.panel;
        reportGraph4.panel = jPanel83;
        statsVisualiser.graph.ReportGraph reportGraph89 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, 0, "");
        javax.swing.JPanel jPanel90 = reportGraph89.panel;
        reportGraph4.panel = jPanel90;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph24.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        javax.swing.JPanel jPanel38 = reportGraph9.panel;
        boolean boolean43 = reportGraph9.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        boolean boolean48 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean63 = reportGraph58.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel64 = reportGraph58.panel;
        reportGraph53.panel = jPanel64;
        reportGraph9.panel = jPanel64;
        boolean boolean71 = reportGraph9.isEmpty("", 100, (int) (short) 10, "hi!");
        boolean boolean76 = reportGraph9.wrongAnalysisType("", (int) ' ', (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel77 = reportGraph9.panel;
        reportGraph4.panel = jPanel77;
        boolean boolean83 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 100, "");
        javax.swing.JPanel jPanel84 = reportGraph4.panel;
        boolean boolean89 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 10, "hi!");
        boolean boolean94 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.isEmpty("", (int) '#', (int) (short) 1, "");
        boolean boolean61 = reportGraph4.wrongAnalysisType("", 0, (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, 0, "");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph4.panel = jPanel32;
        javax.swing.JPanel jPanel34 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel34);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean25 = reportGraph20.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean40 = reportGraph30.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean55 = reportGraph45.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean60 = reportGraph45.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel66 = reportGraph65.panel;
        reportGraph45.panel = jPanel66;
        reportGraph30.panel = jPanel66;
        boolean boolean73 = reportGraph30.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel74 = reportGraph30.panel;
        reportGraph20.panel = jPanel74;
        javax.swing.JPanel jPanel76 = reportGraph20.panel;
        reportGraph4.panel = jPanel76;
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean87 = reportGraph82.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel88 = reportGraph82.panel;
        reportGraph4.panel = jPanel88;
        boolean boolean94 = reportGraph4.wrongAnalysisType("hi!", 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean21 = reportGraph16.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel22 = reportGraph16.panel;
        boolean boolean27 = reportGraph16.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean32 = reportGraph16.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph16.panel;
        reportGraph4.panel = jPanel33;
        boolean boolean39 = reportGraph4.wrongAnalysisType("", 0, 1, "");
        javax.swing.JPanel jPanel40 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (short) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 0, "");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (short) -1, (int) '#', "");
        boolean boolean36 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (short) -1, (int) '4', "hi!");
        boolean boolean15 = reportGraph4.isEmpty("", 0, (-1), "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean24 = reportGraph14.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean29 = reportGraph14.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean34 = reportGraph14.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel35 = reportGraph14.panel;
        reportGraph4.panel = jPanel35;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph19.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        boolean boolean32 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 10, "hi!");
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean47 = reportGraph42.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean52 = reportGraph42.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean57 = reportGraph42.isEmpty("", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel58 = reportGraph42.panel;
        javax.swing.JPanel jPanel59 = reportGraph42.panel;
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph64.panel = jPanel70;
        reportGraph42.panel = jPanel70;
        reportGraph4.panel = jPanel70;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertNotNull(jPanel70);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) -1, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (short) 1, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph4.panel = jPanel32;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel39 = reportGraph38.panel;
        reportGraph4.panel = jPanel39;
        boolean boolean45 = reportGraph4.isEmpty("", (int) ' ', (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass47 = jPanel46.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean29 = reportGraph19.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph39.panel;
        reportGraph34.panel = jPanel45;
        reportGraph19.panel = jPanel45;
        javax.swing.JPanel jPanel48 = reportGraph19.panel;
        reportGraph14.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        javax.swing.JPanel jPanel51 = null;
        reportGraph4.panel = jPanel51;
        boolean boolean57 = reportGraph4.isEmpty("hi!", (int) '4', (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        javax.swing.JPanel jPanel28 = reportGraph4.panel;
        javax.swing.JPanel jPanel29 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (byte) 1, "");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel56 = reportGraph55.panel;
        reportGraph35.panel = jPanel56;
        reportGraph30.panel = jPanel56;
        reportGraph25.panel = jPanel56;
        reportGraph4.panel = jPanel56;
        boolean boolean65 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 10, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph19.panel = jPanel40;
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        reportGraph19.panel = jPanel47;
        reportGraph14.panel = jPanel47;
        javax.swing.JPanel jPanel50 = reportGraph14.panel;
        boolean boolean55 = reportGraph14.isEmpty("hi!", (-1), (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel56 = reportGraph14.panel;
        reportGraph4.panel = jPanel56;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jPanel56);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (int) 'a', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (byte) 0, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        boolean boolean41 = reportGraph30.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean66 = reportGraph61.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph46.panel = jPanel67;
        reportGraph30.panel = jPanel67;
        boolean boolean74 = reportGraph30.wrongAnalysisType("hi!", 0, (-1), "hi!");
        javax.swing.JPanel jPanel75 = reportGraph30.panel;
        boolean boolean80 = reportGraph30.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        javax.swing.JPanel jPanel81 = reportGraph30.panel;
        reportGraph4.panel = jPanel81;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", 100, (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean37 = reportGraph4.isEmpty("", (-1), (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) 'a', "");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean40 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel41 = reportGraph24.panel;
        reportGraph14.panel = jPanel41;
        boolean boolean47 = reportGraph14.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel48 = null;
        reportGraph14.panel = jPanel48;
        boolean boolean54 = reportGraph14.isEmpty("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean64 = reportGraph59.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean69 = reportGraph59.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph74 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean84 = reportGraph79.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel85 = reportGraph79.panel;
        reportGraph74.panel = jPanel85;
        reportGraph59.panel = jPanel85;
        javax.swing.JPanel jPanel88 = reportGraph59.panel;
        reportGraph14.panel = jPanel88;
        javax.swing.JPanel jPanel90 = reportGraph14.panel;
        reportGraph4.panel = jPanel90;
        boolean boolean96 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (-1), "");
        javax.swing.JPanel jPanel97 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(jPanel97);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (-1), (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 0, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (short) 10, (int) 'a', "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 1, 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph4.panel;
        boolean boolean53 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) '#', "hi!");
        boolean boolean58 = reportGraph4.isEmpty("hi!", 0, (int) (byte) -1, "hi!");
        boolean boolean63 = reportGraph4.isEmpty("", 1, (-1), "");
        java.lang.Class<?> wildcardClass64 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel28 = reportGraph27.panel;
        javax.swing.JPanel jPanel29 = reportGraph27.panel;
        boolean boolean34 = reportGraph27.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph27.panel;
        reportGraph4.panel = jPanel35;
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 100, "");
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        boolean boolean47 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        boolean boolean52 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        boolean boolean57 = reportGraph4.isEmpty("", (int) (short) 0, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph25.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean60 = reportGraph50.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean65 = reportGraph50.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel71 = reportGraph70.panel;
        reportGraph50.panel = jPanel71;
        reportGraph35.panel = jPanel71;
        boolean boolean78 = reportGraph35.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel79 = reportGraph35.panel;
        reportGraph25.panel = jPanel79;
        javax.swing.JPanel jPanel81 = reportGraph25.panel;
        reportGraph14.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        statsVisualiser.graph.ReportGraph reportGraph88 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        javax.swing.JPanel jPanel89 = reportGraph88.panel;
        reportGraph4.panel = jPanel89;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jPanel79);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel89);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '4', (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 100, (-1), "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean39 = reportGraph34.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph24.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean62 = reportGraph47.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel68 = reportGraph67.panel;
        reportGraph47.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        boolean boolean75 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (short) 1, "");
        boolean boolean80 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) ' ', "hi!");
        boolean boolean85 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.isEmpty("", (-1), (int) (short) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        java.lang.Class<?> wildcardClass33 = jPanel31.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph19.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        boolean boolean32 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) '#', (int) 'a', "");
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) '4', (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        boolean boolean36 = reportGraph31.isEmpty("", (-1), (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        javax.swing.JPanel jPanel48 = reportGraph46.panel;
        boolean boolean53 = reportGraph46.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel54 = reportGraph46.panel;
        javax.swing.JPanel jPanel55 = reportGraph46.panel;
        reportGraph41.panel = jPanel55;
        reportGraph31.panel = jPanel55;
        reportGraph4.panel = jPanel55;
        boolean boolean63 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean40 = reportGraph30.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel51 = reportGraph45.panel;
        reportGraph30.panel = jPanel51;
        reportGraph14.panel = jPanel51;
        boolean boolean58 = reportGraph14.wrongAnalysisType("hi!", 0, (-1), "hi!");
        javax.swing.JPanel jPanel59 = reportGraph14.panel;
        boolean boolean64 = reportGraph14.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        javax.swing.JPanel jPanel65 = reportGraph14.panel;
        reportGraph4.panel = jPanel65;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel50 = reportGraph49.panel;
        reportGraph29.panel = jPanel50;
        reportGraph14.panel = jPanel50;
        boolean boolean57 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph14.panel;
        reportGraph4.panel = jPanel58;
        boolean boolean64 = reportGraph4.isEmpty("", 100, (int) '4', "");
        boolean boolean69 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass70 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (short) -1, "hi!");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph29.panel;
        reportGraph9.panel = jPanel45;
        reportGraph4.panel = jPanel45;
        boolean boolean52 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) '#', "hi!");
        boolean boolean57 = reportGraph4.isEmpty("hi!", (int) (short) -1, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", (int) (byte) 10, (-1), "");
        java.lang.Class<?> wildcardClass18 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph15.panel = jPanel41;
        javax.swing.JPanel jPanel44 = reportGraph15.panel;
        reportGraph4.panel = jPanel44;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        boolean boolean55 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 0, "");
        boolean boolean60 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) -1, "hi!");
        boolean boolean65 = reportGraph4.isEmpty("", 0, (int) (short) 0, "");
        boolean boolean70 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel71 = reportGraph4.panel;
        boolean boolean76 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph9.panel = jPanel23;
        reportGraph4.panel = jPanel23;
        boolean boolean30 = reportGraph4.isEmpty("", (int) '4', (int) '4', "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "");
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass50 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean20 = reportGraph15.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel31 = reportGraph25.panel;
        boolean boolean36 = reportGraph25.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean41 = reportGraph25.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel42 = reportGraph25.panel;
        reportGraph15.panel = jPanel42;
        boolean boolean48 = reportGraph15.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean53 = reportGraph15.isEmpty("hi!", (int) ' ', (int) ' ', "hi!");
        javax.swing.JPanel jPanel54 = reportGraph15.panel;
        javax.swing.JPanel jPanel55 = reportGraph15.panel;
        reportGraph4.panel = jPanel55;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel55);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph29.panel;
        reportGraph9.panel = jPanel45;
        reportGraph4.panel = jPanel45;
        boolean boolean52 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 100, "");
        javax.swing.JPanel jPanel63 = reportGraph62.panel;
        reportGraph57.panel = jPanel63;
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean80 = reportGraph75.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean85 = reportGraph75.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel86 = reportGraph75.panel;
        reportGraph69.panel = jPanel86;
        reportGraph57.panel = jPanel86;
        reportGraph4.panel = jPanel86;
        javax.swing.JPanel jPanel90 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", (int) '#', 0, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph4.panel = jPanel32;
        java.lang.Class<?> wildcardClass34 = jPanel32.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, 0, "");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean46 = reportGraph36.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean66 = reportGraph51.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel72 = reportGraph71.panel;
        reportGraph51.panel = jPanel72;
        reportGraph36.panel = jPanel72;
        boolean boolean79 = reportGraph36.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph36.panel;
        reportGraph26.panel = jPanel80;
        reportGraph4.panel = jPanel80;
        boolean boolean87 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean30 = reportGraph20.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph35.panel = jPanel46;
        reportGraph20.panel = jPanel46;
        boolean boolean53 = reportGraph20.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel54 = reportGraph20.panel;
        javax.swing.JPanel jPanel55 = reportGraph20.panel;
        reportGraph4.panel = jPanel55;
        java.lang.Class<?> wildcardClass57 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        javax.swing.JPanel jPanel34 = reportGraph4.panel;
        javax.swing.JPanel jPanel35 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel41 = reportGraph40.panel;
        boolean boolean46 = reportGraph40.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel47 = reportGraph40.panel;
        boolean boolean52 = reportGraph40.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean57 = reportGraph40.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean62 = reportGraph40.isEmpty("hi!", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel63 = reportGraph40.panel;
        javax.swing.JPanel jPanel64 = reportGraph40.panel;
        reportGraph4.panel = jPanel64;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean39 = reportGraph34.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph24.panel = jPanel40;
        boolean boolean46 = reportGraph24.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel47 = reportGraph24.panel;
        reportGraph19.panel = jPanel47;
        reportGraph4.panel = jPanel47;
        boolean boolean54 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel55 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel55);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) -1, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) 100, "hi!");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (short) 1, "");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel47 = reportGraph41.panel;
        javax.swing.JPanel jPanel48 = reportGraph41.panel;
        reportGraph19.panel = jPanel48;
        javax.swing.JPanel jPanel50 = reportGraph19.panel;
        reportGraph14.panel = jPanel50;
        reportGraph4.panel = jPanel50;
        javax.swing.JPanel jPanel53 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass54 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph14.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (short) -1, (-1), "");
        boolean boolean42 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) ' ', "");
        boolean boolean54 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) '4', 1, "");
        javax.swing.JPanel jPanel60 = reportGraph59.panel;
        reportGraph4.panel = jPanel60;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel60);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph9.panel = jPanel15;
        reportGraph4.panel = jPanel15;
        boolean boolean22 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 100, "");
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (short) 1, 1, "");
        boolean boolean31 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean41 = reportGraph36.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        javax.swing.JPanel jPanel43 = reportGraph36.panel;
        reportGraph4.panel = jPanel43;
        java.lang.Class<?> wildcardClass45 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) 'a', "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", 1, (int) ' ', "");
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) '4', "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 100, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean46 = reportGraph31.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean66 = reportGraph61.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph51.panel = jPanel67;
        reportGraph31.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        boolean boolean75 = reportGraph4.isEmpty("", (int) '#', (int) '#', "");
        boolean boolean80 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = null;
        reportGraph4.panel = jPanel6;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "");
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel55 = reportGraph54.panel;
        reportGraph4.panel = jPanel55;
        java.lang.Class<?> wildcardClass57 = jPanel55.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 10, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        boolean boolean20 = reportGraph15.isEmpty("", (int) ' ', (-1), "");
        boolean boolean25 = reportGraph15.isEmpty("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel26 = reportGraph15.panel;
        reportGraph4.panel = jPanel26;
        java.lang.Class<?> wildcardClass28 = jPanel26.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        boolean boolean32 = reportGraph21.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph21.panel;
        javax.swing.JPanel jPanel34 = reportGraph21.panel;
        reportGraph4.panel = jPanel34;
        boolean boolean40 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, 0, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass42 = jPanel41.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", 0, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) 1, "");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean24 = reportGraph14.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean39 = reportGraph34.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph29.panel = jPanel40;
        reportGraph14.panel = jPanel40;
        javax.swing.JPanel jPanel43 = reportGraph14.panel;
        reportGraph9.panel = jPanel43;
        reportGraph4.panel = jPanel43;
        boolean boolean50 = reportGraph4.wrongAnalysisType("", (-1), (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 100, "hi!");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) -1, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        reportGraph21.panel = jPanel27;
        reportGraph4.panel = jPanel27;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel27);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) -1, "hi!");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph14.panel = jPanel35;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph41.panel;
        reportGraph14.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph60.panel = jPanel71;
        reportGraph50.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        boolean boolean79 = reportGraph4.wrongAnalysisType("hi!", 1, (-1), "hi!");
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        boolean boolean85 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) 0, "hi!");
        boolean boolean90 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean35 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        boolean boolean40 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph14.panel = jPanel35;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph41.panel;
        reportGraph14.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph60.panel = jPanel71;
        reportGraph50.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        boolean boolean79 = reportGraph4.isEmpty("", (int) ' ', 0, "hi!");
        boolean boolean84 = reportGraph4.wrongAnalysisType("", 1, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) -1, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, (int) (byte) 100, "");
        boolean boolean24 = reportGraph4.isEmpty("", 0, 0, "");
        boolean boolean29 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel30 = null;
        reportGraph4.panel = jPanel30;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) 'a', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph25.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        boolean boolean48 = reportGraph4.isEmpty("hi!", (int) (short) 0, (-1), "");
        boolean boolean53 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) ' ', "");
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        boolean boolean49 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 1, "hi!");
        boolean boolean54 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass55 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) ' ', "hi!");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        boolean boolean36 = reportGraph31.isEmpty("", (-1), (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        javax.swing.JPanel jPanel48 = reportGraph46.panel;
        boolean boolean53 = reportGraph46.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel54 = reportGraph46.panel;
        javax.swing.JPanel jPanel55 = reportGraph46.panel;
        reportGraph41.panel = jPanel55;
        reportGraph31.panel = jPanel55;
        reportGraph4.panel = jPanel55;
        java.lang.Class<?> wildcardClass59 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        javax.swing.JPanel jPanel13 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(jPanel13);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 100, "");
        boolean boolean14 = reportGraph9.isEmpty("", 100, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        boolean boolean25 = reportGraph19.isEmpty("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel26 = reportGraph19.panel;
        reportGraph9.panel = jPanel26;
        reportGraph4.panel = jPanel26;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 1, 0, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (-1), 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass38 = jPanel37.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 1, "");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) '4', (int) (short) 10, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        reportGraph31.panel = jPanel52;
        reportGraph21.panel = jPanel52;
        reportGraph16.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        boolean boolean61 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) 'a', "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 1, 0, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', 0, "");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass16 = jPanel15.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (-1), "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean15 = reportGraph10.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        reportGraph10.panel = jPanel26;
        boolean boolean32 = reportGraph10.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean47 = reportGraph37.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        reportGraph37.panel = jPanel58;
        reportGraph10.panel = jPanel58;
        boolean boolean65 = reportGraph10.wrongAnalysisType("", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel66 = reportGraph10.panel;
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean76 = reportGraph71.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean86 = reportGraph81.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel87 = reportGraph81.panel;
        reportGraph71.panel = jPanel87;
        reportGraph10.panel = jPanel87;
        boolean boolean94 = reportGraph10.wrongAnalysisType("", (int) 'a', (int) '4', "");
        javax.swing.JPanel jPanel95 = reportGraph10.panel;
        reportGraph4.panel = jPanel95;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean36 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) 'a', "hi!");
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) 10, "hi!");
        boolean boolean47 = reportGraph4.isEmpty("", (int) '#', (-1), "");
        boolean boolean52 = reportGraph4.isEmpty("", (int) '4', (int) '4', "");
        javax.swing.JPanel jPanel53 = null;
        reportGraph4.panel = jPanel53;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean21 = reportGraph16.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel22 = reportGraph16.panel;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean32 = reportGraph27.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean37 = reportGraph27.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean52 = reportGraph47.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph42.panel = jPanel53;
        reportGraph27.panel = jPanel53;
        javax.swing.JPanel jPanel56 = reportGraph27.panel;
        reportGraph16.panel = jPanel56;
        boolean boolean62 = reportGraph16.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph16.panel;
        reportGraph4.panel = jPanel63;
        boolean boolean69 = reportGraph4.isEmpty("", 1, (int) (short) 0, "");
        boolean boolean74 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel80 = reportGraph79.panel;
        boolean boolean85 = reportGraph79.isEmpty("", (int) ' ', (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel86 = reportGraph79.panel;
        reportGraph4.panel = jPanel86;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jPanel86);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) -1, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        javax.swing.JPanel jPanel8 = reportGraph4.panel;
        boolean boolean13 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph18 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean23 = reportGraph18.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean28 = reportGraph18.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean43 = reportGraph38.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel44 = reportGraph38.panel;
        reportGraph33.panel = jPanel44;
        reportGraph18.panel = jPanel44;
        boolean boolean51 = reportGraph18.isEmpty("hi!", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel52 = reportGraph18.panel;
        reportGraph4.panel = jPanel52;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean25 = reportGraph15.isEmpty("hi!", 100, 100, "");
        boolean boolean30 = reportGraph15.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel31 = reportGraph15.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (short) 0, (int) (byte) 100, "hi!");
        boolean boolean42 = reportGraph4.isEmpty("", 100, 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (byte) 1, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        boolean boolean35 = reportGraph29.wrongAnalysisType("hi!", 100, (int) (byte) 0, "hi!");
        boolean boolean40 = reportGraph29.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean60 = reportGraph50.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph50.panel = jPanel71;
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel78 = reportGraph77.panel;
        reportGraph50.panel = jPanel78;
        reportGraph45.panel = jPanel78;
        javax.swing.JPanel jPanel81 = reportGraph45.panel;
        boolean boolean86 = reportGraph45.isEmpty("hi!", (-1), (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel87 = reportGraph45.panel;
        reportGraph29.panel = jPanel87;
        reportGraph24.panel = jPanel87;
        reportGraph4.panel = jPanel87;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jPanel87);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 1, 0, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) ' ', "hi!");
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (-1), (-1), "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) 10, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "hi!");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (-1), "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        reportGraph4.panel = jPanel21;
        boolean boolean27 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) 0, "hi!");
        boolean boolean32 = reportGraph4.wrongAnalysisType("", 10, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel49 = reportGraph48.panel;
        reportGraph4.panel = jPanel49;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel49);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 100, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (short) 0, 10, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel47 = reportGraph41.panel;
        javax.swing.JPanel jPanel48 = reportGraph41.panel;
        reportGraph19.panel = jPanel48;
        javax.swing.JPanel jPanel50 = reportGraph19.panel;
        reportGraph14.panel = jPanel50;
        reportGraph4.panel = jPanel50;
        javax.swing.JPanel jPanel53 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        javax.swing.JPanel jPanel59 = reportGraph58.panel;
        reportGraph4.panel = jPanel59;
        boolean boolean65 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 0, 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean59 = reportGraph49.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean74 = reportGraph69.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph69.panel;
        reportGraph64.panel = jPanel75;
        reportGraph49.panel = jPanel75;
        javax.swing.JPanel jPanel78 = reportGraph49.panel;
        reportGraph4.panel = jPanel78;
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        javax.swing.JPanel jPanel81 = reportGraph4.panel;
        javax.swing.JPanel jPanel82 = reportGraph4.panel;
        javax.swing.JPanel jPanel83 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertNotNull(jPanel83);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        boolean boolean21 = reportGraph9.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean26 = reportGraph9.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean31 = reportGraph9.wrongAnalysisType("", 0, (-1), "hi!");
        javax.swing.JPanel jPanel32 = reportGraph9.panel;
        reportGraph4.panel = jPanel32;
        javax.swing.JPanel jPanel34 = reportGraph4.panel;
        boolean boolean39 = reportGraph4.isEmpty("hi!", (int) 'a', 10, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 1, "hi!");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        reportGraph4.panel = jPanel11;
        java.lang.Class<?> wildcardClass13 = jPanel11.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph14.panel = jPanel35;
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph41.panel;
        reportGraph14.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph60.panel = jPanel71;
        reportGraph50.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        boolean boolean79 = reportGraph4.wrongAnalysisType("hi!", 1, (-1), "hi!");
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph85 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '4', "hi!");
        boolean boolean90 = reportGraph85.isEmpty("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel91 = reportGraph85.panel;
        reportGraph4.panel = jPanel91;
        boolean boolean97 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) 'a', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) '4', "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) 10, "hi!");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        javax.swing.JPanel jPanel38 = reportGraph31.panel;
        reportGraph9.panel = jPanel38;
        reportGraph4.panel = jPanel38;
        javax.swing.JPanel jPanel41 = reportGraph4.panel;
        boolean boolean46 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 100, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '#', 10, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph4.panel = jPanel30;
        boolean boolean36 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 100, "hi!");
        boolean boolean41 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        boolean boolean12 = reportGraph4.isEmpty("", (int) ' ', (int) (short) 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph9.panel = jPanel30;
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        reportGraph9.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (-1), "hi!");
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 1, "");
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel56 = reportGraph55.panel;
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean66 = reportGraph61.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        boolean boolean72 = reportGraph61.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        javax.swing.JPanel jPanel78 = reportGraph77.panel;
        reportGraph61.panel = jPanel78;
        reportGraph55.panel = jPanel78;
        reportGraph4.panel = jPanel78;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel78);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", (-1), (int) (short) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", 10, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass27 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (byte) 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) '4', "");
        boolean boolean24 = reportGraph4.isEmpty("", (int) '#', 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (short) -1, 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) -1, "hi!");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean42 = reportGraph32.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph32.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean60 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass61 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '4', 1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 10, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph4.panel = jPanel32;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel39 = reportGraph38.panel;
        reportGraph4.panel = jPanel39;
        boolean boolean45 = reportGraph4.isEmpty("", 1, (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean40 = reportGraph30.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel51 = reportGraph45.panel;
        reportGraph30.panel = jPanel51;
        reportGraph20.panel = jPanel51;
        reportGraph15.panel = jPanel51;
        reportGraph4.panel = jPanel51;
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel56);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) (short) 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph4.panel = jPanel35;
        javax.swing.JPanel jPanel37 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) ' ', 0, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) '4', 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 0, 100, "");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        boolean boolean20 = reportGraph14.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph25.panel = jPanel36;
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        reportGraph42.panel = jPanel58;
        reportGraph25.panel = jPanel58;
        reportGraph14.panel = jPanel58;
        javax.swing.JPanel jPanel62 = reportGraph14.panel;
        reportGraph4.panel = jPanel62;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel62);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean47 = reportGraph37.isEmpty("hi!", 100, 100, "");
        boolean boolean52 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel53 = reportGraph37.panel;
        reportGraph4.panel = jPanel53;
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 100, "hi!");
        boolean boolean64 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) 1, "hi!");
        boolean boolean69 = reportGraph4.isEmpty("", 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel70 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass71 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph14.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 1, "");
        javax.swing.JPanel jPanel43 = reportGraph42.panel;
        reportGraph4.panel = jPanel43;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.isEmpty("", 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel50 = reportGraph49.panel;
        reportGraph29.panel = jPanel50;
        reportGraph14.panel = jPanel50;
        boolean boolean57 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph14.panel;
        reportGraph4.panel = jPanel58;
        boolean boolean64 = reportGraph4.isEmpty("", 100, (int) '4', "");
        boolean boolean69 = reportGraph4.isEmpty("", (int) '4', (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass70 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) 10, (int) '4', "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", 100, 1, "");
        boolean boolean41 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph20.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        boolean boolean48 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        boolean boolean53 = reportGraph4.isEmpty("", 0, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean63 = reportGraph58.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel64 = reportGraph58.panel;
        reportGraph4.panel = jPanel64;
        javax.swing.JPanel jPanel66 = reportGraph4.panel;
        boolean boolean71 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "hi!");
        boolean boolean76 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 100, "");
        boolean boolean15 = reportGraph4.isEmpty("", 1, 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '4', (int) (byte) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) -1, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (byte) 1, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        reportGraph47.panel = jPanel58;
        boolean boolean64 = reportGraph47.wrongAnalysisType("hi!", (-1), (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean74 = reportGraph69.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph69.panel;
        javax.swing.JPanel jPanel76 = reportGraph69.panel;
        reportGraph47.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertNotNull(jPanel76);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("hi!", 100, (int) (byte) 0, "hi!");
        boolean boolean20 = reportGraph9.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean40 = reportGraph30.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel51 = reportGraph45.panel;
        reportGraph30.panel = jPanel51;
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph57.panel;
        reportGraph30.panel = jPanel58;
        reportGraph25.panel = jPanel58;
        javax.swing.JPanel jPanel61 = reportGraph25.panel;
        boolean boolean66 = reportGraph25.isEmpty("hi!", (-1), (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph25.panel;
        reportGraph9.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        boolean boolean74 = reportGraph4.isEmpty("", (int) (short) -1, (int) 'a', "");
        javax.swing.JPanel jPanel75 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel75);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.isEmpty("", (int) '#', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass57 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        javax.swing.JPanel jPanel38 = reportGraph31.panel;
        reportGraph9.panel = jPanel38;
        reportGraph4.panel = jPanel38;
        boolean boolean45 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph16.panel = jPanel23;
        javax.swing.JPanel jPanel25 = reportGraph16.panel;
        reportGraph4.panel = jPanel25;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) 10, (int) '4', "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) '#', "hi!");
        boolean boolean41 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean40 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel41 = reportGraph24.panel;
        reportGraph14.panel = jPanel41;
        boolean boolean47 = reportGraph14.isEmpty("", 100, (int) (short) 10, "");
        boolean boolean52 = reportGraph14.isEmpty("", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel53 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean68 = reportGraph58.isEmpty("hi!", 100, 100, "");
        boolean boolean73 = reportGraph58.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel74 = reportGraph58.panel;
        reportGraph14.panel = jPanel74;
        reportGraph9.panel = jPanel74;
        boolean boolean81 = reportGraph9.isEmpty("", (-1), (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel82 = reportGraph9.panel;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '#', 10, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph4.panel = jPanel30;
        boolean boolean36 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 100, "hi!");
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass12 = jPanel11.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        boolean boolean45 = reportGraph34.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean60 = reportGraph55.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel61 = reportGraph55.panel;
        reportGraph50.panel = jPanel61;
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean72 = reportGraph67.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean82 = reportGraph77.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph77.panel;
        reportGraph67.panel = jPanel83;
        reportGraph50.panel = jPanel83;
        reportGraph34.panel = jPanel83;
        statsVisualiser.graph.ReportGraph reportGraph91 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel92 = reportGraph91.panel;
        reportGraph34.panel = jPanel92;
        reportGraph24.panel = jPanel92;
        reportGraph19.panel = jPanel92;
        reportGraph4.panel = jPanel92;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean20 = reportGraph15.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean35 = reportGraph25.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean50 = reportGraph40.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean55 = reportGraph40.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel61 = reportGraph60.panel;
        reportGraph40.panel = jPanel61;
        reportGraph25.panel = jPanel61;
        boolean boolean68 = reportGraph25.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel69 = reportGraph25.panel;
        reportGraph15.panel = jPanel69;
        javax.swing.JPanel jPanel71 = reportGraph15.panel;
        reportGraph4.panel = jPanel71;
        boolean boolean77 = reportGraph4.isEmpty("", (int) '4', 0, "");
        boolean boolean82 = reportGraph4.isEmpty("hi!", 0, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jPanel69);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph9.panel = jPanel30;
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        reportGraph9.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        javax.swing.JPanel jPanel40 = reportGraph4.panel;
        boolean boolean45 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 100, "hi!");
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", 10, (-1), "hi!");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph4.panel;
        boolean boolean53 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel60 = reportGraph59.panel;
        javax.swing.JPanel jPanel61 = reportGraph59.panel;
        reportGraph4.panel = jPanel61;
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean72 = reportGraph67.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel73 = reportGraph67.panel;
        reportGraph4.panel = jPanel73;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel73);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 10, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean25 = reportGraph15.isEmpty("hi!", 100, 100, "");
        boolean boolean30 = reportGraph15.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean35 = reportGraph15.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean40 = reportGraph15.isEmpty("", (int) ' ', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel56 = reportGraph50.panel;
        boolean boolean61 = reportGraph50.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean66 = reportGraph50.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel67 = reportGraph50.panel;
        reportGraph45.panel = jPanel67;
        reportGraph15.panel = jPanel67;
        statsVisualiser.graph.ReportGraph reportGraph74 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean79 = reportGraph74.isEmpty("", 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel80 = reportGraph74.panel;
        reportGraph15.panel = jPanel80;
        javax.swing.JPanel jPanel82 = reportGraph15.panel;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 1, (-1), "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass17 = jPanel16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) -1, "");
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) '#', "");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, 1, "");
        boolean boolean26 = reportGraph4.isEmpty("", 100, (int) ' ', "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 1, (int) (byte) 10, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 100, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        javax.swing.JPanel jPanel28 = reportGraph21.panel;
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean43 = reportGraph38.isEmpty("hi!", 0, (int) 'a', "hi!");
        javax.swing.JPanel jPanel44 = reportGraph38.panel;
        javax.swing.JPanel jPanel45 = reportGraph38.panel;
        reportGraph33.panel = jPanel45;
        reportGraph21.panel = jPanel45;
        reportGraph4.panel = jPanel45;
        boolean boolean53 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 10, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel43 = reportGraph42.panel;
        reportGraph4.panel = jPanel43;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (-1), (int) '#', "hi!");
        boolean boolean25 = reportGraph4.isEmpty("hi!", 1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        boolean boolean42 = reportGraph36.isEmpty("hi!", (int) (short) 10, (int) (short) 10, "");
        javax.swing.JPanel jPanel43 = reportGraph36.panel;
        reportGraph4.panel = jPanel43;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph17 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean22 = reportGraph17.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean27 = reportGraph17.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        reportGraph32.panel = jPanel43;
        reportGraph17.panel = jPanel43;
        boolean boolean50 = reportGraph17.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel51 = reportGraph17.panel;
        javax.swing.JPanel jPanel52 = reportGraph17.panel;
        reportGraph4.panel = jPanel52;
        boolean boolean58 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "hi!");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (-1), (int) '#', "hi!");
        boolean boolean25 = reportGraph4.isEmpty("hi!", 1, (int) ' ', "hi!");
        boolean boolean30 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 1, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, 1, "hi!");
        boolean boolean41 = reportGraph4.wrongAnalysisType("", 0, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (-1), "hi!");
        javax.swing.JPanel jPanel15 = null;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("", (int) (short) 0, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        boolean boolean31 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        boolean boolean41 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) 'a', "");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        javax.swing.JPanel jPanel48 = reportGraph46.panel;
        reportGraph4.panel = jPanel48;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 0, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) '4', 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        boolean boolean46 = reportGraph35.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean71 = reportGraph66.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel72 = reportGraph66.panel;
        reportGraph51.panel = jPanel72;
        reportGraph35.panel = jPanel72;
        reportGraph24.panel = jPanel72;
        boolean boolean80 = reportGraph24.isEmpty("hi!", (int) (short) 10, 10, "hi!");
        boolean boolean85 = reportGraph24.wrongAnalysisType("hi!", 0, (int) (byte) -1, "");
        javax.swing.JPanel jPanel86 = reportGraph24.panel;
        reportGraph4.panel = jPanel86;
        java.lang.Class<?> wildcardClass88 = jPanel86.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) '4', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph14.panel;
        javax.swing.JPanel jPanel27 = reportGraph14.panel;
        reportGraph4.panel = jPanel27;
        javax.swing.JPanel jPanel29 = reportGraph4.panel;
        boolean boolean34 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", 100, 100, "");
        boolean boolean24 = reportGraph9.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean29 = reportGraph9.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean34 = reportGraph9.isEmpty("", (int) ' ', (int) (byte) 10, "");
        javax.swing.JPanel jPanel35 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel41 = reportGraph40.panel;
        javax.swing.JPanel jPanel42 = reportGraph40.panel;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        boolean boolean49 = reportGraph4.isEmpty("", (int) 'a', 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) 'a', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        javax.swing.JPanel jPanel22 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean42 = reportGraph32.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean47 = reportGraph32.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel53 = reportGraph52.panel;
        reportGraph32.panel = jPanel53;
        reportGraph27.panel = jPanel53;
        reportGraph9.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean62 = reportGraph4.isEmpty("", 100, 100, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph4.panel;
        javax.swing.JPanel jPanel64 = reportGraph4.panel;
        boolean boolean69 = reportGraph4.wrongAnalysisType("", (int) '#', (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) 'a', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph24.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        javax.swing.JPanel jPanel38 = reportGraph9.panel;
        boolean boolean43 = reportGraph9.wrongAnalysisType("", (int) (short) 100, (int) 'a', "hi!");
        javax.swing.JPanel jPanel44 = reportGraph9.panel;
        reportGraph4.panel = jPanel44;
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(jPanel46);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph20.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        boolean boolean48 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 100, "");
        boolean boolean53 = reportGraph4.wrongAnalysisType("", 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass54 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 10, "");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (byte) 0, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) 'a', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        javax.swing.JPanel jPanel41 = reportGraph39.panel;
        boolean boolean46 = reportGraph39.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel52 = reportGraph51.panel;
        javax.swing.JPanel jPanel53 = reportGraph51.panel;
        reportGraph39.panel = jPanel53;
        reportGraph34.panel = jPanel53;
        javax.swing.JPanel jPanel56 = reportGraph34.panel;
        reportGraph29.panel = jPanel56;
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        boolean boolean73 = reportGraph62.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph78 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean83 = reportGraph78.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel84 = reportGraph78.panel;
        boolean boolean89 = reportGraph78.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean94 = reportGraph78.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel95 = reportGraph78.panel;
        reportGraph62.panel = jPanel95;
        reportGraph29.panel = jPanel95;
        reportGraph4.panel = jPanel95;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (short) 1, 10, "hi!");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean58 = reportGraph53.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel59 = reportGraph53.panel;
        reportGraph48.panel = jPanel59;
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean80 = reportGraph75.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel81 = reportGraph75.panel;
        reportGraph65.panel = jPanel81;
        reportGraph48.panel = jPanel81;
        boolean boolean88 = reportGraph48.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel89 = reportGraph48.panel;
        javax.swing.JPanel jPanel90 = reportGraph48.panel;
        reportGraph4.panel = jPanel90;
        boolean boolean96 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel44);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph15.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (short) 1, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel35 = reportGraph24.panel;
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean45 = reportGraph40.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph24.panel = jPanel46;
        reportGraph14.panel = jPanel46;
        reportGraph9.panel = jPanel46;
        reportGraph4.panel = jPanel46;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, 0, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass23 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean24 = reportGraph14.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean39 = reportGraph34.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph29.panel = jPanel40;
        reportGraph14.panel = jPanel40;
        boolean boolean47 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean62 = reportGraph57.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean72 = reportGraph67.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean77 = reportGraph67.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean87 = reportGraph82.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel88 = reportGraph82.panel;
        reportGraph67.panel = jPanel88;
        reportGraph57.panel = jPanel88;
        reportGraph52.panel = jPanel88;
        reportGraph14.panel = jPanel88;
        reportGraph4.panel = jPanel88;
        boolean boolean98 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 0, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph9.panel = jPanel36;
        boolean boolean42 = reportGraph9.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel43 = null;
        reportGraph9.panel = jPanel43;
        boolean boolean49 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph59.panel;
        reportGraph54.panel = jPanel60;
        reportGraph9.panel = jPanel60;
        reportGraph4.panel = jPanel60;
        boolean boolean68 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (short) -1, "");
        boolean boolean20 = reportGraph4.isEmpty("hi!", (int) 'a', (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 1, 10, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (short) -1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph9.panel = jPanel36;
        boolean boolean42 = reportGraph9.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph9.panel;
        javax.swing.JPanel jPanel44 = reportGraph9.panel;
        boolean boolean49 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        boolean boolean54 = reportGraph9.wrongAnalysisType("", (int) '4', (int) '#', "");
        javax.swing.JPanel jPanel55 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean65 = reportGraph60.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean70 = reportGraph60.isEmpty("hi!", 100, 100, "");
        boolean boolean75 = reportGraph60.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel76 = reportGraph60.panel;
        javax.swing.JPanel jPanel77 = reportGraph60.panel;
        reportGraph9.panel = jPanel77;
        reportGraph4.panel = jPanel77;
        java.lang.Class<?> wildcardClass80 = jPanel77.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        reportGraph24.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph47.panel = jPanel68;
        reportGraph37.panel = jPanel68;
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel76 = reportGraph75.panel;
        reportGraph37.panel = jPanel76;
        reportGraph24.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        boolean boolean85 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        boolean boolean90 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph30.panel = jPanel46;
        reportGraph9.panel = jPanel46;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean63 = reportGraph53.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel74 = reportGraph68.panel;
        reportGraph53.panel = jPanel74;
        reportGraph9.panel = jPanel74;
        reportGraph4.panel = jPanel74;
        boolean boolean82 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        boolean boolean21 = reportGraph9.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean26 = reportGraph9.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean31 = reportGraph9.wrongAnalysisType("", 0, (-1), "hi!");
        javax.swing.JPanel jPanel32 = reportGraph9.panel;
        reportGraph4.panel = jPanel32;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean43 = reportGraph38.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean53 = reportGraph48.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean68 = reportGraph58.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean78 = reportGraph73.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel79 = reportGraph73.panel;
        reportGraph58.panel = jPanel79;
        reportGraph48.panel = jPanel79;
        reportGraph38.panel = jPanel79;
        reportGraph4.panel = jPanel79;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jPanel79);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        reportGraph10.panel = jPanel21;
        javax.swing.JPanel jPanel23 = reportGraph10.panel;
        statsVisualiser.graph.ReportGraph reportGraph28 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean38 = reportGraph33.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean43 = reportGraph33.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean48 = reportGraph33.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel54 = reportGraph53.panel;
        reportGraph33.panel = jPanel54;
        reportGraph28.panel = jPanel54;
        reportGraph10.panel = jPanel54;
        reportGraph4.panel = jPanel54;
        boolean boolean63 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (byte) 10, "");
        boolean boolean15 = reportGraph4.isEmpty("", (int) (byte) 1, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        javax.swing.JPanel jPanel27 = reportGraph20.panel;
        reportGraph4.panel = jPanel27;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean29 = reportGraph14.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph14.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        java.lang.Class<?> wildcardClass39 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 10, "");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel25 = reportGraph14.panel;
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel33);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (byte) -1, "");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        boolean boolean46 = reportGraph35.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean51 = reportGraph35.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel52 = reportGraph35.panel;
        reportGraph25.panel = jPanel52;
        reportGraph9.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel56);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (byte) 100, 1, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (short) -1, "hi!");
        boolean boolean26 = reportGraph4.isEmpty("", (int) (byte) 0, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) (byte) 100, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 1, "");
        boolean boolean30 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) ' ', "");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(jPanel51);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean35 = reportGraph30.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean50 = reportGraph40.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean65 = reportGraph55.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean70 = reportGraph55.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel76 = reportGraph75.panel;
        reportGraph55.panel = jPanel76;
        reportGraph40.panel = jPanel76;
        boolean boolean83 = reportGraph40.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel84 = reportGraph40.panel;
        reportGraph30.panel = jPanel84;
        javax.swing.JPanel jPanel86 = reportGraph30.panel;
        reportGraph19.panel = jPanel86;
        reportGraph14.panel = jPanel86;
        reportGraph4.panel = jPanel86;
        javax.swing.JPanel jPanel90 = reportGraph4.panel;
        javax.swing.JPanel jPanel91 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(jPanel91);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 100, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 100, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        reportGraph4.panel = jPanel21;
        boolean boolean27 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean25 = reportGraph15.isEmpty("hi!", 100, 100, "");
        boolean boolean30 = reportGraph15.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel31 = reportGraph15.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (short) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass39 = jPanel38.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) ' ', "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        boolean boolean16 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (short) -1, "");
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        boolean boolean46 = reportGraph35.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean51 = reportGraph35.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel52 = reportGraph35.panel;
        reportGraph25.panel = jPanel52;
        boolean boolean58 = reportGraph25.isEmpty("", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel64 = reportGraph63.panel;
        reportGraph25.panel = jPanel64;
        reportGraph19.panel = jPanel64;
        reportGraph4.panel = jPanel64;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph9.panel;
        reportGraph4.panel = jPanel25;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean41 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(jPanel43);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "");
        boolean boolean19 = reportGraph14.isEmpty("hi!", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel50 = reportGraph49.panel;
        reportGraph29.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        boolean boolean57 = reportGraph24.isEmpty("", (int) (short) 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph24.panel;
        reportGraph14.panel = jPanel58;
        reportGraph4.panel = jPanel58;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph15.panel = jPanel41;
        javax.swing.JPanel jPanel44 = reportGraph15.panel;
        reportGraph4.panel = jPanel44;
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        boolean boolean62 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 0, "hi!");
        boolean boolean67 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        boolean boolean51 = reportGraph4.isEmpty("hi!", (int) (short) 0, 0, "hi!");
        boolean boolean56 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (-1), "hi!");
        boolean boolean61 = reportGraph4.isEmpty("hi!", 0, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, 1, "");
        boolean boolean71 = reportGraph66.wrongAnalysisType("", (int) (short) 0, (-1), "hi!");
        boolean boolean76 = reportGraph66.isEmpty("", (int) (byte) 100, (int) '#', "hi!");
        javax.swing.JPanel jPanel77 = reportGraph66.panel;
        reportGraph4.panel = jPanel77;
        java.lang.Class<?> wildcardClass79 = jPanel77.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '4', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) '#', "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) -1, "");
        boolean boolean15 = reportGraph4.isEmpty("", 0, (int) (byte) -1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean59 = reportGraph49.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean74 = reportGraph69.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph69.panel;
        reportGraph64.panel = jPanel75;
        reportGraph49.panel = jPanel75;
        javax.swing.JPanel jPanel78 = reportGraph49.panel;
        reportGraph4.panel = jPanel78;
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        javax.swing.JPanel jPanel81 = reportGraph4.panel;
        boolean boolean86 = reportGraph4.isEmpty("", 0, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph25.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean50 = reportGraph45.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph45.panel;
        reportGraph35.panel = jPanel51;
        reportGraph25.panel = jPanel51;
        reportGraph4.panel = jPanel51;
        boolean boolean59 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean52 = reportGraph42.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean67 = reportGraph62.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph57.panel = jPanel68;
        reportGraph42.panel = jPanel68;
        javax.swing.JPanel jPanel71 = reportGraph42.panel;
        reportGraph4.panel = jPanel71;
        boolean boolean77 = reportGraph4.isEmpty("", (int) (byte) 0, 1, "hi!");
        boolean boolean82 = reportGraph4.isEmpty("", (int) '4', (int) (byte) 100, "");
        javax.swing.JPanel jPanel83 = reportGraph4.panel;
        javax.swing.JPanel jPanel84 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass85 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 0, "hi!");
        boolean boolean42 = reportGraph4.isEmpty("hi!", (int) '#', 0, "");
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", 1, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) 10, "hi!");
        boolean boolean47 = reportGraph4.isEmpty("", (int) '#', (-1), "");
        boolean boolean52 = reportGraph4.isEmpty("", (int) (short) -1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass53 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 100, 0, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) -1, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) 'a', 1, "hi!");
        boolean boolean29 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel50 = reportGraph49.panel;
        reportGraph29.panel = jPanel50;
        reportGraph14.panel = jPanel50;
        boolean boolean57 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph14.panel;
        reportGraph4.panel = jPanel58;
        boolean boolean64 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 100, "");
        javax.swing.JPanel jPanel65 = reportGraph4.panel;
        boolean boolean70 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel71 = reportGraph4.panel;
        javax.swing.JPanel jPanel72 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass73 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (short) -1, "");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        reportGraph14.panel = jPanel21;
        reportGraph4.panel = jPanel21;
        boolean boolean28 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '#', (int) '#', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) -1, "");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) -1, (-1), "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass26 = jPanel25.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) -1, "hi!");
        boolean boolean15 = reportGraph4.isEmpty("hi!", 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (short) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean42 = reportGraph32.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph32.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean60 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) 1, "hi!");
        boolean boolean65 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) ' ', "");
        boolean boolean70 = reportGraph4.wrongAnalysisType("hi!", (-1), 10, "hi!");
        java.lang.Class<?> wildcardClass71 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", 1, (int) '#', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel17 = reportGraph9.panel;
        javax.swing.JPanel jPanel18 = reportGraph9.panel;
        reportGraph4.panel = jPanel18;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(jPanel18);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean25 = reportGraph9.wrongAnalysisType("", (int) (short) 10, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "");
        javax.swing.JPanel jPanel31 = reportGraph30.panel;
        reportGraph9.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel31);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 1, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass25 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph4.panel = jPanel36;
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.isEmpty("", (int) '4', 0, "");
        java.lang.Class<?> wildcardClass44 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean29 = reportGraph14.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph14.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        boolean boolean44 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) -1, "hi!");
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean39 = reportGraph29.isEmpty("hi!", 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean49 = reportGraph44.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean59 = reportGraph54.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel60 = reportGraph54.panel;
        boolean boolean65 = reportGraph54.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean70 = reportGraph54.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel71 = reportGraph54.panel;
        reportGraph44.panel = jPanel71;
        reportGraph29.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        boolean boolean79 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) ' ', "");
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        javax.swing.JPanel jPanel81 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) -1, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (byte) 1, (-1), "");
        boolean boolean47 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 100, "");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) '#', "");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean25 = reportGraph15.isEmpty("hi!", 100, 100, "");
        boolean boolean30 = reportGraph15.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel31 = reportGraph15.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass39 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 100, "hi!");
        boolean boolean21 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 0, (-1), "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) 0, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 0, 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 10, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 1, "");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        java.lang.Class<?> wildcardClass27 = jPanel25.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean24 = reportGraph14.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean39 = reportGraph34.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph29.panel = jPanel40;
        reportGraph14.panel = jPanel40;
        boolean boolean47 = reportGraph14.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        boolean boolean63 = reportGraph52.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean78 = reportGraph68.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph83 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean88 = reportGraph83.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel89 = reportGraph83.panel;
        reportGraph68.panel = jPanel89;
        reportGraph52.panel = jPanel89;
        reportGraph14.panel = jPanel89;
        reportGraph9.panel = jPanel89;
        reportGraph4.panel = jPanel89;
        java.lang.Class<?> wildcardClass95 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (-1), (-1), "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 1, "");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel56 = reportGraph55.panel;
        reportGraph35.panel = jPanel56;
        reportGraph30.panel = jPanel56;
        reportGraph25.panel = jPanel56;
        reportGraph9.panel = jPanel56;
        reportGraph4.panel = jPanel56;
        boolean boolean66 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) '4', (int) 'a', "");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass22 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (int) 'a', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '4', (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel38 = null;
        reportGraph4.panel = jPanel38;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        boolean boolean49 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) ' ', "");
        boolean boolean54 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel55 = reportGraph4.panel;
        boolean boolean60 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) -1, "hi!");
        boolean boolean65 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 10, "");
        boolean boolean70 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph4.panel = jPanel32;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel39 = reportGraph38.panel;
        reportGraph4.panel = jPanel39;
        boolean boolean45 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 100, "");
        boolean boolean50 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 0, 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        javax.swing.JPanel jPanel21 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        reportGraph9.panel = jPanel27;
        javax.swing.JPanel jPanel29 = reportGraph9.panel;
        reportGraph4.panel = jPanel29;
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph35.panel;
        javax.swing.JPanel jPanel37 = reportGraph35.panel;
        reportGraph4.panel = jPanel37;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("", (int) (short) -1, (-1), "hi!");
        boolean boolean35 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) 100, "");
        boolean boolean40 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) -1, "");
        boolean boolean22 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (short) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel31 = reportGraph25.panel;
        reportGraph15.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean43 = reportGraph38.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean48 = reportGraph38.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean63 = reportGraph53.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean68 = reportGraph53.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel74 = reportGraph73.panel;
        reportGraph53.panel = jPanel74;
        reportGraph38.panel = jPanel74;
        reportGraph4.panel = jPanel74;
        boolean boolean82 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) -1, "");
        boolean boolean87 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) 10, "");
        boolean boolean92 = reportGraph4.isEmpty("", (int) (short) 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean30 = reportGraph20.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph35.panel = jPanel46;
        reportGraph20.panel = jPanel46;
        boolean boolean53 = reportGraph20.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean63 = reportGraph58.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean68 = reportGraph58.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        javax.swing.JPanel jPanel69 = reportGraph58.panel;
        reportGraph20.panel = jPanel69;
        reportGraph4.panel = jPanel69;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel69);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        boolean boolean46 = reportGraph35.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean51 = reportGraph35.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel52 = reportGraph35.panel;
        reportGraph25.panel = jPanel52;
        reportGraph9.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        boolean boolean60 = reportGraph4.isEmpty("hi!", (int) ' ', 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("hi!", 0, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 100, "hi!");
        javax.swing.JPanel jPanel31 = reportGraph30.panel;
        reportGraph4.panel = jPanel31;
        java.lang.Class<?> wildcardClass33 = jPanel31.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel28 = reportGraph27.panel;
        javax.swing.JPanel jPanel29 = reportGraph27.panel;
        boolean boolean34 = reportGraph27.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph27.panel;
        reportGraph4.panel = jPanel35;
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 100, "");
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        boolean boolean47 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        boolean boolean52 = reportGraph4.wrongAnalysisType("", 1, 1, "");
        javax.swing.JPanel jPanel53 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean15 = reportGraph10.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel16 = reportGraph10.panel;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean31 = reportGraph21.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean46 = reportGraph41.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel47 = reportGraph41.panel;
        reportGraph36.panel = jPanel47;
        reportGraph21.panel = jPanel47;
        javax.swing.JPanel jPanel50 = reportGraph21.panel;
        reportGraph10.panel = jPanel50;
        reportGraph4.panel = jPanel50;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel50);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) -1, "");
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) '#', "");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, 1, "");
        boolean boolean26 = reportGraph4.isEmpty("", 100, (int) (byte) 0, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        boolean boolean36 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph14.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        boolean boolean42 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) -1, "hi!");
        boolean boolean47 = reportGraph4.wrongAnalysisType("", 100, (int) '#', "");
        boolean boolean52 = reportGraph4.isEmpty("", (int) 'a', (int) 'a', "");
        java.lang.Class<?> wildcardClass53 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = null;
        reportGraph4.panel = jPanel7;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        boolean boolean21 = reportGraph14.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        javax.swing.JPanel jPanel28 = reportGraph26.panel;
        reportGraph14.panel = jPanel28;
        reportGraph9.panel = jPanel28;
        reportGraph4.panel = jPanel28;
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        reportGraph4.panel = jPanel37;
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (short) 100, "");
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = null;
        reportGraph4.panel = jPanel11;
        boolean boolean17 = reportGraph4.isEmpty("hi!", 0, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        boolean boolean42 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) 'a', "");
        boolean boolean47 = reportGraph4.isEmpty("", (int) 'a', (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean30 = reportGraph14.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        javax.swing.JPanel jPanel32 = reportGraph14.panel;
        javax.swing.JPanel jPanel33 = reportGraph14.panel;
        reportGraph4.panel = jPanel33;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean30 = reportGraph15.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph35.panel;
        reportGraph15.panel = jPanel51;
        javax.swing.JPanel jPanel53 = reportGraph15.panel;
        reportGraph4.panel = jPanel53;
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 1, "hi!");
        boolean boolean64 = reportGraph59.isEmpty("", (int) (byte) 0, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph74 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean84 = reportGraph79.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel85 = reportGraph79.panel;
        reportGraph74.panel = jPanel85;
        reportGraph69.panel = jPanel85;
        reportGraph59.panel = jPanel85;
        reportGraph4.panel = jPanel85;
        java.lang.Class<?> wildcardClass90 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "");
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean59 = reportGraph54.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph54.panel;
        reportGraph49.panel = jPanel60;
        reportGraph4.panel = jPanel60;
        boolean boolean67 = reportGraph4.wrongAnalysisType("", 10, (-1), "");
        javax.swing.JPanel jPanel68 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jPanel68);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph21.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        boolean boolean49 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel50 = null;
        reportGraph4.panel = jPanel50;
        boolean boolean56 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        boolean boolean61 = reportGraph4.isEmpty("", (int) (short) 1, (int) (byte) 1, "hi!");
        boolean boolean66 = reportGraph4.isEmpty("", (int) '#', (int) '4', "");
        boolean boolean71 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 100, "hi!");
        boolean boolean76 = reportGraph4.isEmpty("", (int) (short) 0, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        javax.swing.JPanel jPanel38 = reportGraph31.panel;
        reportGraph9.panel = jPanel38;
        javax.swing.JPanel jPanel40 = reportGraph9.panel;
        reportGraph4.panel = jPanel40;
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        boolean boolean47 = reportGraph4.isEmpty("hi!", (int) 'a', (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph9.panel = jPanel36;
        boolean boolean42 = reportGraph9.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean47 = reportGraph9.wrongAnalysisType("", 100, (int) (short) 1, "");
        javax.swing.JPanel jPanel48 = reportGraph9.panel;
        reportGraph4.panel = jPanel48;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel28 = reportGraph27.panel;
        javax.swing.JPanel jPanel29 = reportGraph27.panel;
        boolean boolean34 = reportGraph27.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph27.panel;
        reportGraph4.panel = jPanel35;
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 100, "");
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) '4', "hi!");
        javax.swing.JPanel jPanel48 = reportGraph47.panel;
        reportGraph4.panel = jPanel48;
        boolean boolean54 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 0, "");
        boolean boolean59 = reportGraph4.wrongAnalysisType("hi!", 1, 10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 0, "hi!");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean47 = reportGraph37.isEmpty("hi!", 100, 100, "");
        boolean boolean52 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel53 = reportGraph37.panel;
        reportGraph4.panel = jPanel53;
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 100, "hi!");
        boolean boolean64 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) '#', "");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph4.panel = jPanel70;
        javax.swing.JPanel jPanel72 = reportGraph4.panel;
        boolean boolean77 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel78 = null;
        reportGraph4.panel = jPanel78;
        boolean boolean84 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph14.panel = jPanel30;
        boolean boolean36 = reportGraph14.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel37 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean52 = reportGraph42.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel63 = reportGraph57.panel;
        reportGraph42.panel = jPanel63;
        reportGraph14.panel = jPanel63;
        reportGraph4.panel = jPanel63;
        boolean boolean71 = reportGraph4.isEmpty("", (int) (short) 100, 100, "hi!");
        boolean boolean76 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) 1, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean39 = reportGraph24.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph24.panel;
        reportGraph4.panel = jPanel40;
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean51 = reportGraph46.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        reportGraph4.panel = jPanel52;
        java.lang.Class<?> wildcardClass54 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        boolean boolean28 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean29 = reportGraph19.isEmpty("hi!", 100, 100, "");
        boolean boolean34 = reportGraph19.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel35 = reportGraph19.panel;
        reportGraph14.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        java.lang.Class<?> wildcardClass38 = jPanel35.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        reportGraph4.panel = jPanel26;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        boolean boolean27 = reportGraph4.isEmpty("", 0, 1, "");
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel49 = reportGraph48.panel;
        reportGraph4.panel = jPanel49;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel49);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) -1, "");
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean62 = reportGraph52.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean77 = reportGraph72.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel78 = reportGraph72.panel;
        reportGraph67.panel = jPanel78;
        reportGraph52.panel = jPanel78;
        javax.swing.JPanel jPanel81 = reportGraph52.panel;
        reportGraph47.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        javax.swing.JPanel jPanel84 = reportGraph4.panel;
        javax.swing.JPanel jPanel85 = reportGraph4.panel;
        javax.swing.JPanel jPanel86 = reportGraph4.panel;
        javax.swing.JPanel jPanel87 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel87);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        boolean boolean32 = reportGraph21.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean37 = reportGraph21.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel38 = reportGraph21.panel;
        reportGraph9.panel = jPanel38;
        boolean boolean44 = reportGraph9.wrongAnalysisType("", 0, 1, "");
        boolean boolean49 = reportGraph9.isEmpty("hi!", 1, (int) (short) 1, "hi!");
        boolean boolean54 = reportGraph9.isEmpty("hi!", (int) 'a', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel70 = reportGraph64.panel;
        boolean boolean75 = reportGraph64.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean80 = reportGraph64.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel81 = reportGraph64.panel;
        boolean boolean86 = reportGraph64.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel87 = reportGraph64.panel;
        javax.swing.JPanel jPanel88 = reportGraph64.panel;
        reportGraph59.panel = jPanel88;
        javax.swing.JPanel jPanel90 = reportGraph59.panel;
        reportGraph9.panel = jPanel90;
        reportGraph4.panel = jPanel90;
        java.lang.Class<?> wildcardClass93 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        boolean boolean30 = reportGraph24.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean45 = reportGraph35.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean65 = reportGraph55.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean70 = reportGraph55.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel71 = reportGraph55.panel;
        reportGraph35.panel = jPanel71;
        javax.swing.JPanel jPanel73 = reportGraph35.panel;
        reportGraph24.panel = jPanel73;
        reportGraph9.panel = jPanel73;
        reportGraph4.panel = jPanel73;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(jPanel73);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '4', "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, 1, "");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) -1, "hi!");
        boolean boolean42 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean52 = reportGraph47.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph4.panel = jPanel53;
        boolean boolean59 = reportGraph4.isEmpty("hi!", (int) '4', (int) ' ', "hi!");
        boolean boolean64 = reportGraph4.isEmpty("", (int) (short) 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        boolean boolean75 = reportGraph69.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel76 = reportGraph69.panel;
        boolean boolean81 = reportGraph69.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean86 = reportGraph69.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean91 = reportGraph69.isEmpty("hi!", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel92 = reportGraph69.panel;
        reportGraph4.panel = jPanel92;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) ' ', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (short) 100, (int) (short) 0, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 10, (int) (byte) 0, "");
        boolean boolean29 = reportGraph14.isEmpty("hi!", (int) ' ', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        boolean boolean45 = reportGraph39.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph39.panel;
        reportGraph34.panel = jPanel46;
        javax.swing.JPanel jPanel48 = reportGraph34.panel;
        reportGraph14.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(jPanel48);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 10, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (short) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean34 = reportGraph24.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean49 = reportGraph44.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        reportGraph39.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        boolean boolean57 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel63 = reportGraph62.panel;
        reportGraph24.panel = jPanel63;
        reportGraph19.panel = jPanel63;
        reportGraph4.panel = jPanel63;
        java.lang.Class<?> wildcardClass67 = jPanel63.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        boolean boolean32 = reportGraph21.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph21.panel;
        javax.swing.JPanel jPanel34 = reportGraph21.panel;
        reportGraph4.panel = jPanel34;
        boolean boolean40 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, 0, "hi!");
        boolean boolean45 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 1, "");
        javax.swing.JPanel jPanel17 = reportGraph16.panel;
        reportGraph4.panel = jPanel17;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", 100, 100, "");
        boolean boolean24 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, 1, "");
        boolean boolean29 = reportGraph9.isEmpty("hi!", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel30 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) -1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph9.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), (int) '4', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 10, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }
}

