package randoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest49 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 100, (int) '4', "");
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        reportGraph4.panel = jPanel22;
        javax.swing.JPanel jPanel24 = reportGraph4.panel;
        boolean boolean29 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("", (int) (byte) 1, 10, "hi!");
        boolean boolean32 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "hi!");
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (-1), "");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("hi!", 0, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        reportGraph24.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        javax.swing.JPanel jPanel34 = reportGraph4.panel;
        boolean boolean39 = reportGraph4.isEmpty("", 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) 0, "hi!");
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        boolean boolean57 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (short) 10, "hi!");
        boolean boolean62 = reportGraph4.isEmpty("", 100, 100, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNull(jPanel63);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 100, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, 10, "");
        boolean boolean25 = reportGraph4.isEmpty("", (int) '#', 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph50.panel;
        boolean boolean56 = reportGraph50.wrongAnalysisType("", (int) (short) -1, 100, "");
        boolean boolean61 = reportGraph50.wrongAnalysisType("hi!", 10, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph50.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        boolean boolean74 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) 1, "hi!");
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph42.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph4.panel = jPanel32;
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean43 = reportGraph4.isEmpty("hi!", 0, (int) (short) -1, "hi!");
        boolean boolean48 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        boolean boolean53 = reportGraph4.isEmpty("", (int) (short) 1, 1, "");
        boolean boolean58 = reportGraph4.isEmpty("", (int) (byte) 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 0, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", 100, 100, "");
        boolean boolean24 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel25 = reportGraph9.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("", (int) (short) -1, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.isEmpty("", 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean35 = reportGraph25.isEmpty("", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel36 = reportGraph25.panel;
        javax.swing.JPanel jPanel37 = reportGraph25.panel;
        reportGraph4.panel = jPanel37;
        java.lang.Class<?> wildcardClass39 = jPanel37.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        boolean boolean62 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 10, "hi!");
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
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) '#', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 0, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) 10, "");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        boolean boolean80 = reportGraph4.wrongAnalysisType("", 1, (int) (short) -1, "hi!");
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
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 100, "");
        boolean boolean14 = reportGraph9.isEmpty("", 100, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 1, "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 1, 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph19.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        boolean boolean65 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (short) 10, "hi!");
        boolean boolean70 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
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
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) 10, (int) '4', "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", 100, 1, "");
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("hi!", (int) '4', 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel31 = reportGraph20.panel;
        reportGraph9.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 10, "");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, 0, "");
        javax.swing.JPanel jPanel60 = reportGraph59.panel;
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean70 = reportGraph65.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean75 = reportGraph65.wrongAnalysisType("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel76 = reportGraph65.panel;
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel82 = reportGraph81.panel;
        reportGraph65.panel = jPanel82;
        reportGraph59.panel = jPanel82;
        reportGraph4.panel = jPanel82;
        javax.swing.JPanel jPanel86 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertNotNull(jPanel86);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean36 = reportGraph31.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph26.panel = jPanel37;
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean48 = reportGraph43.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel49 = reportGraph43.panel;
        boolean boolean54 = reportGraph43.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean59 = reportGraph43.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel60 = reportGraph43.panel;
        boolean boolean65 = reportGraph43.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean70 = reportGraph43.wrongAnalysisType("hi!", 0, 0, "");
        javax.swing.JPanel jPanel71 = reportGraph43.panel;
        reportGraph26.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        java.lang.Class<?> wildcardClass74 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        boolean boolean30 = reportGraph4.isEmpty("hi!", (int) 'a', 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel46 = reportGraph45.panel;
        boolean boolean51 = reportGraph45.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel52 = reportGraph45.panel;
        boolean boolean57 = reportGraph45.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean62 = reportGraph45.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean67 = reportGraph45.wrongAnalysisType("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean77 = reportGraph72.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean87 = reportGraph82.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel88 = reportGraph82.panel;
        reportGraph72.panel = jPanel88;
        boolean boolean94 = reportGraph72.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel95 = reportGraph72.panel;
        reportGraph45.panel = jPanel95;
        reportGraph40.panel = jPanel95;
        reportGraph35.panel = jPanel95;
        reportGraph4.panel = jPanel95;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) '4', "");
        javax.swing.JPanel jPanel17 = reportGraph16.panel;
        reportGraph4.panel = jPanel17;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) 100, "");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph9.panel = jPanel25;
        boolean boolean31 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean46 = reportGraph36.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel57 = reportGraph51.panel;
        reportGraph36.panel = jPanel57;
        reportGraph9.panel = jPanel57;
        reportGraph4.panel = jPanel57;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 10, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean21 = reportGraph16.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        boolean boolean26 = reportGraph16.isEmpty("hi!", (int) 'a', (int) (byte) 100, "");
        boolean boolean31 = reportGraph16.wrongAnalysisType("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean51 = reportGraph41.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel52 = reportGraph41.panel;
        reportGraph36.panel = jPanel52;
        reportGraph16.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        boolean boolean60 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 1, "hi!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) 'a', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 1, 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean52 = reportGraph42.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel63 = reportGraph57.panel;
        reportGraph42.panel = jPanel63;
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph42.panel = jPanel70;
        reportGraph4.panel = jPanel70;
        boolean boolean77 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean19 = reportGraph9.isEmpty("", (int) 'a', (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph9.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("", 1, (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        boolean boolean29 = reportGraph4.isEmpty("hi!", (int) 'a', 0, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        boolean boolean35 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph9.panel = jPanel16;
        reportGraph4.panel = jPanel16;
        boolean boolean23 = reportGraph4.isEmpty("", (int) ' ', (int) '#', "hi!");
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) -1, "");
        boolean boolean22 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 1, "hi!");
        boolean boolean27 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "");
        boolean boolean32 = reportGraph4.isEmpty("", 10, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean61 = reportGraph46.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean71 = reportGraph66.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean81 = reportGraph76.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel82 = reportGraph76.panel;
        reportGraph66.panel = jPanel82;
        reportGraph46.panel = jPanel82;
        reportGraph19.panel = jPanel82;
        reportGraph4.panel = jPanel82;
        boolean boolean91 = reportGraph4.isEmpty("hi!", (int) (short) 100, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) -1, "");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph35.panel = jPanel46;
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean67 = reportGraph62.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph52.panel = jPanel68;
        reportGraph35.panel = jPanel68;
        reportGraph19.panel = jPanel68;
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel77 = reportGraph76.panel;
        reportGraph19.panel = jPanel77;
        reportGraph9.panel = jPanel77;
        reportGraph4.panel = jPanel77;
        boolean boolean85 = reportGraph4.isEmpty("", (int) (byte) 10, (-1), "");
        boolean boolean90 = reportGraph4.isEmpty("hi!", 0, 1, "hi!");
        boolean boolean95 = reportGraph4.isEmpty("", (int) (byte) 0, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) -1, "hi!");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        boolean boolean26 = reportGraph20.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel27 = reportGraph20.panel;
        reportGraph4.panel = jPanel27;
        boolean boolean33 = reportGraph4.isEmpty("", (-1), (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean43 = reportGraph38.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean48 = reportGraph38.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel49 = reportGraph38.panel;
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean64 = reportGraph59.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean69 = reportGraph59.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean74 = reportGraph59.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel80 = reportGraph79.panel;
        reportGraph59.panel = jPanel80;
        reportGraph54.panel = jPanel80;
        reportGraph38.panel = jPanel80;
        javax.swing.JPanel jPanel84 = reportGraph38.panel;
        reportGraph4.panel = jPanel84;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel84);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        java.lang.Class<?> wildcardClass72 = jPanel71.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", (int) (byte) 10, (-1), "");
        boolean boolean22 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (-1), "hi!");
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) '4', (int) (byte) -1, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel47 = reportGraph41.panel;
        reportGraph31.panel = jPanel47;
        boolean boolean53 = reportGraph31.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel54 = reportGraph31.panel;
        reportGraph4.panel = jPanel54;
        boolean boolean60 = reportGraph4.isEmpty("hi!", (int) 'a', 1, "");
        boolean boolean65 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 1, "hi!");
        boolean boolean70 = reportGraph4.isEmpty("hi!", (int) '4', 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        javax.swing.JPanel jPanel16 = null;
        reportGraph4.panel = jPanel16;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean32 = reportGraph22.isEmpty("hi!", 100, 100, "");
        boolean boolean37 = reportGraph22.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel48 = reportGraph47.panel;
        javax.swing.JPanel jPanel49 = reportGraph47.panel;
        reportGraph42.panel = jPanel49;
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean60 = reportGraph55.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean75 = reportGraph65.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph80 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean85 = reportGraph80.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel86 = reportGraph80.panel;
        reportGraph65.panel = jPanel86;
        reportGraph55.panel = jPanel86;
        statsVisualiser.graph.ReportGraph reportGraph93 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel94 = reportGraph93.panel;
        reportGraph55.panel = jPanel94;
        reportGraph42.panel = jPanel94;
        reportGraph22.panel = jPanel94;
        reportGraph4.panel = jPanel94;
        java.lang.Class<?> wildcardClass99 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel94);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (-1), "hi!");
        boolean boolean20 = reportGraph4.isEmpty("hi!", 0, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        boolean boolean55 = reportGraph4.isEmpty("", (int) '4', (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 0, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.isEmpty("", 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        boolean boolean63 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) -1, "hi!");
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
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass18 = jPanel17.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) 'a', "hi!");
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
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) 'a', "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass22 = jPanel21.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        boolean boolean84 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel85 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass86 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        boolean boolean84 = reportGraph4.isEmpty("hi!", (int) ' ', (int) ' ', "");
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
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean25 = reportGraph9.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean46 = reportGraph31.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean61 = reportGraph51.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean76 = reportGraph71.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel77 = reportGraph71.panel;
        reportGraph66.panel = jPanel77;
        reportGraph51.panel = jPanel77;
        reportGraph31.panel = jPanel77;
        reportGraph9.panel = jPanel77;
        javax.swing.JPanel jPanel82 = reportGraph9.panel;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (short) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) '4', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph24.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) ' ', "hi!");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 10, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass17 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 100, "");
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (short) 0, "hi!");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean24 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 1, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        boolean boolean30 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph35.panel;
        boolean boolean41 = reportGraph35.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean46 = reportGraph35.wrongAnalysisType("hi!", (int) 'a', (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean71 = reportGraph66.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel72 = reportGraph66.panel;
        reportGraph51.panel = jPanel72;
        boolean boolean78 = reportGraph51.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean83 = reportGraph51.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel84 = reportGraph51.panel;
        javax.swing.JPanel jPanel85 = reportGraph51.panel;
        reportGraph35.panel = jPanel85;
        reportGraph4.panel = jPanel85;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel85);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) -1, "hi!");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", 10, (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        javax.swing.JPanel jPanel8 = reportGraph4.panel;
        boolean boolean13 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 100, "");
        boolean boolean24 = reportGraph4.isEmpty("", (-1), (-1), "hi!");
        boolean boolean29 = reportGraph4.isEmpty("", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 0, (-1), "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph37.panel = jPanel53;
        boolean boolean59 = reportGraph37.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean74 = reportGraph64.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean84 = reportGraph79.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel85 = reportGraph79.panel;
        reportGraph64.panel = jPanel85;
        reportGraph37.panel = jPanel85;
        boolean boolean92 = reportGraph37.wrongAnalysisType("", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel93 = reportGraph37.panel;
        reportGraph32.panel = jPanel93;
        reportGraph4.panel = jPanel93;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jPanel93);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean29 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 10, "");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        boolean boolean35 = reportGraph4.wrongAnalysisType("", (int) '4', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, 0, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        javax.swing.JPanel jPanel43 = reportGraph30.panel;
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean63 = reportGraph53.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean68 = reportGraph53.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel74 = reportGraph73.panel;
        reportGraph53.panel = jPanel74;
        reportGraph48.panel = jPanel74;
        reportGraph30.panel = jPanel74;
        reportGraph24.panel = jPanel74;
        javax.swing.JPanel jPanel79 = reportGraph24.panel;
        reportGraph4.panel = jPanel79;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertNotNull(jPanel79);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 10, "hi!");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (byte) 1, "hi!");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean29 = reportGraph14.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph14.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        boolean boolean43 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        boolean boolean49 = reportGraph4.isEmpty("hi!", 10, 10, "hi!");
        boolean boolean54 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean41 = reportGraph36.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        reportGraph26.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        boolean boolean50 = reportGraph4.isEmpty("hi!", 0, (int) '#', "hi!");
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, 1, "hi!");
        boolean boolean60 = reportGraph4.wrongAnalysisType("", (-1), 10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 1, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.isEmpty("", (int) (short) 1, 1, "hi!");
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jPanel39);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 10, (int) (byte) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        reportGraph19.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 10, "");
        javax.swing.JPanel jPanel39 = reportGraph38.panel;
        reportGraph4.panel = jPanel39;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel39);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 10, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        boolean boolean71 = reportGraph4.isEmpty("", 10, 1, "hi!");
        boolean boolean76 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) '4', "");
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
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 100, "");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
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
        boolean boolean96 = reportGraph4.isEmpty("", 10, (int) ' ', "");
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (int) '4', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 100, 10, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass17 = jPanel16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", 1, (int) '#', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
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
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "");
        javax.swing.JPanel jPanel85 = reportGraph84.panel;
        statsVisualiser.graph.ReportGraph reportGraph90 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel91 = reportGraph90.panel;
        javax.swing.JPanel jPanel92 = reportGraph90.panel;
        reportGraph84.panel = jPanel92;
        reportGraph4.panel = jPanel92;
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
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 10, "hi!");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        boolean boolean57 = reportGraph4.isEmpty("", (int) (byte) -1, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, (int) (short) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 0, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 10, "");
        boolean boolean21 = reportGraph4.isEmpty("", (-1), 0, "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        javax.swing.JPanel jPanel28 = reportGraph26.panel;
        boolean boolean33 = reportGraph26.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean43 = reportGraph38.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel44 = reportGraph38.panel;
        boolean boolean49 = reportGraph38.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean54 = reportGraph38.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel55 = reportGraph38.panel;
        reportGraph26.panel = jPanel55;
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean66 = reportGraph61.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean71 = reportGraph61.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean86 = reportGraph81.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel87 = reportGraph81.panel;
        reportGraph76.panel = jPanel87;
        reportGraph61.panel = jPanel87;
        javax.swing.JPanel jPanel90 = reportGraph61.panel;
        reportGraph26.panel = jPanel90;
        reportGraph4.panel = jPanel90;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        boolean boolean31 = reportGraph20.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean36 = reportGraph20.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel37 = reportGraph20.panel;
        reportGraph4.panel = jPanel37;
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        boolean boolean44 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("", (int) (short) 1, 10, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 0, "");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph9.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph9.panel;
        javax.swing.JPanel jPanel19 = reportGraph9.panel;
        reportGraph4.panel = jPanel19;
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertNotNull(jPanel19);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        boolean boolean79 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (-1), "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean40 = reportGraph19.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph19.panel;
        boolean boolean46 = reportGraph19.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel52 = reportGraph51.panel;
        reportGraph19.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel52);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = null;
        reportGraph4.panel = jPanel16;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) -1, "hi!");
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph4.panel = jPanel16;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (-1), (int) ' ', "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) (short) 100, 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 10, "");
        javax.swing.JPanel jPanel71 = reportGraph70.panel;
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel82 = reportGraph81.panel;
        javax.swing.JPanel jPanel83 = reportGraph81.panel;
        boolean boolean88 = reportGraph81.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel89 = reportGraph81.panel;
        javax.swing.JPanel jPanel90 = reportGraph81.panel;
        reportGraph76.panel = jPanel90;
        javax.swing.JPanel jPanel92 = reportGraph76.panel;
        reportGraph70.panel = jPanel92;
        reportGraph4.panel = jPanel92;
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
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        boolean boolean39 = reportGraph4.wrongAnalysisType("", 0, 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        reportGraph24.panel = jPanel40;
        boolean boolean46 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean71 = reportGraph66.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel72 = reportGraph66.panel;
        reportGraph51.panel = jPanel72;
        reportGraph24.panel = jPanel72;
        boolean boolean79 = reportGraph24.wrongAnalysisType("", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph24.panel;
        reportGraph19.panel = jPanel80;
        reportGraph4.panel = jPanel80;
        boolean boolean87 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        boolean boolean32 = reportGraph26.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean47 = reportGraph37.isEmpty("hi!", 100, 100, "");
        boolean boolean52 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel53 = reportGraph37.panel;
        reportGraph26.panel = jPanel53;
        boolean boolean59 = reportGraph26.isEmpty("", (int) (short) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph26.panel;
        reportGraph4.panel = jPanel60;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph14.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) '#', (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean38 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) '4', "");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '4', 1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", (int) ' ', (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean32 = reportGraph22.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean47 = reportGraph37.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean52 = reportGraph37.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel58 = reportGraph57.panel;
        reportGraph37.panel = jPanel58;
        reportGraph22.panel = jPanel58;
        boolean boolean65 = reportGraph22.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        boolean boolean70 = reportGraph22.isEmpty("", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean75 = reportGraph22.isEmpty("", (int) '#', (int) (byte) 100, "");
        boolean boolean80 = reportGraph22.wrongAnalysisType("", (int) (short) 0, 100, "");
        javax.swing.JPanel jPanel81 = reportGraph22.panel;
        reportGraph4.panel = jPanel81;
        javax.swing.JPanel jPanel83 = reportGraph4.panel;
        javax.swing.JPanel jPanel84 = reportGraph4.panel;
        javax.swing.JPanel jPanel85 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel85);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean29 = reportGraph19.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph39.panel;
        reportGraph34.panel = jPanel45;
        reportGraph19.panel = jPanel45;
        boolean boolean52 = reportGraph19.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean67 = reportGraph57.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean77 = reportGraph72.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel78 = reportGraph72.panel;
        reportGraph57.panel = jPanel78;
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel85 = reportGraph84.panel;
        reportGraph57.panel = jPanel85;
        reportGraph19.panel = jPanel85;
        reportGraph4.panel = jPanel85;
        javax.swing.JPanel jPanel89 = reportGraph4.panel;
        boolean boolean94 = reportGraph4.wrongAnalysisType("", (int) '4', 1, "hi!");
        javax.swing.JPanel jPanel95 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (short) 1, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel30 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean40 = reportGraph35.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph19.panel = jPanel41;
        reportGraph9.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass46 = jPanel45.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        boolean boolean45 = reportGraph34.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean50 = reportGraph34.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel51 = reportGraph34.panel;
        reportGraph24.panel = jPanel51;
        boolean boolean57 = reportGraph24.isEmpty("", 100, (int) (short) 10, "");
        javax.swing.JPanel jPanel58 = reportGraph24.panel;
        reportGraph4.panel = jPanel58;
        boolean boolean64 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass65 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        javax.swing.JPanel jPanel26 = reportGraph24.panel;
        reportGraph19.panel = jPanel26;
        reportGraph14.panel = jPanel26;
        reportGraph4.panel = jPanel26;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel26);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        javax.swing.JPanel jPanel55 = null;
        reportGraph4.panel = jPanel55;
        boolean boolean61 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel62 = reportGraph4.panel;
        boolean boolean67 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) -1, "");
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
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(jPanel62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (byte) 10, "");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (short) 0, (int) '4', "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass22 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        reportGraph24.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        boolean boolean38 = reportGraph4.isEmpty("", 0, 0, "hi!");
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        boolean boolean44 = reportGraph4.wrongAnalysisType("", 0, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) '4', (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        boolean boolean38 = reportGraph4.wrongAnalysisType("", 100, (int) (short) -1, "");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '4', "hi!");
        boolean boolean25 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (byte) 1, "hi!");
        boolean boolean30 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 100, "");
        javax.swing.JPanel jPanel31 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
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
        boolean boolean42 = reportGraph4.isEmpty("hi!", (int) ' ', (int) ' ', "hi!");
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph52.panel;
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel59 = reportGraph58.panel;
        reportGraph52.panel = jPanel59;
        boolean boolean65 = reportGraph52.isEmpty("", (int) (short) 10, (int) (short) 10, "");
        javax.swing.JPanel jPanel66 = reportGraph52.panel;
        reportGraph4.panel = jPanel66;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel66);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) -1, "hi!");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        statsVisualiser.graph.ReportGraph reportGraph83 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel84 = reportGraph83.panel;
        reportGraph4.panel = jPanel84;
        java.lang.Class<?> wildcardClass86 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean20 = reportGraph15.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel31 = reportGraph25.panel;
        reportGraph15.panel = jPanel31;
        boolean boolean37 = reportGraph15.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        boolean boolean42 = reportGraph15.wrongAnalysisType("", 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel43 = reportGraph15.panel;
        reportGraph4.panel = jPanel43;
        boolean boolean49 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph39.panel;
        reportGraph29.panel = jPanel45;
        reportGraph9.panel = jPanel45;
        boolean boolean52 = reportGraph9.isEmpty("hi!", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph9.panel;
        reportGraph4.panel = jPanel53;
        java.lang.Class<?> wildcardClass55 = jPanel53.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 100, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (int) '4', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) 0, "hi!");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", 0, 1, "");
        javax.swing.JPanel jPanel49 = reportGraph48.panel;
        javax.swing.JPanel jPanel50 = reportGraph48.panel;
        reportGraph4.panel = jPanel50;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jPanel50);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) (byte) 0, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        javax.swing.JPanel jPanel26 = reportGraph19.panel;
        javax.swing.JPanel jPanel27 = reportGraph19.panel;
        reportGraph9.panel = jPanel27;
        reportGraph4.panel = jPanel27;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
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
        boolean boolean65 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) ' ', "hi!");
        javax.swing.JPanel jPanel66 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel66);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean40 = reportGraph24.isEmpty("", (int) (short) 0, (int) '4', "");
        javax.swing.JPanel jPanel41 = reportGraph24.panel;
        reportGraph4.panel = jPanel41;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) '4', "");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(jPanel12);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 100, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        boolean boolean25 = reportGraph19.isEmpty("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel26 = reportGraph19.panel;
        reportGraph4.panel = jPanel26;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (-1), "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (short) -1, "");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        reportGraph19.panel = jPanel26;
        reportGraph9.panel = jPanel26;
        reportGraph4.panel = jPanel26;
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph4.panel = jPanel35;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel35);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', 1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean29 = reportGraph19.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph39.panel;
        reportGraph34.panel = jPanel45;
        reportGraph19.panel = jPanel45;
        boolean boolean52 = reportGraph19.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean57 = reportGraph19.isEmpty("hi!", (int) (byte) 0, (int) '4', "");
        javax.swing.JPanel jPanel58 = reportGraph19.panel;
        reportGraph14.panel = jPanel58;
        reportGraph4.panel = jPanel58;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 100, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 0, 100, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        boolean boolean49 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "hi!");
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        boolean boolean55 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (-1), (-1), "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (-1), "");
        boolean boolean61 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 0, (int) '#', "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        reportGraph10.panel = jPanel21;
        boolean boolean27 = reportGraph10.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel28 = reportGraph10.panel;
        reportGraph4.panel = jPanel28;
        java.lang.Class<?> wildcardClass30 = jPanel28.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        java.lang.Class<?> wildcardClass42 = jPanel41.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (byte) 100, "");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (short) 100, "");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) ' ', 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', 10, "");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel25 = reportGraph14.panel;
        reportGraph4.panel = jPanel25;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        reportGraph4.panel = jPanel26;
        javax.swing.JPanel jPanel28 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 10, "hi!");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
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
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", 0, (-1), "hi!");
        javax.swing.JPanel jPanel49 = reportGraph4.panel;
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jPanel50);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 0, "");
        boolean boolean36 = reportGraph31.isEmpty("hi!", (int) (byte) -1, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel42 = reportGraph41.panel;
        reportGraph31.panel = jPanel42;
        reportGraph4.panel = jPanel42;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel42);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        boolean boolean30 = reportGraph4.isEmpty("hi!", (int) 'a', 0, "hi!");
        java.lang.Class<?> wildcardClass31 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        boolean boolean24 = reportGraph14.isEmpty("hi!", (int) '4', (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean59 = reportGraph49.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean74 = reportGraph69.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel75 = reportGraph69.panel;
        reportGraph64.panel = jPanel75;
        reportGraph49.panel = jPanel75;
        reportGraph29.panel = jPanel75;
        reportGraph14.panel = jPanel75;
        reportGraph4.panel = jPanel75;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel75);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(jPanel18);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) '4', "hi!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean20 = reportGraph15.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean25 = reportGraph15.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel26 = reportGraph15.panel;
        reportGraph4.panel = jPanel26;
        javax.swing.JPanel jPanel28 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean82 = reportGraph77.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean87 = reportGraph77.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean92 = reportGraph77.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel93 = reportGraph77.panel;
        reportGraph4.panel = jPanel93;
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(jPanel93);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 10, "hi!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) '4', "hi!");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 100, "");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        boolean boolean47 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) '#', "");
        boolean boolean52 = reportGraph4.isEmpty("", (int) '#', (-1), "");
        boolean boolean57 = reportGraph4.isEmpty("hi!", (int) (byte) -1, 10, "");
        javax.swing.JPanel jPanel58 = reportGraph4.panel;
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel59);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
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
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        boolean boolean47 = reportGraph4.isEmpty("", (int) ' ', (-1), "hi!");
        java.lang.Class<?> wildcardClass48 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 10, "");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, (int) (byte) 100, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", 0, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        boolean boolean30 = reportGraph20.isEmpty("hi!", (int) '4', (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean65 = reportGraph55.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean80 = reportGraph75.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel81 = reportGraph75.panel;
        reportGraph70.panel = jPanel81;
        reportGraph55.panel = jPanel81;
        reportGraph35.panel = jPanel81;
        reportGraph20.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) 100, "hi!");
        boolean boolean42 = reportGraph4.isEmpty("hi!", 10, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        boolean boolean58 = reportGraph47.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean63 = reportGraph47.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel64 = reportGraph47.panel;
        reportGraph4.panel = jPanel64;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
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
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        boolean boolean51 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        boolean boolean20 = reportGraph14.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel21 = reportGraph14.panel;
        boolean boolean26 = reportGraph14.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph14.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean36 = reportGraph14.wrongAnalysisType("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean46 = reportGraph41.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel57 = reportGraph51.panel;
        reportGraph41.panel = jPanel57;
        boolean boolean63 = reportGraph41.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel64 = reportGraph41.panel;
        reportGraph14.panel = jPanel64;
        reportGraph4.panel = jPanel64;
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", 1, 1, "");
        javax.swing.JPanel jPanel72 = reportGraph71.panel;
        reportGraph4.panel = jPanel72;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(jPanel72);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
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
        reportGraph9.panel = jPanel47;
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean75 = reportGraph70.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel76 = reportGraph70.panel;
        reportGraph65.panel = jPanel76;
        reportGraph55.panel = jPanel76;
        reportGraph9.panel = jPanel76;
        boolean boolean84 = reportGraph9.wrongAnalysisType("hi!", 1, (-1), "hi!");
        javax.swing.JPanel jPanel85 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph90 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '4', "hi!");
        boolean boolean95 = reportGraph90.isEmpty("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel96 = reportGraph90.panel;
        reportGraph9.panel = jPanel96;
        reportGraph4.panel = jPanel96;
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(jPanel96);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 1, "hi!");
        boolean boolean29 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean44 = reportGraph34.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        reportGraph34.panel = jPanel55;
        boolean boolean61 = reportGraph34.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean66 = reportGraph34.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph34.panel;
        reportGraph4.panel = jPanel67;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass32 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", 0, 100, "");
        javax.swing.JPanel jPanel55 = reportGraph54.panel;
        javax.swing.JPanel jPanel56 = reportGraph54.panel;
        reportGraph4.panel = jPanel56;
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
        org.junit.Assert.assertNotNull(jPanel56);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) '4', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph14.panel;
        javax.swing.JPanel jPanel27 = reportGraph14.panel;
        reportGraph4.panel = jPanel27;
        java.lang.Class<?> wildcardClass29 = jPanel27.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        reportGraph4.panel = jPanel11;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        boolean boolean49 = reportGraph4.wrongAnalysisType("", (int) '4', (int) '#', "");
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean65 = reportGraph55.isEmpty("hi!", 100, 100, "");
        boolean boolean70 = reportGraph55.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel71 = reportGraph55.panel;
        javax.swing.JPanel jPanel72 = reportGraph55.panel;
        reportGraph4.panel = jPanel72;
        boolean boolean78 = reportGraph4.isEmpty("hi!", (int) '4', (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph24.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        boolean boolean42 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean72 = reportGraph62.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean82 = reportGraph77.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel83 = reportGraph77.panel;
        reportGraph62.panel = jPanel83;
        reportGraph52.panel = jPanel83;
        reportGraph47.panel = jPanel83;
        reportGraph9.panel = jPanel83;
        reportGraph4.panel = jPanel83;
        boolean boolean93 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 1, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) 'a', "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 10, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
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
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        javax.swing.JPanel jPanel51 = reportGraph50.panel;
        reportGraph4.panel = jPanel51;
        boolean boolean57 = reportGraph4.isEmpty("hi!", 0, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) 10, "hi!");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        boolean boolean35 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        java.lang.Class<?> wildcardClass41 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean35 = reportGraph25.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean50 = reportGraph45.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph45.panel;
        reportGraph40.panel = jPanel51;
        reportGraph25.panel = jPanel51;
        javax.swing.JPanel jPanel54 = reportGraph25.panel;
        reportGraph14.panel = jPanel54;
        boolean boolean60 = reportGraph14.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel61 = reportGraph14.panel;
        reportGraph4.panel = jPanel61;
        boolean boolean67 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "");
        boolean boolean14 = reportGraph4.isEmpty("", 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (short) -1, (int) '#', "");
        boolean boolean29 = reportGraph19.isEmpty("hi!", 0, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph19.panel;
        reportGraph4.panel = jPanel30;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        reportGraph4.panel = jPanel26;
        boolean boolean32 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, 100, "hi!");
        boolean boolean37 = reportGraph4.isEmpty("", (int) ' ', 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        boolean boolean53 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (-1), "");
        boolean boolean58 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 0, "hi!");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 10, "");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) '4', 1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean39 = reportGraph29.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        reportGraph44.panel = jPanel55;
        reportGraph29.panel = jPanel55;
        boolean boolean62 = reportGraph29.isEmpty("", (int) 'a', 10, "");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean72 = reportGraph67.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel73 = reportGraph67.panel;
        boolean boolean78 = reportGraph67.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean83 = reportGraph67.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel84 = reportGraph67.panel;
        boolean boolean89 = reportGraph67.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph67.panel;
        javax.swing.JPanel jPanel91 = reportGraph67.panel;
        reportGraph29.panel = jPanel91;
        reportGraph4.panel = jPanel91;
        java.lang.Class<?> wildcardClass94 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        reportGraph14.panel = jPanel40;
        boolean boolean47 = reportGraph14.isEmpty("", (int) (short) 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph14.panel;
        reportGraph4.panel = jPanel48;
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel50);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        boolean boolean74 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 1, "");
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        reportGraph4.panel = jPanel47;
        boolean boolean53 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass54 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.isEmpty("", (int) (short) 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel54 = reportGraph48.panel;
        boolean boolean59 = reportGraph48.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel60 = reportGraph48.panel;
        boolean boolean65 = reportGraph48.isEmpty("", 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel66 = reportGraph48.panel;
        javax.swing.JPanel jPanel67 = reportGraph48.panel;
        reportGraph43.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        java.lang.Class<?> wildcardClass70 = jPanel67.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (short) 1, "");
        boolean boolean36 = reportGraph4.isEmpty("hi!", 10, 1, "");
        javax.swing.JPanel jPanel37 = reportGraph4.panel;
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel44 = reportGraph43.panel;
        boolean boolean49 = reportGraph43.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean59 = reportGraph54.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean64 = reportGraph54.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean69 = reportGraph54.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph74 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean79 = reportGraph74.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean84 = reportGraph74.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean89 = reportGraph74.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph74.panel;
        reportGraph54.panel = jPanel90;
        javax.swing.JPanel jPanel92 = reportGraph54.panel;
        reportGraph43.panel = jPanel92;
        reportGraph4.panel = jPanel92;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean30 = reportGraph20.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph35.panel = jPanel46;
        reportGraph20.panel = jPanel46;
        javax.swing.JPanel jPanel49 = reportGraph20.panel;
        reportGraph9.panel = jPanel49;
        boolean boolean55 = reportGraph9.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        boolean boolean60 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, 0, "");
        boolean boolean65 = reportGraph9.isEmpty("hi!", (int) (byte) 10, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel71 = reportGraph70.panel;
        reportGraph9.panel = jPanel71;
        reportGraph4.panel = jPanel71;
        java.lang.Class<?> wildcardClass74 = jPanel71.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        boolean boolean40 = reportGraph29.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean45 = reportGraph29.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel46 = reportGraph29.panel;
        reportGraph19.panel = jPanel46;
        boolean boolean52 = reportGraph19.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean67 = reportGraph57.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean82 = reportGraph77.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph77.panel;
        reportGraph72.panel = jPanel83;
        reportGraph57.panel = jPanel83;
        javax.swing.JPanel jPanel86 = reportGraph57.panel;
        reportGraph19.panel = jPanel86;
        reportGraph9.panel = jPanel86;
        reportGraph4.panel = jPanel86;
        boolean boolean94 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "hi!");
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
        boolean boolean54 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        boolean boolean59 = reportGraph14.isEmpty("", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph14.panel;
        reportGraph4.panel = jPanel60;
        boolean boolean66 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = null;
        reportGraph4.panel = jPanel33;
        boolean boolean39 = reportGraph4.isEmpty("hi!", 1, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph15.panel;
        reportGraph10.panel = jPanel16;
        reportGraph4.panel = jPanel16;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        boolean boolean21 = reportGraph9.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean26 = reportGraph9.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean31 = reportGraph9.isEmpty("hi!", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel32 = reportGraph9.panel;
        reportGraph4.panel = jPanel32;
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) -1, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "hi!");
        boolean boolean42 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean29 = reportGraph14.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph14.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        boolean boolean42 = reportGraph4.isEmpty("", (int) (short) 0, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean57 = reportGraph47.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean72 = reportGraph67.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel73 = reportGraph67.panel;
        reportGraph62.panel = jPanel73;
        reportGraph47.panel = jPanel73;
        javax.swing.JPanel jPanel76 = reportGraph47.panel;
        boolean boolean81 = reportGraph47.wrongAnalysisType("", (int) (short) 100, (int) 'a', "hi!");
        javax.swing.JPanel jPanel82 = reportGraph47.panel;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", 1, (int) 'a', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
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
        boolean boolean42 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph47.panel;
        boolean boolean53 = reportGraph47.wrongAnalysisType("", (int) (short) -1, 100, "");
        boolean boolean58 = reportGraph47.wrongAnalysisType("hi!", 10, (int) (byte) -1, "hi!");
        boolean boolean63 = reportGraph47.wrongAnalysisType("hi!", (int) (byte) 0, (int) (short) -1, "");
        boolean boolean68 = reportGraph47.isEmpty("hi!", 100, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (-1), (int) '#', "");
        javax.swing.JPanel jPanel74 = reportGraph73.panel;
        reportGraph47.panel = jPanel74;
        reportGraph4.panel = jPanel74;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel74);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = null;
        reportGraph4.panel = jPanel12;
        boolean boolean18 = reportGraph4.isEmpty("", (-1), (int) (short) 100, "");
        boolean boolean23 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "");
        java.lang.Class<?> wildcardClass24 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        boolean boolean45 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean60 = reportGraph50.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean75 = reportGraph70.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel76 = reportGraph70.panel;
        reportGraph65.panel = jPanel76;
        reportGraph50.panel = jPanel76;
        boolean boolean83 = reportGraph50.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel84 = reportGraph50.panel;
        javax.swing.JPanel jPanel85 = reportGraph50.panel;
        javax.swing.JPanel jPanel86 = reportGraph50.panel;
        reportGraph4.panel = jPanel86;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(jPanel86);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (short) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph40.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean60 = reportGraph50.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean75 = reportGraph65.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean80 = reportGraph65.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph85 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel86 = reportGraph85.panel;
        reportGraph65.panel = jPanel86;
        reportGraph50.panel = jPanel86;
        boolean boolean93 = reportGraph50.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel94 = reportGraph50.panel;
        reportGraph40.panel = jPanel94;
        reportGraph24.panel = jPanel94;
        reportGraph4.panel = jPanel94;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(jPanel94);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) ' ', "hi!");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 10, "");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 1, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (byte) 10, "");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean41 = reportGraph36.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        reportGraph26.panel = jPanel42;
        reportGraph9.panel = jPanel42;
        boolean boolean49 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean59 = reportGraph54.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel70 = reportGraph64.panel;
        boolean boolean75 = reportGraph64.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean80 = reportGraph64.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel81 = reportGraph64.panel;
        reportGraph54.panel = jPanel81;
        boolean boolean87 = reportGraph54.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel88 = reportGraph54.panel;
        javax.swing.JPanel jPanel89 = reportGraph54.panel;
        reportGraph9.panel = jPanel89;
        reportGraph4.panel = jPanel89;
        javax.swing.JPanel jPanel92 = reportGraph4.panel;
        javax.swing.JPanel jPanel93 = reportGraph4.panel;
        boolean boolean98 = reportGraph4.isEmpty("", 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '#', 10, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) -1, "hi!");
        boolean boolean29 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 1, "");
        boolean boolean34 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        boolean boolean62 = reportGraph4.isEmpty("", (int) '4', 100, "hi!");
        boolean boolean67 = reportGraph4.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
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
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', 0, "");
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (short) 10, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass22 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel16 = reportGraph15.panel;
        reportGraph4.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) ' ', "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 10, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (short) 1, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) 10, (int) ' ', "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        boolean boolean50 = reportGraph4.isEmpty("", (int) (short) 10, (int) 'a', "");
        boolean boolean55 = reportGraph4.isEmpty("", 100, (int) (byte) 1, "hi!");
        boolean boolean60 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) 'a', "");
        javax.swing.JPanel jPanel66 = reportGraph65.panel;
        reportGraph4.panel = jPanel66;
        java.lang.Class<?> wildcardClass68 = jPanel66.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) '4', 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        boolean boolean40 = reportGraph34.isEmpty("hi!", 1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph34.panel;
        reportGraph24.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) 10, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        java.lang.Class<?> wildcardClass17 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        boolean boolean27 = reportGraph4.isEmpty("", 0, 1, "");
        javax.swing.JPanel jPanel28 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
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
        java.lang.Class<?> wildcardClass45 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean38 = reportGraph4.isEmpty("", (int) ' ', (int) ' ', "hi!");
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(jPanel39);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 100, "");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph30.panel = jPanel46;
        boolean boolean52 = reportGraph30.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel53 = reportGraph30.panel;
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean68 = reportGraph58.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean78 = reportGraph73.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel79 = reportGraph73.panel;
        reportGraph58.panel = jPanel79;
        reportGraph30.panel = jPanel79;
        reportGraph20.panel = jPanel79;
        javax.swing.JPanel jPanel83 = reportGraph20.panel;
        reportGraph9.panel = jPanel83;
        boolean boolean89 = reportGraph9.isEmpty("hi!", (int) (byte) 1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph9.panel;
        reportGraph4.panel = jPanel90;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jPanel79);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (-1), 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, 100, "");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "");
        boolean boolean14 = reportGraph4.isEmpty("", (-1), 0, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) '#', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        boolean boolean36 = reportGraph14.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean41 = reportGraph14.isEmpty("", (int) (byte) 10, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        reportGraph14.panel = jPanel47;
        javax.swing.JPanel jPanel49 = reportGraph14.panel;
        reportGraph4.panel = jPanel49;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel49);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        javax.swing.JPanel jPanel24 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass25 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertNotNull(jPanel24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        boolean boolean62 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass63 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 1, 0, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) ' ', "hi!");
        javax.swing.JPanel jPanel37 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean15 = reportGraph10.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        reportGraph10.panel = jPanel26;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean37 = reportGraph32.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean52 = reportGraph42.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean67 = reportGraph57.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean72 = reportGraph57.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel78 = reportGraph77.panel;
        reportGraph57.panel = jPanel78;
        reportGraph42.panel = jPanel78;
        boolean boolean85 = reportGraph42.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel86 = reportGraph42.panel;
        reportGraph32.panel = jPanel86;
        reportGraph10.panel = jPanel86;
        reportGraph4.panel = jPanel86;
        boolean boolean94 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass95 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 0, "");
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
        javax.swing.JPanel jPanel49 = null;
        reportGraph15.panel = jPanel49;
        boolean boolean55 = reportGraph15.isEmpty("hi!", 0, (int) (byte) 100, "");
        boolean boolean60 = reportGraph15.wrongAnalysisType("", (int) (byte) 10, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean75 = reportGraph65.wrongAnalysisType("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel76 = reportGraph65.panel;
        reportGraph15.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (short) 1, "hi!");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (short) 1, "");
        boolean boolean42 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass43 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        javax.swing.JPanel jPanel53 = reportGraph4.panel;
        boolean boolean58 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) 'a', "hi!");
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jPanel59);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        boolean boolean57 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) '4', "hi!");
        boolean boolean62 = reportGraph4.isEmpty("", (int) '4', (int) ' ', "");
        java.lang.Class<?> wildcardClass63 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean39 = reportGraph24.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel45 = reportGraph44.panel;
        reportGraph24.panel = jPanel45;
        reportGraph9.panel = jPanel45;
        boolean boolean52 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph9.panel;
        reportGraph4.panel = jPanel53;
        java.lang.Class<?> wildcardClass55 = jPanel53.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        reportGraph15.panel = jPanel26;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean47 = reportGraph42.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph42.panel;
        reportGraph32.panel = jPanel48;
        reportGraph15.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        javax.swing.JPanel jPanel52 = reportGraph4.panel;
        javax.swing.JPanel jPanel53 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel53);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("", 0, (int) ' ', "");
        boolean boolean29 = reportGraph9.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        boolean boolean34 = reportGraph9.isEmpty("hi!", (int) 'a', 0, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph9.panel;
        reportGraph4.panel = jPanel35;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, 0, "");
        boolean boolean29 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) '4', "hi!");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel20 = reportGraph9.panel;
        reportGraph4.panel = jPanel20;
        java.lang.Class<?> wildcardClass22 = jPanel20.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        javax.swing.JPanel jPanel8 = reportGraph4.panel;
        boolean boolean13 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertNotNull(jPanel8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph14.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) 'a', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph11 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean16 = reportGraph11.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean21 = reportGraph11.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean26 = reportGraph11.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph11.panel = jPanel32;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean43 = reportGraph38.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean48 = reportGraph38.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean53 = reportGraph38.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean73 = reportGraph68.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel74 = reportGraph68.panel;
        reportGraph58.panel = jPanel74;
        reportGraph38.panel = jPanel74;
        reportGraph11.panel = jPanel74;
        boolean boolean82 = reportGraph11.wrongAnalysisType("", 10, 100, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph11.panel;
        reportGraph4.panel = jPanel83;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph24.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        boolean boolean42 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel48 = reportGraph47.panel;
        reportGraph9.panel = jPanel48;
        boolean boolean54 = reportGraph9.wrongAnalysisType("", (int) (byte) 1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean64 = reportGraph59.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        javax.swing.JPanel jPanel66 = reportGraph59.panel;
        reportGraph9.panel = jPanel66;
        reportGraph4.panel = jPanel66;
        boolean boolean73 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass33 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.isEmpty("", (int) (short) -1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph20.panel = jPanel41;
        boolean boolean47 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean52 = reportGraph20.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean57 = reportGraph20.isEmpty("hi!", (int) ' ', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph20.panel;
        reportGraph9.panel = jPanel58;
        reportGraph4.panel = jPanel58;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph32.panel;
        boolean boolean38 = reportGraph32.isEmpty("", 10, (int) (byte) 1, "");
        boolean boolean43 = reportGraph32.wrongAnalysisType("hi!", (int) (short) 1, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel44 = reportGraph32.panel;
        reportGraph4.panel = jPanel44;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph19.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean54 = reportGraph44.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean59 = reportGraph44.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel65 = reportGraph64.panel;
        reportGraph44.panel = jPanel65;
        reportGraph29.panel = jPanel65;
        boolean boolean72 = reportGraph29.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel73 = reportGraph29.panel;
        reportGraph19.panel = jPanel73;
        boolean boolean79 = reportGraph19.isEmpty("", (int) 'a', (int) (short) 100, "");
        javax.swing.JPanel jPanel80 = reportGraph19.panel;
        boolean boolean85 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel86 = reportGraph19.panel;
        reportGraph4.panel = jPanel86;
        javax.swing.JPanel jPanel88 = reportGraph4.panel;
        boolean boolean93 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        javax.swing.JPanel jPanel31 = reportGraph29.panel;
        reportGraph24.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        javax.swing.JPanel jPanel34 = reportGraph4.panel;
        boolean boolean39 = reportGraph4.isEmpty("", 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 1, "");
        boolean boolean49 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) '#', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (short) 10, "");
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) '#', "");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) '4', 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
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
        boolean boolean57 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (short) 10, "hi!");
        boolean boolean62 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
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
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean54 = reportGraph49.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean64 = reportGraph59.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        boolean boolean70 = reportGraph59.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean75 = reportGraph59.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel76 = reportGraph59.panel;
        reportGraph49.panel = jPanel76;
        boolean boolean82 = reportGraph49.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph49.panel;
        javax.swing.JPanel jPanel84 = reportGraph49.panel;
        reportGraph4.panel = jPanel84;
        boolean boolean90 = reportGraph4.isEmpty("hi!", (int) ' ', 1, "");
        java.lang.Class<?> wildcardClass91 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) 0, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        javax.swing.JPanel jPanel21 = reportGraph19.panel;
        reportGraph14.panel = jPanel21;
        reportGraph9.panel = jPanel21;
        statsVisualiser.graph.ReportGraph reportGraph28 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean38 = reportGraph33.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean43 = reportGraph33.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel44 = reportGraph33.panel;
        reportGraph28.panel = jPanel44;
        reportGraph9.panel = jPanel44;
        reportGraph4.panel = jPanel44;
        java.lang.Class<?> wildcardClass48 = jPanel44.getClass();
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", 100, 100, "");
        boolean boolean24 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel25 = reportGraph9.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("hi!", (-1), (int) 'a', "hi!");
        javax.swing.JPanel jPanel32 = reportGraph4.panel;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (short) -1, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
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
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean54 = reportGraph49.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean64 = reportGraph59.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        boolean boolean70 = reportGraph59.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean75 = reportGraph59.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel76 = reportGraph59.panel;
        reportGraph49.panel = jPanel76;
        boolean boolean82 = reportGraph49.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph49.panel;
        javax.swing.JPanel jPanel84 = reportGraph49.panel;
        reportGraph4.panel = jPanel84;
        boolean boolean90 = reportGraph4.isEmpty("hi!", (int) ' ', 1, "");
        javax.swing.JPanel jPanel91 = reportGraph4.panel;
        boolean boolean96 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
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
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 0, "hi!");
        javax.swing.JPanel jPanel49 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jPanel49);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '4', (int) '#', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 0, "hi!");
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (-1), "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 100, "");
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) 'a', "");
        boolean boolean52 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 0, "");
        boolean boolean57 = reportGraph4.isEmpty("", (int) (short) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 0, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph20.panel = jPanel36;
        reportGraph4.panel = jPanel36;
        boolean boolean43 = reportGraph4.isEmpty("hi!", 10, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph14.panel = jPanel30;
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph36.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean66 = reportGraph61.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean71 = reportGraph61.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean76 = reportGraph61.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel82 = reportGraph81.panel;
        reportGraph61.panel = jPanel82;
        reportGraph46.panel = jPanel82;
        boolean boolean89 = reportGraph46.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph46.panel;
        reportGraph36.panel = jPanel90;
        reportGraph14.panel = jPanel90;
        reportGraph4.panel = jPanel90;
        boolean boolean98 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel11 = null;
        reportGraph4.panel = jPanel11;
        java.lang.Class<?> wildcardClass13 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
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
        javax.swing.JPanel jPanel48 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass49 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph9.panel = jPanel30;
        boolean boolean36 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean41 = reportGraph9.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph9.panel;
        reportGraph4.panel = jPanel42;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", 100, 100, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        reportGraph4.panel = jPanel11;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
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
        boolean boolean82 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel83 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
        boolean boolean66 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
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
        boolean boolean44 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 0, 0, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) '#', "");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (-1), 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
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
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph4.panel = jPanel67;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel67);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
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
        java.lang.Class<?> wildcardClass58 = jPanel53.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
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
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel48 = reportGraph42.panel;
        boolean boolean53 = reportGraph42.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean68 = reportGraph58.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean78 = reportGraph73.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel79 = reportGraph73.panel;
        reportGraph58.panel = jPanel79;
        reportGraph42.panel = jPanel79;
        reportGraph4.panel = jPanel79;
        boolean boolean87 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, 10, "");
        boolean boolean92 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass93 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(jPanel79);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", 1, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        reportGraph26.panel = jPanel37;
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("hi!", 0, 0, "hi!");
        javax.swing.JPanel jPanel44 = reportGraph43.panel;
        reportGraph26.panel = jPanel44;
        reportGraph4.panel = jPanel44;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel44);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean32 = reportGraph27.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel33 = reportGraph27.panel;
        javax.swing.JPanel jPanel34 = reportGraph27.panel;
        reportGraph4.panel = jPanel34;
        javax.swing.JPanel jPanel36 = reportGraph4.panel;
        boolean boolean41 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean24 = reportGraph14.isEmpty("hi!", 100, 100, "");
        boolean boolean29 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        javax.swing.JPanel jPanel41 = reportGraph39.panel;
        reportGraph34.panel = jPanel41;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean52 = reportGraph47.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean67 = reportGraph57.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean77 = reportGraph72.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel78 = reportGraph72.panel;
        reportGraph57.panel = jPanel78;
        reportGraph47.panel = jPanel78;
        statsVisualiser.graph.ReportGraph reportGraph85 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel86 = reportGraph85.panel;
        reportGraph47.panel = jPanel86;
        reportGraph34.panel = jPanel86;
        reportGraph14.panel = jPanel86;
        javax.swing.JPanel jPanel90 = reportGraph14.panel;
        reportGraph4.panel = jPanel90;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '#', (int) '#', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) -1, "");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) -1, (-1), "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel26);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        boolean boolean32 = reportGraph26.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel33 = reportGraph26.panel;
        boolean boolean38 = reportGraph26.wrongAnalysisType("", (int) '4', (int) 'a', "");
        boolean boolean43 = reportGraph26.wrongAnalysisType("hi!", (int) (short) 10, (int) '#', "hi!");
        javax.swing.JPanel jPanel44 = reportGraph26.panel;
        reportGraph4.panel = jPanel44;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), 0, "");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        boolean boolean25 = reportGraph19.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean40 = reportGraph30.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean45 = reportGraph30.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean60 = reportGraph50.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean65 = reportGraph50.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel66 = reportGraph50.panel;
        reportGraph30.panel = jPanel66;
        javax.swing.JPanel jPanel68 = reportGraph30.panel;
        reportGraph19.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        boolean boolean75 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel76 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel82 = reportGraph81.panel;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel15 = null;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel32 = reportGraph26.panel;
        javax.swing.JPanel jPanel33 = reportGraph26.panel;
        reportGraph4.panel = jPanel33;
        javax.swing.JPanel jPanel35 = reportGraph4.panel;
        boolean boolean40 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        boolean boolean38 = reportGraph4.isEmpty("", 0, (int) (byte) -1, "hi!");
        boolean boolean43 = reportGraph4.isEmpty("", (int) (byte) 0, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        javax.swing.JPanel jPanel19 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass20 = jPanel19.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertNotNull(jPanel19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) ' ', 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
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
        reportGraph4.panel = jPanel68;
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel77 = reportGraph76.panel;
        javax.swing.JPanel jPanel78 = reportGraph76.panel;
        boolean boolean83 = reportGraph76.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel84 = reportGraph76.panel;
        reportGraph4.panel = jPanel84;
        boolean boolean90 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (short) 100, "");
        javax.swing.JPanel jPanel91 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jPanel91);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", 0, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        java.lang.Class<?> wildcardClass44 = jPanel43.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 100, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass12 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
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
        boolean boolean61 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        boolean boolean66 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 100, (int) 'a', "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) '#', "hi!");
        boolean boolean29 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean39 = reportGraph29.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel50 = reportGraph49.panel;
        reportGraph29.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        reportGraph19.panel = jPanel50;
        reportGraph4.panel = jPanel50;
        boolean boolean59 = reportGraph4.isEmpty("", 10, 1, "hi!");
        boolean boolean64 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) 'a', "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 0, "hi!");
        boolean boolean41 = reportGraph36.wrongAnalysisType("", (int) '4', (int) ' ', "");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        reportGraph4.panel = jPanel42;
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
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
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel48 = reportGraph47.panel;
        reportGraph4.panel = jPanel48;
        javax.swing.JPanel jPanel50 = null;
        reportGraph4.panel = jPanel50;
        statsVisualiser.graph.ReportGraph reportGraph56 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 1, "hi!");
        javax.swing.JPanel jPanel57 = reportGraph56.panel;
        reportGraph4.panel = jPanel57;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        boolean boolean31 = reportGraph20.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        boolean boolean47 = reportGraph36.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean52 = reportGraph36.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel53 = reportGraph36.panel;
        reportGraph20.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean60 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) -1, "hi!");
        boolean boolean65 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 1, "");
        boolean boolean70 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) 1, "");
        boolean boolean75 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean29 = reportGraph14.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel35 = reportGraph34.panel;
        reportGraph14.panel = jPanel35;
        reportGraph4.panel = jPanel35;
        java.lang.Class<?> wildcardClass38 = jPanel35.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        boolean boolean23 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (byte) 1, "hi!");
        boolean boolean28 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (byte) 0, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        reportGraph4.panel = jPanel21;
        boolean boolean27 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        boolean boolean22 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) 'a', "hi!");
        boolean boolean27 = reportGraph4.wrongAnalysisType("hi!", 0, (int) 'a', "hi!");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) ' ', (int) 'a', "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        boolean boolean54 = reportGraph4.isEmpty("hi!", (int) '#', (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        boolean boolean62 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 1, "");
        boolean boolean67 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) -1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.isEmpty("", 10, (int) (byte) 1, "");
        boolean boolean20 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 1, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph9.panel;
        reportGraph4.panel = jPanel21;
        boolean boolean27 = reportGraph4.wrongAnalysisType("", (int) '#', (int) '4', "hi!");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 0, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 100, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) '4', "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        boolean boolean31 = reportGraph20.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean36 = reportGraph20.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel37 = reportGraph20.panel;
        reportGraph4.panel = jPanel37;
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        boolean boolean44 = reportGraph4.isEmpty("", (int) '4', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel45);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) 'a', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (byte) 0, "hi!");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) 100, "hi!");
        boolean boolean42 = reportGraph4.isEmpty("", 100, (int) (short) 0, "hi!");
        boolean boolean47 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) '4', "hi!");
        boolean boolean47 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel53 = reportGraph52.panel;
        javax.swing.JPanel jPanel54 = reportGraph52.panel;
        reportGraph4.panel = jPanel54;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 10, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 100, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel17 = reportGraph16.panel;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean32 = reportGraph22.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel33 = reportGraph22.panel;
        reportGraph16.panel = jPanel33;
        reportGraph4.panel = jPanel33;
        boolean boolean40 = reportGraph4.isEmpty("", 1, (int) (byte) 100, "hi!");
        boolean boolean45 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (byte) 1, "hi!");
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) '#', "hi!");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) 10, "");
        javax.swing.JPanel jPanel10 = null;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (short) 0, "");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel38 = reportGraph37.panel;
        javax.swing.JPanel jPanel39 = reportGraph37.panel;
        boolean boolean44 = reportGraph37.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        boolean boolean60 = reportGraph49.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean65 = reportGraph49.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel66 = reportGraph49.panel;
        reportGraph37.panel = jPanel66;
        reportGraph4.panel = jPanel66;
        boolean boolean73 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) -1, "");
        boolean boolean78 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), 100, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
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
        javax.swing.JPanel jPanel46 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(jPanel46);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", 1, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel23 = reportGraph22.panel;
        boolean boolean28 = reportGraph22.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean43 = reportGraph38.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel44 = reportGraph38.panel;
        reportGraph33.panel = jPanel44;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean55 = reportGraph50.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean65 = reportGraph60.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel66 = reportGraph60.panel;
        reportGraph50.panel = jPanel66;
        reportGraph33.panel = jPanel66;
        reportGraph22.panel = jPanel66;
        javax.swing.JPanel jPanel70 = reportGraph22.panel;
        reportGraph4.panel = jPanel70;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNotNull(jPanel70);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", (int) (byte) 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph9.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (-1), "hi!");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 0, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) 'a', "hi!");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        boolean boolean28 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 0, "");
        boolean boolean33 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (-1), "");
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 0, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean35 = reportGraph25.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph25.panel = jPanel46;
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph52.panel;
        reportGraph25.panel = jPanel53;
        reportGraph20.panel = jPanel53;
        javax.swing.JPanel jPanel56 = reportGraph20.panel;
        boolean boolean61 = reportGraph20.isEmpty("hi!", (-1), (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel62 = reportGraph20.panel;
        reportGraph4.panel = jPanel62;
        javax.swing.JPanel jPanel64 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean62 = reportGraph57.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph57.panel;
        javax.swing.JPanel jPanel64 = reportGraph57.panel;
        reportGraph4.panel = jPanel64;
        boolean boolean70 = reportGraph4.wrongAnalysisType("", 0, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean54 = reportGraph49.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        reportGraph39.panel = jPanel55;
        reportGraph19.panel = jPanel55;
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean72 = reportGraph62.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean77 = reportGraph62.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel83 = reportGraph82.panel;
        reportGraph62.panel = jPanel83;
        reportGraph19.panel = jPanel83;
        reportGraph4.panel = jPanel83;
        statsVisualiser.graph.ReportGraph reportGraph91 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 0, "hi!");
        javax.swing.JPanel jPanel92 = reportGraph91.panel;
        reportGraph4.panel = jPanel92;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (byte) 10, "");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) '#', "");
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 10, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        boolean boolean40 = reportGraph29.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean45 = reportGraph29.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel46 = reportGraph29.panel;
        reportGraph19.panel = jPanel46;
        boolean boolean52 = reportGraph19.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph19.panel;
        javax.swing.JPanel jPanel54 = reportGraph19.panel;
        boolean boolean59 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 0, 10, "");
        boolean boolean64 = reportGraph19.isEmpty("", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel65 = reportGraph19.panel;
        reportGraph9.panel = jPanel65;
        reportGraph4.panel = jPanel65;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        statsVisualiser.graph.ReportGraph reportGraph87 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 100, "hi!");
        javax.swing.JPanel jPanel88 = reportGraph87.panel;
        reportGraph4.panel = jPanel88;
        javax.swing.JPanel jPanel90 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) ' ', (int) (short) 0, "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) '4', (int) (byte) 100, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", 10, 1, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (-1), "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
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
        boolean boolean61 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 0, "");
        boolean boolean66 = reportGraph4.wrongAnalysisType("hi!", 0, (int) ' ', "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph34.panel = jPanel40;
        reportGraph19.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(jPanel45);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 100, "hi!");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean30 = reportGraph9.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel31 = reportGraph9.panel;
        reportGraph4.panel = jPanel31;
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass34 = jPanel33.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        boolean boolean26 = reportGraph15.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean31 = reportGraph15.wrongAnalysisType("", (int) (short) 10, 1, "");
        boolean boolean36 = reportGraph15.wrongAnalysisType("", (int) ' ', (int) (byte) -1, "");
        javax.swing.JPanel jPanel37 = reportGraph15.panel;
        reportGraph4.panel = jPanel37;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        reportGraph4.panel = jPanel11;
        boolean boolean17 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean27 = reportGraph22.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        javax.swing.JPanel jPanel28 = reportGraph22.panel;
        reportGraph4.panel = jPanel28;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean41 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass43 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        javax.swing.JPanel jPanel85 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel85);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (short) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        boolean boolean60 = reportGraph4.isEmpty("", (int) '#', (int) (short) 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph11 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean21 = reportGraph16.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean26 = reportGraph16.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean41 = reportGraph36.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        reportGraph31.panel = jPanel42;
        reportGraph16.panel = jPanel42;
        javax.swing.JPanel jPanel45 = reportGraph16.panel;
        reportGraph11.panel = jPanel45;
        reportGraph4.panel = jPanel45;
        javax.swing.JPanel jPanel48 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel48);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (-1), "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) '4', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        boolean boolean48 = reportGraph4.isEmpty("", 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel49 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 10, 0, "");
        boolean boolean24 = reportGraph4.isEmpty("", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), (int) '#', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", 0, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) (byte) -1, 0, "hi!");
        boolean boolean34 = reportGraph24.wrongAnalysisType("", 10, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph39.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel45 = reportGraph39.panel;
        boolean boolean50 = reportGraph39.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean60 = reportGraph55.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel61 = reportGraph55.panel;
        boolean boolean66 = reportGraph55.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean71 = reportGraph55.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel72 = reportGraph55.panel;
        reportGraph39.panel = jPanel72;
        javax.swing.JPanel jPanel74 = reportGraph39.panel;
        reportGraph24.panel = jPanel74;
        javax.swing.JPanel jPanel76 = reportGraph24.panel;
        reportGraph19.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertNotNull(jPanel76);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean41 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 10, "hi!");
        boolean boolean46 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        boolean boolean51 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        boolean boolean41 = reportGraph30.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean46 = reportGraph30.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel47 = reportGraph30.panel;
        reportGraph20.panel = jPanel47;
        reportGraph4.panel = jPanel47;
        boolean boolean54 = reportGraph4.isEmpty("", (int) (byte) 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
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
        java.lang.Class<?> wildcardClass80 = jPanel78.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        boolean boolean26 = reportGraph15.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean31 = reportGraph15.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel32 = reportGraph15.panel;
        boolean boolean37 = reportGraph15.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel38 = reportGraph15.panel;
        javax.swing.JPanel jPanel39 = reportGraph15.panel;
        reportGraph10.panel = jPanel39;
        reportGraph4.panel = jPanel39;
        boolean boolean46 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) '4', 100, "hi!");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass44 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        boolean boolean53 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) '4', "");
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean32 = reportGraph27.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean37 = reportGraph27.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel48 = reportGraph42.panel;
        reportGraph27.panel = jPanel48;
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel55 = reportGraph54.panel;
        reportGraph27.panel = jPanel55;
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel62 = reportGraph61.panel;
        reportGraph27.panel = jPanel62;
        reportGraph4.panel = jPanel62;
        boolean boolean69 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) 10, "");
        boolean boolean74 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel12);
    }
}

