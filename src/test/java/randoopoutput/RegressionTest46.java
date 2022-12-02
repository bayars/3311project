package randoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest46 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) 'a', "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("", (int) (short) -1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
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
        boolean boolean87 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel88 = null;
        reportGraph4.panel = jPanel88;
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        boolean boolean48 = reportGraph37.isEmpty("hi!", (int) (byte) 100, (int) 'a', "hi!");
        javax.swing.JPanel jPanel49 = reportGraph37.panel;
        reportGraph4.panel = jPanel49;
        java.lang.Class<?> wildcardClass51 = jPanel49.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = jPanel12.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (short) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        java.lang.Class<?> wildcardClass44 = jPanel43.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean30 = reportGraph20.isEmpty("hi!", 100, 100, "");
        boolean boolean35 = reportGraph20.wrongAnalysisType("", (int) (byte) 100, 1, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel46 = reportGraph45.panel;
        javax.swing.JPanel jPanel47 = reportGraph45.panel;
        reportGraph40.panel = jPanel47;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean58 = reportGraph53.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean68 = reportGraph63.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean73 = reportGraph63.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph78 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean83 = reportGraph78.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel84 = reportGraph78.panel;
        reportGraph63.panel = jPanel84;
        reportGraph53.panel = jPanel84;
        statsVisualiser.graph.ReportGraph reportGraph91 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel92 = reportGraph91.panel;
        reportGraph53.panel = jPanel92;
        reportGraph40.panel = jPanel92;
        reportGraph20.panel = jPanel92;
        javax.swing.JPanel jPanel96 = reportGraph20.panel;
        reportGraph9.panel = jPanel96;
        reportGraph4.panel = jPanel96;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(jPanel96);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel43 = reportGraph42.panel;
        reportGraph4.panel = jPanel43;
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        boolean boolean50 = reportGraph4.isEmpty("", (int) '4', 100, "");
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass52 = jPanel51.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean19 = reportGraph9.isEmpty("", (int) (byte) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean39 = reportGraph24.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean59 = reportGraph54.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph54.panel;
        reportGraph44.panel = jPanel60;
        reportGraph24.panel = jPanel60;
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean72 = reportGraph67.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean77 = reportGraph67.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean82 = reportGraph67.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph87 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel88 = reportGraph87.panel;
        reportGraph67.panel = jPanel88;
        reportGraph24.panel = jPanel88;
        reportGraph9.panel = jPanel88;
        reportGraph4.panel = jPanel88;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jPanel88);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass26 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        boolean boolean31 = reportGraph9.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel32 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean52 = reportGraph42.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean57 = reportGraph42.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel63 = reportGraph62.panel;
        reportGraph42.panel = jPanel63;
        reportGraph37.panel = jPanel63;
        reportGraph9.panel = jPanel63;
        reportGraph4.panel = jPanel63;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel63);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) 0, 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        boolean boolean75 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel76 = reportGraph4.panel;
        boolean boolean81 = reportGraph4.isEmpty("", 1, 1, "");
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
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        boolean boolean43 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (short) -1, "hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph19.panel = jPanel35;
        boolean boolean41 = reportGraph19.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel42 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph47.panel = jPanel68;
        reportGraph19.panel = jPanel68;
        reportGraph9.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 10, "hi!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        boolean boolean75 = reportGraph4.wrongAnalysisType("", 100, (int) ' ', "hi!");
        javax.swing.JPanel jPanel76 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) '4', "hi!");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        boolean boolean99 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (byte) -1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        reportGraph14.panel = jPanel40;
        reportGraph9.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        java.lang.Class<?> wildcardClass45 = jPanel40.getClass();
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '4', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 1, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", 1, 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean47 = reportGraph37.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean52 = reportGraph37.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel58 = reportGraph57.panel;
        reportGraph37.panel = jPanel58;
        reportGraph32.panel = jPanel58;
        reportGraph4.panel = jPanel58;
        boolean boolean66 = reportGraph4.isEmpty("hi!", 10, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 10, "");
        javax.swing.JPanel jPanel21 = null;
        reportGraph4.panel = jPanel21;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (-1), "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        javax.swing.JPanel jPanel40 = null;
        reportGraph4.panel = jPanel40;
        boolean boolean46 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.lang.Class<?> wildcardClass87 = jPanel82.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) '4', "");
        java.lang.Class<?> wildcardClass27 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        boolean boolean49 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 100, "hi!");
        boolean boolean54 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean55 = reportGraph50.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel56 = reportGraph50.panel;
        reportGraph40.panel = jPanel56;
        boolean boolean62 = reportGraph40.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel63 = reportGraph40.panel;
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean78 = reportGraph68.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph83 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean88 = reportGraph83.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel89 = reportGraph83.panel;
        reportGraph68.panel = jPanel89;
        reportGraph40.panel = jPanel89;
        reportGraph30.panel = jPanel89;
        javax.swing.JPanel jPanel93 = reportGraph30.panel;
        reportGraph19.panel = jPanel93;
        reportGraph4.panel = jPanel93;
        java.lang.Class<?> wildcardClass96 = jPanel93.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, 10, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.isEmpty("", 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass23 = jPanel22.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (-1), (int) '#', "hi!");
        boolean boolean25 = reportGraph4.isEmpty("hi!", 1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass26 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
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
        boolean boolean64 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean74 = reportGraph69.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph69.panel;
        boolean boolean80 = reportGraph69.isEmpty("hi!", (int) 'a', (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel81 = reportGraph69.panel;
        reportGraph4.panel = jPanel81;
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
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
        boolean boolean77 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel78 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (-1), "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        boolean boolean16 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) ' ', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', 1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
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
        boolean boolean77 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 0, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        boolean boolean82 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 10, "");
        boolean boolean87 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (short) 100, "");
        boolean boolean92 = reportGraph4.isEmpty("", (-1), (int) '#', "");
        javax.swing.JPanel jPanel93 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass94 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("", (int) (short) -1, (-1), "hi!");
        boolean boolean35 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass36 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 1, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 100, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        java.lang.Class<?> wildcardClass17 = jPanel15.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) '#', "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        boolean boolean16 = reportGraph4.isEmpty("hi!", (int) '#', (int) 'a', "");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 0, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, 0, "hi!");
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
        java.lang.Class<?> wildcardClass64 = jPanel60.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", 10, 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("", 1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass25 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph4.panel = jPanel16;
        boolean boolean22 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass23 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        boolean boolean52 = reportGraph4.wrongAnalysisType("", 100, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, 0, "");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean43 = reportGraph38.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel54 = reportGraph48.panel;
        boolean boolean59 = reportGraph48.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean64 = reportGraph48.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel65 = reportGraph48.panel;
        reportGraph38.panel = jPanel65;
        boolean boolean71 = reportGraph38.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean76 = reportGraph38.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel77 = reportGraph38.panel;
        javax.swing.JPanel jPanel78 = reportGraph38.panel;
        reportGraph4.panel = jPanel78;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(jPanel78);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) (short) 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph4.panel = jPanel35;
        java.lang.Class<?> wildcardClass37 = jPanel35.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        reportGraph44.panel = jPanel55;
        boolean boolean61 = reportGraph44.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel62 = reportGraph44.panel;
        reportGraph4.panel = jPanel62;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jPanel62);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) ' ', (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean45 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        reportGraph30.panel = jPanel46;
        reportGraph19.panel = jPanel46;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean63 = reportGraph53.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean78 = reportGraph68.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean83 = reportGraph68.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph88 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel89 = reportGraph88.panel;
        reportGraph68.panel = jPanel89;
        reportGraph53.panel = jPanel89;
        reportGraph19.panel = jPanel89;
        reportGraph4.panel = jPanel89;
        javax.swing.JPanel jPanel94 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel94);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        javax.swing.JPanel jPanel61 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass62 = jPanel61.getClass();
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
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, 1, "");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        javax.swing.JPanel jPanel49 = reportGraph4.panel;
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass51 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel32 = reportGraph26.panel;
        javax.swing.JPanel jPanel33 = reportGraph26.panel;
        reportGraph4.panel = jPanel33;
        java.lang.Class<?> wildcardClass35 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        boolean boolean56 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 0, "");
        boolean boolean61 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 0, "hi!");
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
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 1, "hi!");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
        java.lang.Class<?> wildcardClass52 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 100, 0, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 10, "");
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
        boolean boolean96 = reportGraph4.isEmpty("", (int) (short) 10, (int) '4', "");
        javax.swing.JPanel jPanel97 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass98 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(jPanel97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        boolean boolean77 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean82 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) '#', "hi!");
        boolean boolean87 = reportGraph4.isEmpty("", (int) (byte) -1, 1, "hi!");
        boolean boolean92 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel93 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(jPanel93);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
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
        boolean boolean49 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 0, "");
        java.lang.Class<?> wildcardClass50 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph9.panel = jPanel25;
        boolean boolean31 = reportGraph9.wrongAnalysisType("hi!", (int) ' ', 100, "");
        boolean boolean36 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 10, "");
        javax.swing.JPanel jPanel37 = reportGraph9.panel;
        reportGraph4.panel = jPanel37;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) 'a', "hi!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) -1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        boolean boolean48 = reportGraph37.isEmpty("hi!", (int) (byte) 100, (int) 'a', "hi!");
        javax.swing.JPanel jPanel49 = reportGraph37.panel;
        reportGraph4.panel = jPanel49;
        boolean boolean55 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 100, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
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
        boolean boolean47 = reportGraph4.wrongAnalysisType("", (-1), 100, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        java.lang.Class<?> wildcardClass94 = jPanel91.getClass();
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (-1), (int) (byte) 0, "");
        boolean boolean36 = reportGraph4.isEmpty("", (int) (byte) -1, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean46 = reportGraph41.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean51 = reportGraph41.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph56 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean66 = reportGraph61.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph56.panel = jPanel67;
        reportGraph41.panel = jPanel67;
        boolean boolean74 = reportGraph41.isEmpty("hi!", (int) (short) 1, 10, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph41.panel;
        boolean boolean80 = reportGraph41.isEmpty("hi!", (int) (byte) 10, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph85 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean90 = reportGraph85.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel91 = reportGraph85.panel;
        javax.swing.JPanel jPanel92 = reportGraph85.panel;
        javax.swing.JPanel jPanel93 = reportGraph85.panel;
        reportGraph41.panel = jPanel93;
        reportGraph4.panel = jPanel93;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(jPanel93);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        boolean boolean31 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 10, "");
        javax.swing.JPanel jPanel32 = reportGraph4.panel;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) ' ', (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        boolean boolean46 = reportGraph35.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean51 = reportGraph35.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel52 = reportGraph35.panel;
        reportGraph25.panel = jPanel52;
        boolean boolean58 = reportGraph25.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean68 = reportGraph63.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean73 = reportGraph63.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph78 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph83 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean88 = reportGraph83.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel89 = reportGraph83.panel;
        reportGraph78.panel = jPanel89;
        reportGraph63.panel = jPanel89;
        javax.swing.JPanel jPanel92 = reportGraph63.panel;
        reportGraph25.panel = jPanel92;
        reportGraph20.panel = jPanel92;
        reportGraph4.panel = jPanel92;
        java.lang.Class<?> wildcardClass96 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
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
        boolean boolean52 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
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
        boolean boolean38 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass44 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph9.isEmpty("hi!", 0, (int) 'a', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        boolean boolean22 = reportGraph4.isEmpty("", (int) (short) 10, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        boolean boolean64 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '4', "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 10, "hi!");
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
        javax.swing.JPanel jPanel50 = reportGraph9.panel;
        javax.swing.JPanel jPanel51 = reportGraph9.panel;
        reportGraph4.panel = jPanel51;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
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
        boolean boolean94 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, 0, "hi!");
        javax.swing.JPanel jPanel95 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', 0, "hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        boolean boolean82 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 10, "");
        boolean boolean87 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (short) 100, "");
        boolean boolean92 = reportGraph4.isEmpty("", (-1), (int) '#', "");
        javax.swing.JPanel jPanel93 = reportGraph4.panel;
        boolean boolean98 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) ' ', "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 100, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph26.panel = jPanel37;
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean48 = reportGraph43.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean58 = reportGraph53.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel59 = reportGraph53.panel;
        reportGraph43.panel = jPanel59;
        reportGraph26.panel = jPanel59;
        boolean boolean66 = reportGraph26.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel67 = reportGraph26.panel;
        javax.swing.JPanel jPanel68 = reportGraph26.panel;
        reportGraph4.panel = jPanel68;
        boolean boolean74 = reportGraph4.isEmpty("hi!", (-1), (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph20.panel = jPanel36;
        reportGraph4.panel = jPanel36;
        boolean boolean43 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        javax.swing.JPanel jPanel12 = reportGraph10.panel;
        boolean boolean17 = reportGraph10.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel28 = reportGraph22.panel;
        boolean boolean33 = reportGraph22.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean38 = reportGraph22.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel39 = reportGraph22.panel;
        reportGraph10.panel = jPanel39;
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean55 = reportGraph45.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean70 = reportGraph65.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph60.panel = jPanel71;
        reportGraph45.panel = jPanel71;
        javax.swing.JPanel jPanel74 = reportGraph45.panel;
        reportGraph10.panel = jPanel74;
        reportGraph4.panel = jPanel74;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(jPanel74);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) 'a', "");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
        boolean boolean76 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean81 = reportGraph4.wrongAnalysisType("", 10, (int) (short) 100, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 1, "hi!");
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
        javax.swing.JPanel jPanel49 = null;
        reportGraph15.panel = jPanel49;
        boolean boolean55 = reportGraph15.isEmpty("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean65 = reportGraph60.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean70 = reportGraph60.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph80 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean85 = reportGraph80.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel86 = reportGraph80.panel;
        reportGraph75.panel = jPanel86;
        reportGraph60.panel = jPanel86;
        javax.swing.JPanel jPanel89 = reportGraph60.panel;
        reportGraph15.panel = jPanel89;
        javax.swing.JPanel jPanel91 = reportGraph15.panel;
        statsVisualiser.graph.ReportGraph reportGraph96 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel97 = reportGraph96.panel;
        reportGraph15.panel = jPanel97;
        reportGraph4.panel = jPanel97;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel97);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        boolean boolean27 = reportGraph4.isEmpty("", 1, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), 10, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
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
        boolean boolean98 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
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
        boolean boolean64 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean74 = reportGraph69.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean79 = reportGraph69.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean84 = reportGraph69.wrongAnalysisType("", (int) (short) -1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel85 = reportGraph69.panel;
        reportGraph4.panel = jPanel85;
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(jPanel85);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) ' ', 1, "");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 10, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean15 = reportGraph10.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph10.panel;
        boolean boolean21 = reportGraph10.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel22 = reportGraph10.panel;
        boolean boolean27 = reportGraph10.isEmpty("hi!", (int) (byte) 0, (int) 'a', "");
        javax.swing.JPanel jPanel28 = reportGraph10.panel;
        reportGraph4.panel = jPanel28;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (-1), "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
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
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean58 = reportGraph48.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean73 = reportGraph68.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel74 = reportGraph68.panel;
        reportGraph63.panel = jPanel74;
        reportGraph48.panel = jPanel74;
        boolean boolean81 = reportGraph48.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        boolean boolean86 = reportGraph48.isEmpty("hi!", (int) (byte) 0, (int) '4', "");
        javax.swing.JPanel jPanel87 = reportGraph48.panel;
        reportGraph4.panel = jPanel87;
        boolean boolean93 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph35.panel;
        javax.swing.JPanel jPanel52 = reportGraph35.panel;
        reportGraph4.panel = jPanel52;
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (short) 10, "hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (-1), "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
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
        javax.swing.JPanel jPanel49 = reportGraph4.panel;
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean24 = reportGraph14.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel25 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean35 = reportGraph30.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph14.panel = jPanel36;
        reportGraph4.panel = jPanel36;
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph23 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph28 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean33 = reportGraph28.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel34 = reportGraph28.panel;
        reportGraph23.panel = jPanel34;
        boolean boolean40 = reportGraph23.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel41 = reportGraph23.panel;
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        javax.swing.JPanel jPanel53 = reportGraph46.panel;
        reportGraph23.panel = jPanel53;
        boolean boolean59 = reportGraph23.isEmpty("", (-1), 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel65 = reportGraph64.panel;
        javax.swing.JPanel jPanel66 = reportGraph64.panel;
        reportGraph23.panel = jPanel66;
        reportGraph4.panel = jPanel66;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertNotNull(jPanel66);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) -1, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 10, "");
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean35 = reportGraph20.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel41 = reportGraph40.panel;
        reportGraph20.panel = jPanel41;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean62 = reportGraph47.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean72 = reportGraph67.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean82 = reportGraph77.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph77.panel;
        reportGraph67.panel = jPanel83;
        reportGraph47.panel = jPanel83;
        reportGraph20.panel = jPanel83;
        boolean boolean91 = reportGraph20.isEmpty("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel92 = reportGraph20.panel;
        reportGraph4.panel = jPanel92;
        java.lang.Class<?> wildcardClass94 = jPanel92.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        java.lang.Class<?> wildcardClass84 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        boolean boolean82 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "");
        boolean boolean87 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 1, "");
        javax.swing.JPanel jPanel88 = reportGraph4.panel;
        javax.swing.JPanel jPanel89 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertNotNull(jPanel89);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
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
        boolean boolean71 = reportGraph4.isEmpty("", 10, 1, "");
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
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean54 = reportGraph49.wrongAnalysisType("hi!", 10, (int) (byte) 100, "");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        reportGraph4.panel = jPanel55;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel55);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
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
        boolean boolean49 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 0, "");
        boolean boolean54 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) -1, "");
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) -1, "hi!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("", (int) (byte) 1, 10, "hi!");
        boolean boolean32 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass33 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        javax.swing.JPanel jPanel21 = reportGraph19.panel;
        boolean boolean26 = reportGraph19.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph19.panel;
        javax.swing.JPanel jPanel28 = reportGraph19.panel;
        reportGraph14.panel = jPanel28;
        reportGraph4.panel = jPanel28;
        java.lang.Class<?> wildcardClass31 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        boolean boolean62 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 100, "");
        boolean boolean67 = reportGraph4.isEmpty("", (int) (byte) 100, (-1), "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, 0, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', 100, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 1, "hi!");
        boolean boolean53 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "");
        java.lang.Class<?> wildcardClass54 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        boolean boolean22 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass12 = jPanel11.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
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
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 100, "");
        boolean boolean52 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (-1), "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("", 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        reportGraph4.panel = jPanel11;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) ' ', "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass26 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 100, "");
        javax.swing.JPanel jPanel20 = null;
        reportGraph4.panel = jPanel20;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        reportGraph4.panel = jPanel26;
        java.lang.Class<?> wildcardClass28 = jPanel26.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph14.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel33 = reportGraph32.panel;
        javax.swing.JPanel jPanel34 = reportGraph32.panel;
        boolean boolean39 = reportGraph32.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        boolean boolean55 = reportGraph44.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean60 = reportGraph44.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel61 = reportGraph44.panel;
        reportGraph32.panel = jPanel61;
        javax.swing.JPanel jPanel63 = reportGraph32.panel;
        reportGraph4.panel = jPanel63;
        boolean boolean69 = reportGraph4.isEmpty("", (int) (short) 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) ' ', "hi!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 100, (int) 'a', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean31 = reportGraph26.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        reportGraph26.panel = jPanel42;
        boolean boolean48 = reportGraph26.wrongAnalysisType("hi!", (int) ' ', 100, "");
        boolean boolean53 = reportGraph26.wrongAnalysisType("", (int) '4', (int) (byte) 10, "");
        javax.swing.JPanel jPanel54 = reportGraph26.panel;
        reportGraph4.panel = jPanel54;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
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
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel69 = reportGraph68.panel;
        javax.swing.JPanel jPanel70 = reportGraph68.panel;
        reportGraph63.panel = jPanel70;
        reportGraph58.panel = jPanel70;
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean87 = reportGraph82.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean92 = reportGraph82.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel93 = reportGraph82.panel;
        reportGraph77.panel = jPanel93;
        reportGraph58.panel = jPanel93;
        reportGraph53.panel = jPanel93;
        reportGraph4.panel = jPanel93;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jPanel69);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(jPanel93);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (-1), "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel17 = reportGraph9.panel;
        boolean boolean22 = reportGraph9.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel23 = reportGraph9.panel;
        reportGraph4.panel = jPanel23;
        boolean boolean29 = reportGraph4.isEmpty("", (int) (short) 1, 100, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
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
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "hi!");
        boolean boolean60 = reportGraph4.wrongAnalysisType("", 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) -1, "");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean29 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 10, "");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        javax.swing.JPanel jPanel31 = null;
        reportGraph4.panel = jPanel31;
        java.lang.Class<?> wildcardClass33 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 0, "hi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
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
        javax.swing.JPanel jPanel35 = reportGraph4.panel;
        boolean boolean40 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (short) 0, "");
        boolean boolean45 = reportGraph4.isEmpty("", (int) (short) 0, (int) (byte) 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean45 = reportGraph35.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean50 = reportGraph35.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel56 = reportGraph55.panel;
        reportGraph35.panel = jPanel56;
        reportGraph20.panel = jPanel56;
        boolean boolean63 = reportGraph20.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel64 = reportGraph20.panel;
        reportGraph4.panel = jPanel64;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 100, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
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
        reportGraph14.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        java.lang.Class<?> wildcardClass52 = jPanel48.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
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
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean72 = reportGraph62.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean82 = reportGraph77.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel83 = reportGraph77.panel;
        reportGraph62.panel = jPanel83;
        statsVisualiser.graph.ReportGraph reportGraph89 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph89.panel;
        reportGraph62.panel = jPanel90;
        reportGraph4.panel = jPanel90;
        java.lang.Class<?> wildcardClass93 = jPanel90.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
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
        java.lang.Class<?> wildcardClass67 = reportGraph4.getClass();
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
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
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
        javax.swing.JPanel jPanel58 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (short) 10, "hi!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
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
        java.lang.Class<?> wildcardClass52 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) '4', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
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
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel71 = reportGraph70.panel;
        reportGraph4.panel = jPanel71;
        java.lang.Class<?> wildcardClass73 = jPanel71.getClass();
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
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        boolean boolean70 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) -1, "");
        boolean boolean75 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 1, "hi!");
        boolean boolean80 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) '#', "");
        java.lang.Class<?> wildcardClass81 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
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
        boolean boolean38 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) 'a', "hi!");
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) '#', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
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
        javax.swing.JPanel jPanel78 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel78);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass17 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 1, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
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
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel59 = reportGraph58.panel;
        javax.swing.JPanel jPanel60 = reportGraph58.panel;
        reportGraph53.panel = jPanel60;
        reportGraph48.panel = jPanel60;
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean77 = reportGraph72.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean82 = reportGraph72.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel83 = reportGraph72.panel;
        reportGraph67.panel = jPanel83;
        reportGraph48.panel = jPanel83;
        reportGraph4.panel = jPanel83;
        java.lang.Class<?> wildcardClass87 = jPanel83.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph19.panel = jPanel35;
        boolean boolean41 = reportGraph19.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel42 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph47.panel = jPanel68;
        reportGraph19.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        java.lang.Class<?> wildcardClass72 = jPanel68.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        boolean boolean47 = reportGraph4.isEmpty("", (int) (byte) 0, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
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
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        boolean boolean65 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) 'a', "");
        java.lang.Class<?> wildcardClass66 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
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
        boolean boolean75 = reportGraph4.wrongAnalysisType("", 10, 100, "hi!");
        java.lang.Class<?> wildcardClass76 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 1, "hi!");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
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
        javax.swing.JPanel jPanel39 = reportGraph4.panel;
        javax.swing.JPanel jPanel40 = reportGraph4.panel;
        boolean boolean45 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        java.lang.Class<?> wildcardClass17 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, 0, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", 0, 0, "");
        boolean boolean20 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (-1), "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
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
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(jPanel57);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, (int) (byte) 100, "");
        boolean boolean24 = reportGraph4.isEmpty("", 0, 0, "");
        boolean boolean29 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 100, "");
        boolean boolean34 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        boolean boolean22 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean27 = reportGraph4.isEmpty("", 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph14.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel33 = reportGraph32.panel;
        javax.swing.JPanel jPanel34 = reportGraph32.panel;
        boolean boolean39 = reportGraph32.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        boolean boolean55 = reportGraph44.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean60 = reportGraph44.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel61 = reportGraph44.panel;
        reportGraph32.panel = jPanel61;
        javax.swing.JPanel jPanel63 = reportGraph32.panel;
        reportGraph4.panel = jPanel63;
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean74 = reportGraph69.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean79 = reportGraph69.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean84 = reportGraph69.isEmpty("hi!", 1, (int) (short) 100, "");
        javax.swing.JPanel jPanel85 = reportGraph69.panel;
        reportGraph4.panel = jPanel85;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(jPanel85);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
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
        boolean boolean49 = reportGraph4.isEmpty("", 0, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 1, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) -1, "");
        boolean boolean22 = reportGraph4.isEmpty("hi!", (-1), (int) '#', "hi!");
        boolean boolean27 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (-1), "");
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph19.panel = jPanel35;
        boolean boolean41 = reportGraph19.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        boolean boolean46 = reportGraph19.wrongAnalysisType("", 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel47 = reportGraph19.panel;
        reportGraph4.panel = jPanel47;
        boolean boolean53 = reportGraph4.isEmpty("hi!", (int) ' ', 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) '#', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel33 = reportGraph32.panel;
        reportGraph4.panel = jPanel33;
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean54 = reportGraph44.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean59 = reportGraph44.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel65 = reportGraph64.panel;
        reportGraph44.panel = jPanel65;
        reportGraph39.panel = jPanel65;
        boolean boolean72 = reportGraph39.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "");
        boolean boolean77 = reportGraph39.isEmpty("", (int) '4', (int) (byte) -1, "");
        javax.swing.JPanel jPanel78 = reportGraph39.panel;
        reportGraph4.panel = jPanel78;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jPanel78);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) '4', (int) (short) 0, "");
        boolean boolean29 = reportGraph4.isEmpty("", (int) (short) -1, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
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
        boolean boolean65 = reportGraph4.isEmpty("", 0, (-1), "");
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
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 100, "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) '4', "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
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
        boolean boolean61 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 1, "hi!");
        boolean boolean66 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) -1, "");
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
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
        boolean boolean82 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "");
        boolean boolean87 = reportGraph4.isEmpty("", (int) ' ', (int) (short) 0, "");
        boolean boolean92 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 100, "");
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
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        javax.swing.JPanel jPanel60 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass61 = jPanel60.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) '#', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass21 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 10, (int) '#', "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph19.panel = jPanel35;
        boolean boolean41 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean66 = reportGraph61.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph46.panel = jPanel67;
        reportGraph19.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        java.lang.Class<?> wildcardClass71 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 10, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
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
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        boolean boolean62 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        boolean boolean31 = reportGraph9.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel32 = reportGraph9.panel;
        javax.swing.JPanel jPanel33 = reportGraph9.panel;
        reportGraph4.panel = jPanel33;
        boolean boolean39 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        boolean boolean28 = reportGraph4.isEmpty("", (int) (byte) -1, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 100, (int) '4', "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) 'a', 10, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) ' ', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel32 = reportGraph26.panel;
        boolean boolean37 = reportGraph26.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean52 = reportGraph42.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel63 = reportGraph57.panel;
        reportGraph42.panel = jPanel63;
        reportGraph26.panel = jPanel63;
        reportGraph15.panel = jPanel63;
        boolean boolean71 = reportGraph15.isEmpty("hi!", (int) (short) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean81 = reportGraph76.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel82 = reportGraph76.panel;
        reportGraph15.panel = jPanel82;
        reportGraph9.panel = jPanel82;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
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
        boolean boolean44 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 100, "");
        boolean boolean49 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean59 = reportGraph54.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean64 = reportGraph54.wrongAnalysisType("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel65 = reportGraph54.panel;
        reportGraph4.panel = jPanel65;
        java.lang.Class<?> wildcardClass67 = jPanel65.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 0, "");
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
        javax.swing.JPanel jPanel31 = reportGraph9.panel;
        reportGraph4.panel = jPanel31;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
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
        boolean boolean38 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean58 = reportGraph53.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel59 = reportGraph53.panel;
        reportGraph48.panel = jPanel59;
        reportGraph4.panel = jPanel59;
        boolean boolean66 = reportGraph4.isEmpty("", 100, (int) (short) 10, "hi!");
        boolean boolean71 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel72 = reportGraph4.panel;
        boolean boolean77 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, 1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 100, "");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph19.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        javax.swing.JPanel jPanel28 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel28);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        boolean boolean12 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 10, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        boolean boolean21 = reportGraph16.wrongAnalysisType("hi!", (int) (byte) -1, 0, "hi!");
        boolean boolean26 = reportGraph16.wrongAnalysisType("", 10, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        boolean boolean42 = reportGraph31.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        boolean boolean58 = reportGraph47.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean63 = reportGraph47.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel64 = reportGraph47.panel;
        reportGraph31.panel = jPanel64;
        javax.swing.JPanel jPanel66 = reportGraph31.panel;
        reportGraph16.panel = jPanel66;
        reportGraph4.panel = jPanel66;
        boolean boolean73 = reportGraph4.isEmpty("", (int) (short) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass74 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (short) 100, (int) 'a', "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) -1, 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass17 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 100, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean15 = reportGraph10.wrongAnalysisType("", 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        boolean boolean41 = reportGraph30.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean46 = reportGraph30.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel47 = reportGraph30.panel;
        reportGraph20.panel = jPanel47;
        boolean boolean53 = reportGraph20.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean68 = reportGraph58.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph78 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean83 = reportGraph78.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel84 = reportGraph78.panel;
        reportGraph73.panel = jPanel84;
        reportGraph58.panel = jPanel84;
        javax.swing.JPanel jPanel87 = reportGraph58.panel;
        reportGraph20.panel = jPanel87;
        reportGraph10.panel = jPanel87;
        reportGraph4.panel = jPanel87;
        java.lang.Class<?> wildcardClass91 = jPanel87.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
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
        boolean boolean48 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 0, "");
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
        reportGraph4.panel = jPanel89;
        javax.swing.JPanel jPanel94 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass95 = jPanel94.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        org.junit.Assert.assertNotNull(jPanel94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
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
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel61 = reportGraph60.panel;
        reportGraph4.panel = jPanel61;
        boolean boolean67 = reportGraph4.isEmpty("", (int) (short) 0, (int) '4', "");
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
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean34 = reportGraph24.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean49 = reportGraph44.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        reportGraph39.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        javax.swing.JPanel jPanel53 = reportGraph24.panel;
        reportGraph19.panel = jPanel53;
        reportGraph14.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean61 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 100, "hi!");
        java.lang.Class<?> wildcardClass62 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        boolean boolean21 = reportGraph9.wrongAnalysisType("", (int) '4', (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean36 = reportGraph26.isEmpty("hi!", 100, 100, "");
        boolean boolean41 = reportGraph26.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean46 = reportGraph26.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean51 = reportGraph26.isEmpty("", (int) ' ', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph56 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean66 = reportGraph61.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        boolean boolean72 = reportGraph61.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean77 = reportGraph61.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel78 = reportGraph61.panel;
        reportGraph56.panel = jPanel78;
        reportGraph26.panel = jPanel78;
        reportGraph9.panel = jPanel78;
        reportGraph4.panel = jPanel78;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (short) 0, "hi!");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        boolean boolean41 = reportGraph30.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        boolean boolean57 = reportGraph46.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean62 = reportGraph46.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel63 = reportGraph46.panel;
        reportGraph30.panel = jPanel63;
        reportGraph14.panel = jPanel63;
        boolean boolean70 = reportGraph14.wrongAnalysisType("", (int) (short) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel71 = reportGraph14.panel;
        reportGraph4.panel = jPanel71;
        boolean boolean77 = reportGraph4.isEmpty("", 100, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean47 = reportGraph37.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean52 = reportGraph37.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel58 = reportGraph57.panel;
        reportGraph37.panel = jPanel58;
        reportGraph32.panel = jPanel58;
        reportGraph4.panel = jPanel58;
        java.lang.Class<?> wildcardClass62 = jPanel58.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "hi!");
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
        reportGraph4.panel = jPanel81;
        statsVisualiser.graph.ReportGraph reportGraph87 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean92 = reportGraph87.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        boolean boolean97 = reportGraph87.isEmpty("", (int) 'a', (int) '#', "hi!");
        javax.swing.JPanel jPanel98 = reportGraph87.panel;
        reportGraph4.panel = jPanel98;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
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
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(jPanel98);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (short) -1, "hi!");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean34 = reportGraph24.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean49 = reportGraph44.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        reportGraph39.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        javax.swing.JPanel jPanel53 = reportGraph24.panel;
        boolean boolean58 = reportGraph24.wrongAnalysisType("", (int) (short) 100, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        javax.swing.JPanel jPanel64 = reportGraph63.panel;
        reportGraph24.panel = jPanel64;
        reportGraph4.panel = jPanel64;
        java.lang.Class<?> wildcardClass67 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
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
        boolean boolean65 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) 'a', "");
        javax.swing.JPanel jPanel66 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel66);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 10, "");
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
        boolean boolean96 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 1, "");
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 1, "hi!");
        boolean boolean53 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "");
        boolean boolean58 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
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
        java.lang.Class<?> wildcardClass72 = jPanel70.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
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
        boolean boolean65 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) -1, "");
        boolean boolean70 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', 0, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) -1, 100, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        java.lang.Class<?> wildcardClass22 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean31 = reportGraph26.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel32 = reportGraph26.panel;
        javax.swing.JPanel jPanel33 = reportGraph26.panel;
        reportGraph4.panel = jPanel33;
        java.lang.Class<?> wildcardClass35 = jPanel33.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 1, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (short) 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        boolean boolean36 = reportGraph19.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel37 = reportGraph19.panel;
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean47 = reportGraph42.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel48 = reportGraph42.panel;
        javax.swing.JPanel jPanel49 = reportGraph42.panel;
        reportGraph19.panel = jPanel49;
        reportGraph9.panel = jPanel49;
        javax.swing.JPanel jPanel52 = reportGraph9.panel;
        reportGraph4.panel = jPanel52;
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean62 = reportGraph57.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean67 = reportGraph57.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean82 = reportGraph77.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel83 = reportGraph77.panel;
        reportGraph72.panel = jPanel83;
        reportGraph57.panel = jPanel83;
        boolean boolean90 = reportGraph57.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel91 = reportGraph57.panel;
        boolean boolean96 = reportGraph57.wrongAnalysisType("hi!", (int) '#', (int) (short) -1, "");
        javax.swing.JPanel jPanel97 = reportGraph57.panel;
        reportGraph4.panel = jPanel97;
        javax.swing.JPanel jPanel99 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(jPanel97);
        org.junit.Assert.assertNotNull(jPanel99);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (byte) 100, "hi!");
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
        boolean boolean59 = reportGraph14.isEmpty("hi!", 1, 0, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph14.panel;
        reportGraph9.panel = jPanel60;
        javax.swing.JPanel jPanel62 = reportGraph9.panel;
        reportGraph4.panel = jPanel62;
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
        org.junit.Assert.assertNotNull(jPanel62);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (-1), "");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
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
        boolean boolean50 = reportGraph4.wrongAnalysisType("", 1, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 1, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.isEmpty("hi!", (int) '#', (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        javax.swing.JPanel jPanel16 = null;
        reportGraph4.panel = jPanel16;
        boolean boolean22 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) -1, "hi!");
        boolean boolean27 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "");
        boolean boolean42 = reportGraph4.isEmpty("hi!", (int) '#', (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
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
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 10, "");
        boolean boolean64 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) 10, "");
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        reportGraph4.panel = jPanel26;
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        reportGraph16.panel = jPanel27;
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean38 = reportGraph33.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean48 = reportGraph43.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel49 = reportGraph43.panel;
        reportGraph33.panel = jPanel49;
        reportGraph16.panel = jPanel49;
        boolean boolean56 = reportGraph16.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel57 = reportGraph16.panel;
        reportGraph4.panel = jPanel57;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean34 = reportGraph24.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean49 = reportGraph44.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        reportGraph39.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        javax.swing.JPanel jPanel53 = reportGraph24.panel;
        reportGraph19.panel = jPanel53;
        reportGraph14.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean61 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph4.panel = jPanel67;
        java.lang.Class<?> wildcardClass69 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean61 = reportGraph51.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel62 = reportGraph51.panel;
        reportGraph46.panel = jPanel62;
        javax.swing.JPanel jPanel64 = reportGraph46.panel;
        reportGraph4.panel = jPanel64;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 0, "");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        boolean boolean94 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) 100, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
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
        boolean boolean87 = reportGraph4.isEmpty("hi!", 10, (-1), "");
        javax.swing.JPanel jPanel88 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel88);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
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
        boolean boolean42 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean58 = reportGraph48.isEmpty("hi!", 100, 100, "");
        boolean boolean63 = reportGraph48.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel64 = reportGraph48.panel;
        reportGraph4.panel = jPanel64;
        javax.swing.JPanel jPanel66 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass67 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph19.panel = jPanel35;
        boolean boolean41 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean66 = reportGraph61.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel67 = reportGraph61.panel;
        reportGraph46.panel = jPanel67;
        reportGraph19.panel = jPanel67;
        reportGraph4.panel = jPanel67;
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean80 = reportGraph75.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph85 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean90 = reportGraph85.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel91 = reportGraph85.panel;
        reportGraph75.panel = jPanel91;
        reportGraph4.panel = jPanel91;
        javax.swing.JPanel jPanel94 = reportGraph4.panel;
        javax.swing.JPanel jPanel95 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel94);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
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
        boolean boolean94 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass95 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean35 = reportGraph25.isEmpty("hi!", 100, 100, "");
        boolean boolean40 = reportGraph25.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel41 = reportGraph25.panel;
        reportGraph20.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        boolean boolean48 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph39.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel45 = reportGraph39.panel;
        reportGraph24.panel = jPanel45;
        reportGraph14.panel = jPanel45;
        javax.swing.JPanel jPanel48 = reportGraph14.panel;
        reportGraph9.panel = jPanel48;
        reportGraph4.panel = jPanel48;
        java.lang.Class<?> wildcardClass51 = jPanel48.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean25 = reportGraph15.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph30.panel = jPanel41;
        reportGraph15.panel = jPanel41;
        boolean boolean48 = reportGraph15.isEmpty("hi!", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel49 = reportGraph15.panel;
        reportGraph4.panel = jPanel49;
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.isEmpty("hi!", (int) (short) 0, 10, "hi!");
        java.lang.Class<?> wildcardClass57 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
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
        boolean boolean50 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean27 = reportGraph22.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel28 = reportGraph22.panel;
        boolean boolean33 = reportGraph22.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean38 = reportGraph22.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel39 = reportGraph22.panel;
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean54 = reportGraph44.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean59 = reportGraph44.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean74 = reportGraph64.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean89 = reportGraph84.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel90 = reportGraph84.panel;
        reportGraph79.panel = jPanel90;
        reportGraph64.panel = jPanel90;
        reportGraph44.panel = jPanel90;
        reportGraph22.panel = jPanel90;
        reportGraph4.panel = jPanel90;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean25 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 0, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
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
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass44 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
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
        boolean boolean47 = reportGraph9.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph9.panel;
        reportGraph4.panel = jPanel48;
        java.lang.Class<?> wildcardClass50 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
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
        boolean boolean85 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 0, "");
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
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean40 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel41 = reportGraph24.panel;
        reportGraph14.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", (int) '4', (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("", (int) (short) -1, (-1), "hi!");
        boolean boolean35 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean40 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        javax.swing.JPanel jPanel19 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertNotNull(jPanel19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), 0, "hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) ' ', "hi!");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean15 = reportGraph10.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel16 = reportGraph10.panel;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        boolean boolean32 = reportGraph21.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean47 = reportGraph37.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        reportGraph37.panel = jPanel58;
        reportGraph21.panel = jPanel58;
        reportGraph10.panel = jPanel58;
        boolean boolean66 = reportGraph10.isEmpty("hi!", (int) (short) 10, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean76 = reportGraph71.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel77 = reportGraph71.panel;
        reportGraph10.panel = jPanel77;
        reportGraph4.panel = jPanel77;
        javax.swing.JPanel jPanel80 = reportGraph4.panel;
        boolean boolean85 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
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
        boolean boolean65 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) 'a', "hi!");
        boolean boolean70 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean20 = reportGraph15.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean25 = reportGraph15.isEmpty("hi!", 100, 100, "");
        boolean boolean30 = reportGraph15.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel31 = reportGraph15.panel;
        reportGraph4.panel = jPanel31;
        javax.swing.JPanel jPanel33 = null;
        reportGraph4.panel = jPanel33;
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        boolean boolean45 = reportGraph39.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean50 = reportGraph39.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph39.panel;
        javax.swing.JPanel jPanel52 = reportGraph39.panel;
        reportGraph4.panel = jPanel52;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel52);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", 0, 0, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) 'a', "hi!");
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (-1), "hi!");
        boolean boolean20 = reportGraph4.isEmpty("hi!", 0, 1, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) (byte) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (short) 100, "hi!");
        boolean boolean30 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) '4', "hi!");
        boolean boolean35 = reportGraph4.isEmpty("hi!", (int) (byte) -1, 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
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
        java.lang.Class<?> wildcardClass58 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean34 = reportGraph24.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel50 = reportGraph44.panel;
        reportGraph39.panel = jPanel50;
        reportGraph24.panel = jPanel50;
        reportGraph4.panel = jPanel50;
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        boolean boolean31 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 10, "");
        javax.swing.JPanel jPanel32 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass33 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) 0, "");
        boolean boolean42 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 1, "");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean21 = reportGraph16.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel22 = reportGraph16.panel;
        reportGraph4.panel = jPanel22;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
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
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel61 = reportGraph60.panel;
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean71 = reportGraph66.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean76 = reportGraph66.wrongAnalysisType("", (int) (byte) 10, (-1), "hi!");
        javax.swing.JPanel jPanel77 = reportGraph66.panel;
        reportGraph60.panel = jPanel77;
        reportGraph4.panel = jPanel77;
        boolean boolean84 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) (short) -1, "");
        java.lang.Class<?> wildcardClass85 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
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
        reportGraph9.panel = jPanel79;
        reportGraph4.panel = jPanel79;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jPanel79);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean25 = reportGraph20.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        reportGraph4.panel = jPanel26;
        java.lang.Class<?> wildcardClass28 = jPanel26.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 1, "hi!");
        boolean boolean47 = reportGraph4.isEmpty("", (int) (short) 1, (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
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
        boolean boolean96 = reportGraph4.isEmpty("hi!", 0, (-1), "");
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
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 10, "");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 1, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, (int) (short) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
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
        boolean boolean38 = reportGraph4.isEmpty("", (int) (short) -1, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
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
        boolean boolean98 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 100, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean41 = reportGraph31.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        reportGraph31.panel = jPanel52;
        reportGraph4.panel = jPanel52;
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 100, "hi!");
        boolean boolean64 = reportGraph59.wrongAnalysisType("hi!", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        reportGraph4.panel = jPanel65;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", 10, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        java.lang.Class<?> wildcardClass33 = jPanel30.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 0, "");
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
        reportGraph4.panel = jPanel89;
        javax.swing.JPanel jPanel94 = reportGraph4.panel;
        boolean boolean99 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        org.junit.Assert.assertNotNull(jPanel94);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) '4', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        boolean boolean16 = reportGraph10.wrongAnalysisType("hi!", 100, (int) (short) 10, "hi!");
        boolean boolean21 = reportGraph10.wrongAnalysisType("", 10, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel22 = reportGraph10.panel;
        reportGraph4.panel = jPanel22;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) '4', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph14.panel;
        javax.swing.JPanel jPanel27 = reportGraph14.panel;
        reportGraph4.panel = jPanel27;
        boolean boolean33 = reportGraph4.isEmpty("", (int) '4', (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
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
        java.lang.Class<?> wildcardClass63 = jPanel62.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        javax.swing.JPanel jPanel40 = null;
        reportGraph4.panel = jPanel40;
        java.lang.Class<?> wildcardClass42 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
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
        javax.swing.JPanel jPanel78 = reportGraph4.panel;
        boolean boolean83 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) ' ', "hi!");
        boolean boolean88 = reportGraph4.isEmpty("", (int) '4', (-1), "hi!");
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
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean52 = reportGraph47.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph4.panel = jPanel53;
        javax.swing.JPanel jPanel55 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel55);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
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
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel51 = reportGraph50.panel;
        reportGraph4.panel = jPanel51;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
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
        boolean boolean38 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        boolean boolean43 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean58 = reportGraph53.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel59 = reportGraph53.panel;
        reportGraph48.panel = jPanel59;
        reportGraph4.panel = jPanel59;
        boolean boolean66 = reportGraph4.isEmpty("", 100, (int) (short) 10, "hi!");
        boolean boolean71 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) -1, "hi!");
        boolean boolean76 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean81 = reportGraph4.isEmpty("", (int) (short) 1, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
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
        boolean boolean39 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 1, "hi!");
        boolean boolean44 = reportGraph4.isEmpty("hi!", 0, 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
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
        boolean boolean66 = reportGraph4.isEmpty("", (int) 'a', 0, "");
        java.lang.Class<?> wildcardClass67 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.isEmpty("", 100, (int) '#', "hi!");
        boolean boolean25 = reportGraph4.isEmpty("", 0, (int) (byte) 1, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("", (int) (byte) 1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
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
        boolean boolean85 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
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
        boolean boolean54 = reportGraph4.wrongAnalysisType("hi!", 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean30 = reportGraph25.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel31 = reportGraph25.panel;
        reportGraph20.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean52 = reportGraph47.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph47.panel;
        reportGraph37.panel = jPanel53;
        reportGraph20.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        statsVisualiser.graph.ReportGraph reportGraph61 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel62 = reportGraph61.panel;
        reportGraph4.panel = jPanel62;
        javax.swing.JPanel jPanel64 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass65 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertNotNull(jPanel64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (short) 1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '4', 1, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", 1, (int) '#', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        boolean boolean38 = reportGraph4.isEmpty("hi!", 1, (-1), "");
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean48 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
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
        java.lang.Class<?> wildcardClass50 = jPanel49.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
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
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean62 = reportGraph52.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean67 = reportGraph52.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel73 = reportGraph72.panel;
        reportGraph52.panel = jPanel73;
        reportGraph47.panel = jPanel73;
        boolean boolean80 = reportGraph47.wrongAnalysisType("hi!", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel81 = reportGraph47.panel;
        reportGraph4.panel = jPanel81;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 10, 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) 'a', "");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", 1, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (short) -1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
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
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel60 = reportGraph59.panel;
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean70 = reportGraph65.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean75 = reportGraph65.wrongAnalysisType("", (int) (byte) 10, (-1), "hi!");
        javax.swing.JPanel jPanel76 = reportGraph65.panel;
        reportGraph59.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        java.lang.Class<?> wildcardClass79 = jPanel76.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 100, "");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 1, "");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 10, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", 10, (int) (short) 100, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        javax.swing.JPanel jPanel37 = reportGraph30.panel;
        javax.swing.JPanel jPanel38 = reportGraph30.panel;
        reportGraph4.panel = jPanel38;
        java.lang.Class<?> wildcardClass40 = jPanel38.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (short) 10, "");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean29 = reportGraph19.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("", 0, (int) ' ', "");
        boolean boolean39 = reportGraph19.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean49 = reportGraph44.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean54 = reportGraph44.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean59 = reportGraph44.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean74 = reportGraph64.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean79 = reportGraph64.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph64.panel;
        reportGraph44.panel = jPanel80;
        statsVisualiser.graph.ReportGraph reportGraph86 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel87 = reportGraph86.panel;
        reportGraph44.panel = jPanel87;
        reportGraph19.panel = jPanel87;
        javax.swing.JPanel jPanel90 = reportGraph19.panel;
        reportGraph4.panel = jPanel90;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jPanel80);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(jPanel90);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) -1, 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean20 = reportGraph15.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        boolean boolean25 = reportGraph15.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel26 = reportGraph15.panel;
        reportGraph4.panel = jPanel26;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) -1, "");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, 0, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
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
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel74 = reportGraph68.panel;
        boolean boolean79 = reportGraph68.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean84 = reportGraph68.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean89 = reportGraph68.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph68.panel;
        reportGraph63.panel = jPanel90;
        reportGraph4.panel = jPanel90;
        statsVisualiser.graph.ReportGraph reportGraph97 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 100, "hi!");
        javax.swing.JPanel jPanel98 = reportGraph97.panel;
        reportGraph4.panel = jPanel98;
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
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertNotNull(jPanel98);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
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
        boolean boolean70 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) ' ', "");
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
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) -1, "");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
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
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
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
        javax.swing.JPanel jPanel81 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = jPanel6.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        reportGraph25.panel = jPanel41;
        reportGraph9.panel = jPanel41;
        reportGraph4.panel = jPanel41;
        boolean boolean49 = reportGraph4.isEmpty("", 0, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean58 = reportGraph48.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean68 = reportGraph63.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel69 = reportGraph63.panel;
        reportGraph48.panel = jPanel69;
        reportGraph4.panel = jPanel69;
        boolean boolean76 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
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
        java.lang.Class<?> wildcardClass49 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph15.panel;
        reportGraph4.panel = jPanel16;
        java.lang.Class<?> wildcardClass18 = jPanel16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
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
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean58 = reportGraph48.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph63 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean68 = reportGraph63.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel69 = reportGraph63.panel;
        reportGraph48.panel = jPanel69;
        reportGraph4.panel = jPanel69;
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean81 = reportGraph76.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean86 = reportGraph76.wrongAnalysisType("hi!", 10, (int) (short) 1, "");
        javax.swing.JPanel jPanel87 = reportGraph76.panel;
        reportGraph4.panel = jPanel87;
        javax.swing.JPanel jPanel89 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel69);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(jPanel89);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean29 = reportGraph19.isEmpty("hi!", 100, 100, "");
        boolean boolean34 = reportGraph19.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean39 = reportGraph19.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean44 = reportGraph19.isEmpty("", (int) ' ', (int) (byte) 10, "");
        javax.swing.JPanel jPanel45 = reportGraph19.panel;
        reportGraph4.panel = jPanel45;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(jPanel45);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
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
        java.lang.Class<?> wildcardClass44 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
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
        boolean boolean75 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph80 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean85 = reportGraph80.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel86 = reportGraph80.panel;
        reportGraph4.panel = jPanel86;
        java.lang.Class<?> wildcardClass88 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean34 = reportGraph19.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel40 = reportGraph39.panel;
        reportGraph19.panel = jPanel40;
        reportGraph14.panel = jPanel40;
        reportGraph9.panel = jPanel40;
        reportGraph4.panel = jPanel40;
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean54 = reportGraph49.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean59 = reportGraph49.isEmpty("", (int) 'a', (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph49.panel;
        boolean boolean65 = reportGraph49.isEmpty("", 100, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean75 = reportGraph70.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean80 = reportGraph70.isEmpty("", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel81 = reportGraph70.panel;
        javax.swing.JPanel jPanel82 = reportGraph70.panel;
        reportGraph49.panel = jPanel82;
        reportGraph4.panel = jPanel82;
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel82);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) 'a', "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 10, "hi!");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass26 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        boolean boolean92 = reportGraph4.isEmpty("hi!", 1, (int) ' ', "hi!");
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
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
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
        boolean boolean71 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) 0, "hi!");
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
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (-1), 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (short) 10, "hi!");
        boolean boolean36 = reportGraph4.isEmpty("", (int) ' ', 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        boolean boolean48 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel49 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass50 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = null;
        reportGraph4.panel = jPanel11;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) ' ', (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
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
        java.lang.Class<?> wildcardClass86 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (-1), "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (byte) 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) '4', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean41 = reportGraph31.isEmpty("hi!", 100, 10, "");
        boolean boolean46 = reportGraph31.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        javax.swing.JPanel jPanel47 = reportGraph31.panel;
        reportGraph4.panel = jPanel47;
        java.lang.Class<?> wildcardClass49 = jPanel47.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 0, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 1, 0, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph9.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean29 = reportGraph19.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean44 = reportGraph34.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean49 = reportGraph34.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel55 = reportGraph54.panel;
        reportGraph34.panel = jPanel55;
        reportGraph19.panel = jPanel55;
        boolean boolean62 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph19.panel;
        reportGraph9.panel = jPanel63;
        boolean boolean69 = reportGraph9.isEmpty("", (int) 'a', (int) (short) 100, "");
        javax.swing.JPanel jPanel70 = reportGraph9.panel;
        boolean boolean75 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 0, (int) (short) 1, "");
        boolean boolean80 = reportGraph9.wrongAnalysisType("", (int) (byte) -1, (int) (short) 10, "");
        javax.swing.JPanel jPanel81 = reportGraph9.panel;
        reportGraph4.panel = jPanel81;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) '4', "");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
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
        javax.swing.JPanel jPanel54 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
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
        boolean boolean57 = reportGraph4.isEmpty("hi!", (-1), (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        boolean boolean94 = reportGraph4.isEmpty("", 0, (int) (byte) -1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel31 = reportGraph30.panel;
        reportGraph25.panel = jPanel31;
        reportGraph4.panel = jPanel31;
        boolean boolean38 = reportGraph4.isEmpty("", 100, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean46 = reportGraph36.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean51 = reportGraph36.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph56 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean61 = reportGraph56.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean66 = reportGraph56.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean71 = reportGraph56.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel72 = reportGraph56.panel;
        reportGraph36.panel = jPanel72;
        statsVisualiser.graph.ReportGraph reportGraph78 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean83 = reportGraph78.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        javax.swing.JPanel jPanel84 = reportGraph78.panel;
        reportGraph36.panel = jPanel84;
        reportGraph4.panel = jPanel84;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 10, "hi!");
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph20.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean30 = reportGraph20.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel31 = reportGraph20.panel;
        reportGraph4.panel = jPanel31;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        reportGraph15.panel = jPanel21;
        reportGraph4.panel = jPanel21;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel21);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        boolean boolean43 = reportGraph4.isEmpty("", (int) 'a', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 100, "");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
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
        boolean boolean55 = reportGraph4.isEmpty("hi!", 100, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
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
        java.lang.Class<?> wildcardClass62 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 0, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) ' ', "");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean20 = reportGraph15.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        boolean boolean26 = reportGraph15.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean31 = reportGraph15.wrongAnalysisType("", (int) (short) 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel37 = reportGraph36.panel;
        javax.swing.JPanel jPanel38 = reportGraph36.panel;
        reportGraph15.panel = jPanel38;
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        boolean boolean49 = reportGraph44.wrongAnalysisType("hi!", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph44.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean64 = reportGraph59.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        boolean boolean70 = reportGraph59.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean75 = reportGraph59.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel76 = reportGraph59.panel;
        reportGraph44.panel = jPanel76;
        reportGraph15.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean40 = reportGraph35.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean55 = reportGraph45.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean65 = reportGraph60.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean70 = reportGraph60.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean75 = reportGraph60.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph80 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel81 = reportGraph80.panel;
        reportGraph60.panel = jPanel81;
        reportGraph45.panel = jPanel81;
        boolean boolean88 = reportGraph45.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel89 = reportGraph45.panel;
        reportGraph35.panel = jPanel89;
        javax.swing.JPanel jPanel91 = reportGraph35.panel;
        reportGraph24.panel = jPanel91;
        reportGraph19.panel = jPanel91;
        reportGraph9.panel = jPanel91;
        reportGraph4.panel = jPanel91;
        javax.swing.JPanel jPanel96 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel96);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel21 = reportGraph20.panel;
        javax.swing.JPanel jPanel22 = reportGraph20.panel;
        boolean boolean27 = reportGraph20.wrongAnalysisType("", (int) (byte) 0, (int) (short) 100, "");
        boolean boolean32 = reportGraph20.isEmpty("hi!", 10, (int) (byte) 100, "hi!");
        boolean boolean37 = reportGraph20.wrongAnalysisType("", (-1), (int) (short) 100, "");
        javax.swing.JPanel jPanel38 = reportGraph20.panel;
        reportGraph4.panel = jPanel38;
        java.lang.Class<?> wildcardClass40 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) -1, "");
        boolean boolean22 = reportGraph4.isEmpty("hi!", (-1), (int) '#', "hi!");
        java.lang.Class<?> wildcardClass23 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 10, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
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
        boolean boolean69 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (short) 100, "");
        boolean boolean74 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (byte) 100, "");
        boolean boolean79 = reportGraph4.isEmpty("hi!", 10, (int) (short) 0, "");
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
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
        java.lang.Class<?> wildcardClass67 = jPanel66.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, 0, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        javax.swing.JPanel jPanel36 = reportGraph29.panel;
        javax.swing.JPanel jPanel37 = reportGraph29.panel;
        reportGraph4.panel = jPanel37;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        javax.swing.JPanel jPanel12 = reportGraph9.panel;
        reportGraph4.panel = jPanel12;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 1, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        boolean boolean42 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 1, "hi!");
        boolean boolean47 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) -1, "hi!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (byte) 100, "");
    }
}

