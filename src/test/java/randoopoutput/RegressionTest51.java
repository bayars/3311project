package randoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest51 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, 0, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean20 = reportGraph15.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean25 = reportGraph15.wrongAnalysisType("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph15.panel;
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        reportGraph15.panel = jPanel32;
        reportGraph9.panel = jPanel32;
        javax.swing.JPanel jPanel35 = reportGraph9.panel;
        reportGraph4.panel = jPanel35;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel35);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (byte) -1, "hi!");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 0, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, 100, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (byte) -1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) '4', (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 10, "");
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) ' ', (-1), "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 10, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph4.panel = jPanel23;
        boolean boolean29 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        boolean boolean35 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
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
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        boolean boolean56 = reportGraph4.isEmpty("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel57 = reportGraph4.panel;
        boolean boolean62 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (byte) 0, "hi!");
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
        org.junit.Assert.assertNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNull(jPanel57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
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
        boolean boolean96 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 100, "");
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
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
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
        boolean boolean52 = reportGraph14.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel53 = reportGraph14.panel;
        reportGraph9.panel = jPanel53;
        reportGraph4.panel = jPanel53;
        boolean boolean60 = reportGraph4.isEmpty("", (-1), (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", 100, (int) '#', "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '#', (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph4.panel = jPanel20;
        java.lang.Class<?> wildcardClass22 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
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
        boolean boolean69 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        java.lang.Class<?> wildcardClass70 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) '#', 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '4', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        java.lang.Class<?> wildcardClass23 = jPanel20.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean50 = reportGraph45.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel51 = reportGraph45.panel;
        reportGraph35.panel = jPanel51;
        reportGraph14.panel = jPanel51;
        reportGraph4.panel = jPanel51;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) (byte) 100, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        javax.swing.JPanel jPanel27 = reportGraph25.panel;
        reportGraph4.panel = jPanel27;
        java.lang.Class<?> wildcardClass29 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        boolean boolean74 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) -1, "");
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(jPanel75);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
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
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean59 = reportGraph54.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean64 = reportGraph54.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean69 = reportGraph54.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph74 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel75 = reportGraph74.panel;
        reportGraph54.panel = jPanel75;
        reportGraph49.panel = jPanel75;
        boolean boolean82 = reportGraph49.wrongAnalysisType("hi!", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel83 = reportGraph49.panel;
        reportGraph4.panel = jPanel83;
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(jPanel83);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 10, "");
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        javax.swing.JPanel jPanel72 = reportGraph4.panel;
        boolean boolean77 = reportGraph4.isEmpty("", (int) '#', (int) 'a', "");
        boolean boolean82 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 100, "");
        boolean boolean87 = reportGraph4.isEmpty("hi!", (int) ' ', 100, "hi!");
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
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) 10, (int) '4', "hi!");
        boolean boolean36 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 10, "");
        javax.swing.JPanel jPanel37 = reportGraph4.panel;
        boolean boolean42 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        boolean boolean32 = reportGraph21.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        javax.swing.JPanel jPanel38 = reportGraph37.panel;
        reportGraph21.panel = jPanel38;
        reportGraph4.panel = jPanel38;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel38);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (-1), "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        java.lang.Class<?> wildcardClass45 = jPanel44.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        boolean boolean25 = reportGraph14.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean30 = reportGraph14.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel31 = reportGraph14.panel;
        boolean boolean36 = reportGraph14.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        javax.swing.JPanel jPanel37 = reportGraph14.panel;
        reportGraph9.panel = jPanel37;
        reportGraph4.panel = jPanel37;
        boolean boolean44 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 100, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (short) -1, "");
        boolean boolean25 = reportGraph4.isEmpty("hi!", 100, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph4.panel = jPanel36;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 100, 0, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) '4', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 100, (int) (short) 10, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 0, "");
        boolean boolean48 = reportGraph43.wrongAnalysisType("hi!", (int) (byte) 1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean63 = reportGraph58.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean68 = reportGraph58.isEmpty("hi!", 100, 100, "");
        boolean boolean73 = reportGraph58.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel74 = reportGraph58.panel;
        reportGraph53.panel = jPanel74;
        reportGraph43.panel = jPanel74;
        reportGraph4.panel = jPanel74;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(jPanel74);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        reportGraph4.panel = jPanel71;
        statsVisualiser.graph.ReportGraph reportGraph77 = new statsVisualiser.graph.ReportGraph("", (int) '4', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean87 = reportGraph82.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel88 = reportGraph82.panel;
        reportGraph77.panel = jPanel88;
        reportGraph4.panel = jPanel88;
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(jPanel88);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) 10, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) 'a', 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (int) (byte) 10, "hi!");
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "");
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        boolean boolean23 = reportGraph4.isEmpty("", (int) '4', (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) '4', "hi!");
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
        boolean boolean64 = reportGraph9.wrongAnalysisType("", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel65 = reportGraph9.panel;
        reportGraph4.panel = jPanel65;
        boolean boolean71 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) (byte) 10, "");
        boolean boolean76 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass77 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean67 = reportGraph62.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel68 = reportGraph62.panel;
        reportGraph57.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
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
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        boolean boolean61 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 0, "");
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
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", 1, (int) 'a', "");
        boolean boolean22 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean15 = reportGraph10.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean20 = reportGraph10.wrongAnalysisType("hi!", 100, 0, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph10.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel27 = reportGraph26.panel;
        reportGraph10.panel = jPanel27;
        reportGraph4.panel = jPanel27;
        boolean boolean34 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel35 = null;
        reportGraph4.panel = jPanel35;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
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
        boolean boolean38 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("hi!", (int) (byte) 10, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel43 = reportGraph42.panel;
        reportGraph37.panel = jPanel43;
        reportGraph32.panel = jPanel43;
        reportGraph4.panel = jPanel43;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(jPanel43);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '#', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
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
        boolean boolean80 = reportGraph4.wrongAnalysisType("", 10, (int) '4', "hi!");
        javax.swing.JPanel jPanel81 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (short) 10, "");
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("hi!", 0, (int) '#', "");
        boolean boolean36 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass25 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass21 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean15 = reportGraph10.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean20 = reportGraph10.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel31 = reportGraph25.panel;
        reportGraph10.panel = jPanel31;
        boolean boolean37 = reportGraph10.wrongAnalysisType("hi!", (int) (byte) 1, 0, "hi!");
        boolean boolean42 = reportGraph10.wrongAnalysisType("hi!", (int) (short) -1, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph10.panel;
        javax.swing.JPanel jPanel44 = reportGraph10.panel;
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean59 = reportGraph54.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean69 = reportGraph64.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel70 = reportGraph64.panel;
        reportGraph54.panel = jPanel70;
        boolean boolean76 = reportGraph54.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel77 = reportGraph54.panel;
        reportGraph49.panel = jPanel77;
        reportGraph10.panel = jPanel77;
        reportGraph4.panel = jPanel77;
        boolean boolean85 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) '#', "");
        boolean boolean90 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (short) 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(jPanel77);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) (short) 1, 10, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 100, "");
        javax.swing.JPanel jPanel31 = reportGraph30.panel;
        reportGraph25.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel38 = reportGraph37.panel;
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean48 = reportGraph43.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean53 = reportGraph43.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel54 = reportGraph43.panel;
        reportGraph37.panel = jPanel54;
        reportGraph25.panel = jPanel54;
        reportGraph4.panel = jPanel54;
        boolean boolean62 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph72 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        javax.swing.JPanel jPanel73 = reportGraph72.panel;
        reportGraph67.panel = jPanel73;
        javax.swing.JPanel jPanel75 = reportGraph67.panel;
        reportGraph4.panel = jPanel75;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertNotNull(jPanel75);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.isEmpty("hi!", (int) (short) 100, 100, "");
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
        reportGraph9.panel = jPanel53;
        javax.swing.JPanel jPanel57 = reportGraph9.panel;
        reportGraph4.panel = jPanel57;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertNotNull(jPanel57);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
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
        java.lang.Class<?> wildcardClass45 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 100, (int) (short) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '#', (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel15 = null;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("", (int) (byte) 0, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) '#', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

