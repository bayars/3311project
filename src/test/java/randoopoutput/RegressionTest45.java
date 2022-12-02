package randoopoutput;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest45 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", (-1), (int) (short) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
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
        boolean boolean99 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 100, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        boolean boolean98 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (short) 0, "");
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
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 0, (-1), "hi!");
        java.lang.Class<?> wildcardClass27 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        reportGraph4.panel = jPanel11;
        boolean boolean17 = reportGraph4.wrongAnalysisType("", 0, (-1), "hi!");
        boolean boolean22 = reportGraph4.isEmpty("", (int) (short) 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass23 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.lang.Class<?> wildcardClass45 = jPanel43.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        boolean boolean89 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 1, "");
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
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel46 = reportGraph40.panel;
        boolean boolean51 = reportGraph40.wrongAnalysisType("hi!", 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph56 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean61 = reportGraph56.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel62 = reportGraph56.panel;
        boolean boolean67 = reportGraph56.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean72 = reportGraph56.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel73 = reportGraph56.panel;
        reportGraph40.panel = jPanel73;
        javax.swing.JPanel jPanel75 = reportGraph40.panel;
        reportGraph4.panel = jPanel75;
        boolean boolean81 = reportGraph4.isEmpty("", (int) (byte) 1, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
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
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean44 = reportGraph39.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean59 = reportGraph49.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel70 = reportGraph64.panel;
        reportGraph49.panel = jPanel70;
        reportGraph39.panel = jPanel70;
        reportGraph4.panel = jPanel70;
        boolean boolean78 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel79 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass80 = jPanel79.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(jPanel79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 10, "hi!");
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (short) 10, "hi!");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        javax.swing.JPanel jPanel13 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass14 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(jPanel13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        boolean boolean47 = reportGraph4.isEmpty("hi!", 100, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) '4', "hi!");
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
        reportGraph14.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        java.lang.Class<?> wildcardClass84 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph9.panel = jPanel16;
        reportGraph4.panel = jPanel16;
        statsVisualiser.graph.ReportGraph reportGraph23 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel24 = reportGraph23.panel;
        javax.swing.JPanel jPanel25 = reportGraph23.panel;
        boolean boolean30 = reportGraph23.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean40 = reportGraph35.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel41 = reportGraph35.panel;
        boolean boolean46 = reportGraph35.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean51 = reportGraph35.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel52 = reportGraph35.panel;
        reportGraph23.panel = jPanel52;
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
        reportGraph23.panel = jPanel87;
        reportGraph4.panel = jPanel87;
        javax.swing.JPanel jPanel90 = reportGraph4.panel;
        boolean boolean95 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (short) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel24);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass32 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean69 = reportGraph64.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean74 = reportGraph64.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph79 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean89 = reportGraph84.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel90 = reportGraph84.panel;
        reportGraph79.panel = jPanel90;
        reportGraph64.panel = jPanel90;
        boolean boolean97 = reportGraph64.isEmpty("", (int) (byte) 1, (int) (byte) 10, "");
        javax.swing.JPanel jPanel98 = reportGraph64.panel;
        reportGraph4.panel = jPanel98;
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
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(jPanel90);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(jPanel98);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) '4', "hi!");
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
        reportGraph14.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        java.lang.Class<?> wildcardClass84 = jPanel81.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '#', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
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
        boolean boolean53 = reportGraph15.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel54 = reportGraph15.panel;
        reportGraph10.panel = jPanel54;
        reportGraph4.panel = jPanel54;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        boolean boolean40 = reportGraph29.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean45 = reportGraph29.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel46 = reportGraph29.panel;
        reportGraph19.panel = jPanel46;
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean62 = reportGraph52.isEmpty("hi!", 100, 100, "");
        boolean boolean67 = reportGraph52.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel68 = reportGraph52.panel;
        reportGraph19.panel = jPanel68;
        boolean boolean74 = reportGraph19.wrongAnalysisType("", (int) 'a', (int) (byte) 100, "hi!");
        boolean boolean79 = reportGraph19.wrongAnalysisType("hi!", 0, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) '#', "");
        javax.swing.JPanel jPanel85 = reportGraph84.panel;
        reportGraph19.panel = jPanel85;
        reportGraph4.panel = jPanel85;
        java.lang.Class<?> wildcardClass88 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        boolean boolean28 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 0, "");
        boolean boolean33 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
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
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (-1), "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 100, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (-1), "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
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
        javax.swing.JPanel jPanel86 = null;
        reportGraph4.panel = jPanel86;
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
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 10, "");
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) -1, 0, "");
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        statsVisualiser.graph.ReportGraph reportGraph90 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph95 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel96 = reportGraph95.panel;
        javax.swing.JPanel jPanel97 = reportGraph95.panel;
        reportGraph90.panel = jPanel97;
        reportGraph4.panel = jPanel97;
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
        org.junit.Assert.assertNotNull(jPanel96);
        org.junit.Assert.assertNotNull(jPanel97);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        boolean boolean40 = reportGraph4.isEmpty("", (-1), 0, "hi!");
        javax.swing.JPanel jPanel41 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 100, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        boolean boolean15 = reportGraph4.isEmpty("", 10, 1, "");
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 1, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 10, "");
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) 'a', "hi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        java.lang.Class<?> wildcardClass55 = jPanel52.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.isEmpty("hi!", (int) 'a', (-1), "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 10, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph19.panel = jPanel25;
        reportGraph4.panel = jPanel25;
        java.lang.Class<?> wildcardClass28 = jPanel25.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
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
        boolean boolean49 = reportGraph4.isEmpty("hi!", 1, 0, "hi!");
        boolean boolean54 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (short) -1, "");
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.lang.Class<?> wildcardClass76 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (short) 100, "");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = jPanel6.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean25 = reportGraph20.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        reportGraph4.panel = jPanel26;
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) '4', (int) (short) 0, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
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
        java.lang.Class<?> wildcardClass39 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) 'a', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 10, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '4', (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
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
        boolean boolean84 = reportGraph4.isEmpty("", 100, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean20 = reportGraph15.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel37 = reportGraph31.panel;
        reportGraph26.panel = jPanel37;
        javax.swing.JPanel jPanel39 = reportGraph26.panel;
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean59 = reportGraph49.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean64 = reportGraph49.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        reportGraph49.panel = jPanel70;
        reportGraph44.panel = jPanel70;
        reportGraph26.panel = jPanel70;
        reportGraph15.panel = jPanel70;
        reportGraph4.panel = jPanel70;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel70);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
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
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, 0, "hi!");
        javax.swing.JPanel jPanel16 = null;
        reportGraph4.panel = jPanel16;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 0, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (-1), "");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (short) 100, 0, "hi!");
        boolean boolean15 = reportGraph4.isEmpty("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean20 = reportGraph4.isEmpty("", 1, (int) (short) 10, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
        boolean boolean84 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "hi!");
        boolean boolean89 = reportGraph4.isEmpty("", (int) (short) 100, (int) (byte) 1, "");
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph9.panel = jPanel23;
        reportGraph4.panel = jPanel23;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 0, "hi!");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass28 = jPanel27.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) -1, (-1), "");
        javax.swing.JPanel jPanel32 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass33 = jPanel32.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "");
        javax.swing.JPanel jPanel10 = null;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) ' ', "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 10, 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (byte) 100, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph24.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '4', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        java.lang.Class<?> wildcardClass23 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        java.lang.Class<?> wildcardClass45 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
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
        boolean boolean71 = reportGraph4.isEmpty("", (-1), (int) (byte) 10, "hi!");
        boolean boolean76 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 1, "hi!");
        boolean boolean81 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 0, "");
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean61 = reportGraph46.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph46.panel = jPanel67;
        reportGraph41.panel = jPanel67;
        boolean boolean74 = reportGraph41.isEmpty("", (int) (short) 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph41.panel;
        reportGraph4.panel = jPanel75;
        boolean boolean81 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
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
        java.lang.Class<?> wildcardClass84 = jPanel81.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 1, "");
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
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
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph74 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean79 = reportGraph74.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph89 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean94 = reportGraph89.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel95 = reportGraph89.panel;
        reportGraph84.panel = jPanel95;
        reportGraph74.panel = jPanel95;
        reportGraph69.panel = jPanel95;
        reportGraph4.panel = jPanel95;
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
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        boolean boolean89 = reportGraph4.isEmpty("", 10, (int) (short) -1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (-1), (int) (short) 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph39 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean44 = reportGraph39.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean49 = reportGraph39.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean54 = reportGraph39.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel60 = reportGraph59.panel;
        reportGraph39.panel = jPanel60;
        reportGraph24.panel = jPanel60;
        boolean boolean67 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel68 = reportGraph24.panel;
        reportGraph4.panel = jPanel68;
        java.lang.Class<?> wildcardClass70 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean30 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (-1), "");
        boolean boolean29 = reportGraph4.wrongAnalysisType("", 1, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
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
        boolean boolean54 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph64 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel70 = reportGraph69.panel;
        javax.swing.JPanel jPanel71 = reportGraph69.panel;
        reportGraph64.panel = jPanel71;
        reportGraph59.panel = jPanel71;
        statsVisualiser.graph.ReportGraph reportGraph78 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph83 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean88 = reportGraph83.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean93 = reportGraph83.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel94 = reportGraph83.panel;
        reportGraph78.panel = jPanel94;
        reportGraph59.panel = jPanel94;
        reportGraph9.panel = jPanel94;
        reportGraph4.panel = jPanel94;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(jPanel70);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(jPanel94);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
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
        javax.swing.JPanel jPanel95 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", 10, (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        java.lang.Class<?> wildcardClass21 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", 1, (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (-1), "hi!");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (-1), (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 0, "");
        boolean boolean36 = reportGraph4.isEmpty("", (int) '4', (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        boolean boolean81 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 0, "hi!");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        javax.swing.JPanel jPanel95 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass96 = jPanel95.getClass();
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
        org.junit.Assert.assertNotNull(jPanel95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) '4', "");
        boolean boolean9 = reportGraph4.isEmpty("", (-1), (int) '4', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        statsVisualiser.graph.ReportGraph reportGraph84 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean89 = reportGraph84.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean94 = reportGraph84.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel95 = reportGraph84.panel;
        reportGraph4.panel = jPanel95;
        java.lang.Class<?> wildcardClass97 = jPanel95.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNotNull(jPanel95);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass27 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', 0, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (-1), 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 10, "hi!");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        java.lang.Class<?> wildcardClass44 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
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
        reportGraph4.panel = jPanel40;
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel44);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph4.panel = jPanel16;
        java.lang.Class<?> wildcardClass18 = jPanel16.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        boolean boolean47 = reportGraph4.isEmpty("hi!", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel48 = reportGraph4.panel;
        boolean boolean53 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) 'a', "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        boolean boolean58 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        boolean boolean47 = reportGraph4.isEmpty("hi!", (int) '#', (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("", (int) (short) -1, (int) (short) -1, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (short) 100, (int) (short) 0, "hi!");
        java.lang.Class<?> wildcardClass32 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        boolean boolean59 = reportGraph4.isEmpty("", (int) (short) 100, (int) '#', "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (-1), (int) 'a', "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.isEmpty("", 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass24 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
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
        boolean boolean81 = reportGraph38.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        boolean boolean86 = reportGraph38.isEmpty("", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean91 = reportGraph38.isEmpty("", (int) '#', (int) (byte) 100, "");
        javax.swing.JPanel jPanel92 = reportGraph38.panel;
        reportGraph4.panel = jPanel92;
        java.lang.Class<?> wildcardClass94 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        reportGraph4.panel = jPanel11;
        boolean boolean17 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (-1), "hi!");
        java.lang.Class<?> wildcardClass17 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass21 = jPanel20.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (byte) 100, 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean24 = reportGraph19.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph9.panel = jPanel25;
        boolean boolean31 = reportGraph9.wrongAnalysisType("hi!", 1, (int) (byte) -1, "");
        javax.swing.JPanel jPanel32 = reportGraph9.panel;
        reportGraph4.panel = jPanel32;
        java.lang.Class<?> wildcardClass34 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (-1), "");
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass18 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 100, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 0, 100, "hi!");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass18 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 100, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 10, "hi!");
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (short) 1, "");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 0, "");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        boolean boolean64 = reportGraph4.wrongAnalysisType("", 100, (int) (byte) 0, "hi!");
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
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
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
        java.lang.Class<?> wildcardClass43 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.Class<?> wildcardClass69 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '4', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        boolean boolean27 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("", 100, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
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
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        boolean boolean49 = reportGraph4.isEmpty("", (-1), (int) (short) 0, "");
        boolean boolean54 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 0, "hi!");
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) 'a', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
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
        boolean boolean64 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 0, "hi!");
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
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass46 = jPanel45.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        boolean boolean41 = reportGraph4.isEmpty("hi!", 1, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
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
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) -1, 10, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) -1, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
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
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel66 = reportGraph65.panel;
        reportGraph4.panel = jPanel66;
        boolean boolean72 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 10, "");
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
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, 0, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        boolean boolean52 = reportGraph4.isEmpty("", 100, (int) (short) 10, "hi!");
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 10, "hi!");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
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
        boolean boolean38 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, 0, "hi!");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (-1), 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
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
        javax.swing.JPanel jPanel62 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel62);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) 'a', "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        boolean boolean22 = reportGraph4.isEmpty("hi!", (int) (short) 0, (-1), "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) ' ', "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, (int) 'a', "");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph16 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel17 = reportGraph16.panel;
        javax.swing.JPanel jPanel18 = reportGraph16.panel;
        reportGraph4.panel = jPanel18;
        boolean boolean24 = reportGraph4.isEmpty("", (int) (short) 0, (int) ' ', "");
        java.lang.Class<?> wildcardClass25 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
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
        javax.swing.JPanel jPanel59 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass60 = jPanel59.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 100, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass21 = jPanel20.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean20 = reportGraph15.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean30 = reportGraph25.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel31 = reportGraph25.panel;
        reportGraph15.panel = jPanel31;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean42 = reportGraph37.isEmpty("hi!", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean57 = reportGraph47.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph62 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean67 = reportGraph62.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean72 = reportGraph62.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean77 = reportGraph62.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel83 = reportGraph82.panel;
        reportGraph62.panel = jPanel83;
        reportGraph47.panel = jPanel83;
        boolean boolean90 = reportGraph47.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel91 = reportGraph47.panel;
        reportGraph37.panel = jPanel91;
        reportGraph15.panel = jPanel91;
        reportGraph4.panel = jPanel91;
        java.lang.Class<?> wildcardClass95 = jPanel91.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jPanel83);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
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
        boolean boolean80 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass81 = reportGraph4.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 1, "hi!");
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", (int) '#', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("hi!", 0, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass25 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) ' ', "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = null;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel48);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.lang.Class<?> wildcardClass45 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (short) 1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) '4', 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean34 = reportGraph24.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean39 = reportGraph24.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel45 = reportGraph44.panel;
        reportGraph24.panel = jPanel45;
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean56 = reportGraph51.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean61 = reportGraph51.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean66 = reportGraph51.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean76 = reportGraph71.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean86 = reportGraph81.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel87 = reportGraph81.panel;
        reportGraph71.panel = jPanel87;
        reportGraph51.panel = jPanel87;
        reportGraph24.panel = jPanel87;
        javax.swing.JPanel jPanel91 = reportGraph24.panel;
        javax.swing.JPanel jPanel92 = reportGraph24.panel;
        reportGraph4.panel = jPanel92;
        boolean boolean98 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + true + "'", boolean98 == true);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        boolean boolean76 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        javax.swing.JPanel jPanel21 = null;
        reportGraph4.panel = jPanel21;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean19 = reportGraph9.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean24 = reportGraph9.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel30 = reportGraph29.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        boolean boolean96 = reportGraph4.isEmpty("hi!", (int) '4', (int) '4', "hi!");
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
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 0, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean24 = reportGraph14.isEmpty("", (int) (byte) -1, 100, "");
        boolean boolean29 = reportGraph14.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel30 = reportGraph14.panel;
        reportGraph4.panel = jPanel30;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean19 = reportGraph9.isEmpty("hi!", 100, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean29 = reportGraph24.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph34 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean39 = reportGraph34.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel40 = reportGraph34.panel;
        boolean boolean45 = reportGraph34.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean50 = reportGraph34.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel51 = reportGraph34.panel;
        reportGraph24.panel = jPanel51;
        reportGraph9.panel = jPanel51;
        reportGraph4.panel = jPanel51;
        java.lang.Class<?> wildcardClass55 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) '4', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph4.isEmpty("", (int) (byte) -1, (-1), "");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean41 = reportGraph36.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel52 = reportGraph46.panel;
        boolean boolean57 = reportGraph46.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean62 = reportGraph46.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel63 = reportGraph46.panel;
        reportGraph36.panel = jPanel63;
        boolean boolean69 = reportGraph36.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel70 = null;
        reportGraph36.panel = jPanel70;
        boolean boolean76 = reportGraph36.isEmpty("hi!", 0, (int) (byte) 100, "");
        boolean boolean81 = reportGraph36.wrongAnalysisType("", (int) (byte) 10, (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph86 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean91 = reportGraph86.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean96 = reportGraph86.wrongAnalysisType("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel97 = reportGraph86.panel;
        reportGraph36.panel = jPanel97;
        reportGraph4.panel = jPanel97;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(jPanel97);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
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
        javax.swing.JPanel jPanel73 = reportGraph4.panel;
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
        org.junit.Assert.assertNotNull(jPanel73);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.Class<?> wildcardClass34 = jPanel31.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("", (int) (byte) 1, 10, "hi!");
        boolean boolean32 = reportGraph4.isEmpty("hi!", (int) (byte) 0, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean47 = reportGraph37.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean62 = reportGraph57.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph57.panel;
        reportGraph52.panel = jPanel63;
        reportGraph37.panel = jPanel63;
        javax.swing.JPanel jPanel66 = reportGraph37.panel;
        boolean boolean71 = reportGraph37.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        boolean boolean76 = reportGraph37.wrongAnalysisType("", (int) '4', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph86 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean91 = reportGraph86.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel92 = reportGraph86.panel;
        reportGraph81.panel = jPanel92;
        reportGraph37.panel = jPanel92;
        reportGraph4.panel = jPanel92;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertNotNull(jPanel66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jPanel92);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, 0, "");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 10, 0, "hi!");
        boolean boolean24 = reportGraph4.isEmpty("", 1, (int) (short) 10, "");
        boolean boolean29 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass30 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 100, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        boolean boolean79 = reportGraph4.isEmpty("hi!", (int) '4', (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) ' ', "");
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass51 = jPanel50.getClass();
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
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '4', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel26 = reportGraph25.panel;
        javax.swing.JPanel jPanel27 = reportGraph25.panel;
        reportGraph4.panel = jPanel27;
        statsVisualiser.graph.ReportGraph reportGraph33 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        boolean boolean38 = reportGraph33.wrongAnalysisType("hi!", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean43 = reportGraph33.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean53 = reportGraph48.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel54 = reportGraph48.panel;
        boolean boolean59 = reportGraph48.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean64 = reportGraph48.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel65 = reportGraph48.panel;
        reportGraph33.panel = jPanel65;
        reportGraph4.panel = jPanel65;
        java.lang.Class<?> wildcardClass68 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (byte) 10, "");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 0, "");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (byte) 10, "");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        java.lang.Class<?> wildcardClass91 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean20 = reportGraph15.isEmpty("hi!", 0, (int) 'a', "hi!");
        javax.swing.JPanel jPanel21 = reportGraph15.panel;
        reportGraph4.panel = jPanel21;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (short) 1, "");
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) -1, "");
        boolean boolean15 = reportGraph4.isEmpty("", (int) (byte) -1, (-1), "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) '4', 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        javax.swing.JPanel jPanel7 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass8 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass13 = jPanel12.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass19 = jPanel18.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) ' ', (-1), "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) '#', "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel56);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph4.panel = jPanel23;
        boolean boolean29 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 100, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel35 = reportGraph29.panel;
        reportGraph24.panel = jPanel35;
        reportGraph9.panel = jPanel35;
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean47 = reportGraph42.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean57 = reportGraph52.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean62 = reportGraph52.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean72 = reportGraph67.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel73 = reportGraph67.panel;
        reportGraph52.panel = jPanel73;
        reportGraph42.panel = jPanel73;
        reportGraph9.panel = jPanel73;
        boolean boolean81 = reportGraph9.wrongAnalysisType("", (int) '4', (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph86 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel87 = reportGraph86.panel;
        boolean boolean92 = reportGraph86.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel93 = reportGraph86.panel;
        reportGraph9.panel = jPanel93;
        reportGraph4.panel = jPanel93;
        java.lang.Class<?> wildcardClass96 = jPanel93.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel73);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jPanel87);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass39 = jPanel38.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
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
        boolean boolean97 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, 1, "");
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        java.lang.Class<?> wildcardClass64 = reportGraph4.getClass();
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
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
        statsVisualiser.graph.ReportGraph reportGraph76 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean81 = reportGraph76.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean86 = reportGraph76.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean91 = reportGraph76.isEmpty("", (int) (byte) 100, 100, "hi!");
        javax.swing.JPanel jPanel92 = reportGraph76.panel;
        reportGraph4.panel = jPanel92;
        boolean boolean98 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (short) 1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph9.panel = jPanel16;
        reportGraph4.panel = jPanel16;
        java.lang.Class<?> wildcardClass19 = jPanel16.getClass();
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
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
        boolean boolean49 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean59 = reportGraph54.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel60 = reportGraph54.panel;
        javax.swing.JPanel jPanel61 = reportGraph54.panel;
        reportGraph4.panel = jPanel61;
        boolean boolean67 = reportGraph4.isEmpty("", (-1), (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass39 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        javax.swing.JPanel jPanel38 = reportGraph4.panel;
        boolean boolean43 = reportGraph4.isEmpty("", 0, (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) -1, (int) (byte) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        boolean boolean49 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean59 = reportGraph54.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel60 = reportGraph54.panel;
        javax.swing.JPanel jPanel61 = reportGraph54.panel;
        reportGraph4.panel = jPanel61;
        java.lang.Class<?> wildcardClass63 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph10.panel;
        javax.swing.JPanel jPanel12 = reportGraph10.panel;
        reportGraph4.panel = jPanel12;
        java.lang.Class<?> wildcardClass14 = jPanel12.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 100, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", 0, 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 10, "hi!");
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
        java.lang.Class<?> wildcardClass59 = jPanel57.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "");
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
        reportGraph4.panel = jPanel64;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(jPanel64);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
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
        statsVisualiser.graph.ReportGraph reportGraph41 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean51 = reportGraph46.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean56 = reportGraph46.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean61 = reportGraph46.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph46.panel = jPanel67;
        reportGraph41.panel = jPanel67;
        boolean boolean74 = reportGraph41.isEmpty("", (int) (short) 100, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel75 = reportGraph41.panel;
        reportGraph4.panel = jPanel75;
        boolean boolean81 = reportGraph4.isEmpty("", (int) 'a', 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel28);
        org.junit.Assert.assertNotNull(jPanel29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(jPanel75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean19 = reportGraph9.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel20 = reportGraph9.panel;
        reportGraph4.panel = jPanel20;
        boolean boolean26 = reportGraph4.isEmpty("", 100, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) -1, "hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 0, (int) '4', "hi!");
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
        reportGraph14.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        boolean boolean88 = reportGraph4.wrongAnalysisType("", (int) 'a', (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        boolean boolean51 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, 1, "hi!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph11 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel12 = reportGraph11.panel;
        statsVisualiser.graph.ReportGraph reportGraph17 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean22 = reportGraph17.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean27 = reportGraph17.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        reportGraph32.panel = jPanel43;
        reportGraph17.panel = jPanel43;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean55 = reportGraph50.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean65 = reportGraph60.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean70 = reportGraph60.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean80 = reportGraph75.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel81 = reportGraph75.panel;
        reportGraph60.panel = jPanel81;
        reportGraph50.panel = jPanel81;
        reportGraph17.panel = jPanel81;
        reportGraph11.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        java.lang.Class<?> wildcardClass87 = jPanel81.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, 1, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        java.lang.Class<?> wildcardClass92 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (-1), "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel18 = reportGraph4.panel;
        boolean boolean23 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
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
        java.lang.Class<?> wildcardClass45 = reportGraph4.getClass();
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel32 = reportGraph31.panel;
        boolean boolean37 = reportGraph31.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel38 = reportGraph31.panel;
        boolean boolean43 = reportGraph31.wrongAnalysisType("", (int) (byte) 1, 100, "hi!");
        boolean boolean48 = reportGraph31.wrongAnalysisType("", 0, (int) (byte) 0, "");
        boolean boolean53 = reportGraph31.wrongAnalysisType("", 0, (-1), "hi!");
        statsVisualiser.graph.ReportGraph reportGraph58 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean63 = reportGraph58.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph68 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean73 = reportGraph68.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel74 = reportGraph68.panel;
        reportGraph58.panel = jPanel74;
        boolean boolean80 = reportGraph58.wrongAnalysisType("hi!", (int) ' ', 100, "");
        javax.swing.JPanel jPanel81 = reportGraph58.panel;
        reportGraph31.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(jPanel74);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(jPanel81);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) 'a', "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) '#', 0, "hi!");
        java.lang.Class<?> wildcardClass21 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', 0, "");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
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
        java.lang.Class<?> wildcardClass73 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
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
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 1, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean36 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (byte) 0, "");
        boolean boolean41 = reportGraph4.wrongAnalysisType("", (-1), 100, "");
        java.lang.Class<?> wildcardClass42 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        boolean boolean92 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel93 = null;
        reportGraph4.panel = jPanel93;
        boolean boolean99 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 1, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass11 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 100, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 0, "");
        boolean boolean14 = reportGraph9.isEmpty("", (int) ' ', (-1), "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        boolean boolean54 = reportGraph4.isEmpty("hi!", (int) '4', (int) (short) 10, "");
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) -1, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) ' ', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) '4', "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        boolean boolean27 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 0, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) (byte) -1, "");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) ' ', "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 1, "");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 10, "hi!");
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (short) 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (short) 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", 0, (int) 'a', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph35 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean40 = reportGraph35.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean45 = reportGraph35.isEmpty("", (int) 'a', (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel46 = reportGraph35.panel;
        reportGraph30.panel = jPanel46;
        reportGraph4.panel = jPanel46;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel46);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) '4', "");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
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
        java.lang.Class<?> wildcardClass55 = reportGraph4.getClass();
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        boolean boolean70 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 0, "");
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 100, "hi!");
        boolean boolean21 = reportGraph4.isEmpty("", (int) (short) 1, (int) (byte) -1, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, 100, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (-1), "hi!");
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', (int) (short) -1, "hi!");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("hi!", (int) (short) 100, (int) (short) 1, "");
        boolean boolean25 = reportGraph9.wrongAnalysisType("", (int) (short) 10, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, (-1), "");
        javax.swing.JPanel jPanel31 = reportGraph30.panel;
        javax.swing.JPanel jPanel32 = reportGraph30.panel;
        reportGraph9.panel = jPanel32;
        statsVisualiser.graph.ReportGraph reportGraph38 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        boolean boolean43 = reportGraph38.wrongAnalysisType("hi!", (int) (byte) 0, (int) '4', "hi!");
        boolean boolean48 = reportGraph38.wrongAnalysisType("hi!", (int) (byte) 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel59 = reportGraph53.panel;
        boolean boolean64 = reportGraph53.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean69 = reportGraph53.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel70 = reportGraph53.panel;
        reportGraph38.panel = jPanel70;
        reportGraph9.panel = jPanel70;
        reportGraph4.panel = jPanel70;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(jPanel70);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.lang.Class<?> wildcardClass34 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, 10, "hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 1, (int) 'a', "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', 0, "hi!");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 10, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.lang.Class<?> wildcardClass59 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        boolean boolean43 = reportGraph4.wrongAnalysisType("hi!", 10, (int) 'a', "");
        javax.swing.JPanel jPanel44 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(jPanel44);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        javax.swing.JPanel jPanel32 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass33 = jPanel32.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        boolean boolean44 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, 10, "");
        javax.swing.JPanel jPanel45 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass46 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (short) -1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
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
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean74 = reportGraph69.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean79 = reportGraph69.isEmpty("", 1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel80 = reportGraph69.panel;
        reportGraph4.panel = jPanel80;
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(jPanel80);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (short) 10, "hi!");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
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
        javax.swing.JPanel jPanel84 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass85 = jPanel84.getClass();
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
        org.junit.Assert.assertNotNull(jPanel84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.Class<?> wildcardClass39 = jPanel38.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 100, "hi!");
        java.lang.Class<?> wildcardClass27 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 100, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
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
        boolean boolean47 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 0, "hi!");
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (short) 0, "");
        java.lang.Class<?> wildcardClass49 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        boolean boolean49 = reportGraph4.isEmpty("", (int) 'a', (int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 10, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph9.panel = jPanel36;
        boolean boolean42 = reportGraph9.isEmpty("", 100, (int) (short) 10, "");
        boolean boolean47 = reportGraph9.isEmpty("", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel48 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean63 = reportGraph53.isEmpty("hi!", 100, 100, "");
        boolean boolean68 = reportGraph53.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel69 = reportGraph53.panel;
        reportGraph9.panel = jPanel69;
        reportGraph4.panel = jPanel69;
        boolean boolean76 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jPanel69);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
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
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 10, "");
        javax.swing.JPanel jPanel54 = reportGraph53.panel;
        reportGraph4.panel = jPanel54;
        javax.swing.JPanel jPanel56 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertNotNull(jPanel56);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        reportGraph4.panel = jPanel26;
        java.lang.Class<?> wildcardClass28 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass12 = jPanel11.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) (byte) 10, "hi!");
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
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
        javax.swing.JPanel jPanel52 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(jPanel52);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph11 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 100, "hi!");
        javax.swing.JPanel jPanel12 = reportGraph11.panel;
        statsVisualiser.graph.ReportGraph reportGraph17 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean22 = reportGraph17.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean27 = reportGraph17.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean42 = reportGraph37.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        reportGraph32.panel = jPanel43;
        reportGraph17.panel = jPanel43;
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean55 = reportGraph50.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph60 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean65 = reportGraph60.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean70 = reportGraph60.wrongAnalysisType("hi!", 1, 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph75 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean80 = reportGraph75.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel81 = reportGraph75.panel;
        reportGraph60.panel = jPanel81;
        reportGraph50.panel = jPanel81;
        reportGraph17.panel = jPanel81;
        reportGraph11.panel = jPanel81;
        reportGraph4.panel = jPanel81;
        javax.swing.JPanel jPanel87 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(jPanel81);
        org.junit.Assert.assertNotNull(jPanel87);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass12 = jPanel11.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        boolean boolean96 = reportGraph4.isEmpty("hi!", (int) (byte) 10, 0, "hi!");
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (-1), "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 0, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) ' ', 100, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        boolean boolean43 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) (byte) 0, "hi!");
        boolean boolean48 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 0, "hi!");
        boolean boolean53 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) 10, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) ' ', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass11 = jPanel10.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) 'a', "hi!");
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        javax.swing.JPanel jPanel12 = reportGraph4.panel;
        boolean boolean17 = reportGraph4.isEmpty("", 1, (int) 'a', "");
        java.lang.Class<?> wildcardClass18 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertNotNull(jPanel12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 1, (int) (short) 1, "");
        boolean boolean24 = reportGraph4.isEmpty("hi!", (int) (short) 100, 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, 10, "hi!");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) (byte) 100, "");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) 'a', "");
        java.lang.Class<?> wildcardClass22 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) 1, "");
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 100, 0, "");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass21 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) 'a', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) '4', "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel25 = reportGraph24.panel;
        reportGraph4.panel = jPanel25;
        boolean boolean31 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph36 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean41 = reportGraph36.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel42 = reportGraph36.panel;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean62 = reportGraph57.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel63 = reportGraph57.panel;
        reportGraph47.panel = jPanel63;
        reportGraph36.panel = jPanel63;
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        boolean boolean75 = reportGraph70.wrongAnalysisType("", (int) (byte) 0, (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph80 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean85 = reportGraph80.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean90 = reportGraph80.isEmpty("", (int) (byte) -1, 0, "");
        javax.swing.JPanel jPanel91 = reportGraph80.panel;
        reportGraph70.panel = jPanel91;
        reportGraph36.panel = jPanel91;
        reportGraph4.panel = jPanel91;
        javax.swing.JPanel jPanel95 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(jPanel91);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) '4', "");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        boolean boolean30 = reportGraph19.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean35 = reportGraph19.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel36 = reportGraph19.panel;
        reportGraph9.panel = jPanel36;
        boolean boolean42 = reportGraph9.isEmpty("", 100, (int) (short) 10, "");
        boolean boolean47 = reportGraph9.isEmpty("", (int) 'a', (int) (short) 1, "");
        javax.swing.JPanel jPanel48 = reportGraph9.panel;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean63 = reportGraph53.isEmpty("hi!", 100, 100, "");
        boolean boolean68 = reportGraph53.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel69 = reportGraph53.panel;
        reportGraph9.panel = jPanel69;
        reportGraph4.panel = jPanel69;
        java.lang.Class<?> wildcardClass72 = jPanel69.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(jPanel69);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
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
        statsVisualiser.graph.ReportGraph reportGraph55 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean60 = reportGraph55.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph65 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean70 = reportGraph65.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel71 = reportGraph65.panel;
        boolean boolean76 = reportGraph65.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean81 = reportGraph65.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel82 = reportGraph65.panel;
        reportGraph55.panel = jPanel82;
        boolean boolean88 = reportGraph55.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean93 = reportGraph55.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel94 = reportGraph55.panel;
        reportGraph4.panel = jPanel94;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(jPanel82);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(jPanel94);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, 1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        statsVisualiser.graph.ReportGraph reportGraph40 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean45 = reportGraph40.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean50 = reportGraph40.isEmpty("hi!", 100, 100, "");
        boolean boolean55 = reportGraph40.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel56 = reportGraph40.panel;
        boolean boolean61 = reportGraph40.isEmpty("", (int) (byte) 0, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel62 = reportGraph40.panel;
        reportGraph4.panel = jPanel62;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(jPanel56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(jPanel62);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
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
        boolean boolean55 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, 0, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 10, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        boolean boolean35 = reportGraph24.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean40 = reportGraph24.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel41 = reportGraph24.panel;
        reportGraph14.panel = jPanel41;
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean52 = reportGraph47.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean57 = reportGraph47.isEmpty("hi!", 100, 100, "");
        boolean boolean62 = reportGraph47.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel63 = reportGraph47.panel;
        reportGraph14.panel = jPanel63;
        reportGraph4.panel = jPanel63;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(jPanel63);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass23 = jPanel22.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
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
        java.lang.Class<?> wildcardClass34 = jPanel31.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel31);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean19 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        javax.swing.JPanel jPanel23 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
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
        boolean boolean77 = reportGraph4.wrongAnalysisType("", 0, (int) (short) 100, "");
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
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel26 = reportGraph4.panel;
        javax.swing.JPanel jPanel27 = reportGraph4.panel;
        boolean boolean32 = reportGraph4.isEmpty("", (int) (short) 1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (byte) 100, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (byte) 100, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 0, (int) ' ', "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean39 = reportGraph29.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean44 = reportGraph29.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean59 = reportGraph49.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean64 = reportGraph49.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel65 = reportGraph49.panel;
        reportGraph29.panel = jPanel65;
        statsVisualiser.graph.ReportGraph reportGraph71 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel72 = reportGraph71.panel;
        reportGraph29.panel = jPanel72;
        reportGraph4.panel = jPanel72;
        java.lang.Class<?> wildcardClass75 = jPanel72.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertNotNull(jPanel72);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) (short) 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", (int) (short) 0, 1, "hi!");
        boolean boolean15 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (int) (short) 0, "hi!");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, 0, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (byte) 10, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean15 = reportGraph10.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean20 = reportGraph10.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean35 = reportGraph30.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel36 = reportGraph30.panel;
        reportGraph25.panel = jPanel36;
        reportGraph10.panel = jPanel36;
        javax.swing.JPanel jPanel39 = reportGraph10.panel;
        boolean boolean44 = reportGraph10.wrongAnalysisType("hi!", (-1), (int) (byte) 1, "");
        boolean boolean49 = reportGraph10.wrongAnalysisType("", (int) '4', (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph54 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph59 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean64 = reportGraph59.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel65 = reportGraph59.panel;
        reportGraph54.panel = jPanel65;
        reportGraph10.panel = jPanel65;
        reportGraph4.panel = jPanel65;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(jPanel65);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 0, (int) (short) 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph25 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
        statsVisualiser.graph.ReportGraph reportGraph30 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean35 = reportGraph30.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean40 = reportGraph30.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean45 = reportGraph30.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph50 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel51 = reportGraph50.panel;
        reportGraph30.panel = jPanel51;
        reportGraph25.panel = jPanel51;
        reportGraph20.panel = jPanel51;
        reportGraph4.panel = jPanel51;
        boolean boolean60 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 1, 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        statsVisualiser.graph.ReportGraph reportGraph67 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean72 = reportGraph67.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean77 = reportGraph67.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        javax.swing.JPanel jPanel78 = reportGraph67.panel;
        reportGraph4.panel = jPanel78;
        boolean boolean84 = reportGraph4.isEmpty("hi!", (int) (short) 10, 0, "");
        boolean boolean89 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 100, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (int) (short) 10, "hi!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        boolean boolean54 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) '#', "");
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        boolean boolean14 = reportGraph4.isEmpty("", 100, (int) (byte) 100, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) 0, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) -1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        statsVisualiser.graph.ReportGraph reportGraph89 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph94 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel95 = reportGraph94.panel;
        reportGraph89.panel = jPanel95;
        javax.swing.JPanel jPanel97 = reportGraph89.panel;
        reportGraph4.panel = jPanel97;
        java.lang.Class<?> wildcardClass99 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(jPanel95);
        org.junit.Assert.assertNotNull(jPanel97);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        boolean boolean60 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) -1, "");
        boolean boolean65 = reportGraph4.isEmpty("", (int) (short) -1, (int) '4', "");
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, (int) '#', "hi!");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel5 = null;
        reportGraph4.panel = jPanel5;
        statsVisualiser.graph.ReportGraph reportGraph11 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean16 = reportGraph11.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph31 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean36 = reportGraph31.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean41 = reportGraph31.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph51 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean56 = reportGraph51.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel57 = reportGraph51.panel;
        reportGraph46.panel = jPanel57;
        reportGraph31.panel = jPanel57;
        javax.swing.JPanel jPanel60 = reportGraph31.panel;
        reportGraph26.panel = jPanel60;
        reportGraph21.panel = jPanel60;
        reportGraph11.panel = jPanel60;
        reportGraph4.panel = jPanel60;
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(jPanel57);
        org.junit.Assert.assertNotNull(jPanel60);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
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
        boolean boolean47 = reportGraph4.wrongAnalysisType("", 0, 1, "");
        boolean boolean52 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, 10, "");
        statsVisualiser.graph.ReportGraph reportGraph57 = new statsVisualiser.graph.ReportGraph("", (-1), 100, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph57.panel;
        reportGraph4.panel = jPanel58;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(jPanel58);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.wrongAnalysisType("hi!", 100, 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (byte) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.wrongAnalysisType("hi!", (int) (byte) 10, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) '4', (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph29 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean34 = reportGraph29.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean39 = reportGraph29.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph44 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean54 = reportGraph49.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel55 = reportGraph49.panel;
        reportGraph44.panel = jPanel55;
        reportGraph29.panel = jPanel55;
        javax.swing.JPanel jPanel58 = reportGraph29.panel;
        reportGraph24.panel = jPanel58;
        reportGraph19.panel = jPanel58;
        reportGraph9.panel = jPanel58;
        javax.swing.JPanel jPanel62 = reportGraph9.panel;
        reportGraph4.panel = jPanel62;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(jPanel55);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel62);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.Class<?> wildcardClass72 = jPanel69.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph10 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean15 = reportGraph10.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph20 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean25 = reportGraph20.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel26 = reportGraph20.panel;
        boolean boolean31 = reportGraph20.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean36 = reportGraph20.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel37 = reportGraph20.panel;
        reportGraph10.panel = jPanel37;
        boolean boolean43 = reportGraph10.isEmpty("", 100, (int) (short) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph48 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel49 = reportGraph48.panel;
        reportGraph10.panel = jPanel49;
        reportGraph4.panel = jPanel49;
        java.lang.Class<?> wildcardClass52 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(jPanel49);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) -1, (int) (byte) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        statsVisualiser.graph.ReportGraph reportGraph15 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) -1, "");
        javax.swing.JPanel jPanel16 = reportGraph15.panel;
        reportGraph4.panel = jPanel16;
        java.lang.Class<?> wildcardClass18 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        java.lang.Class<?> wildcardClass39 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(jPanel36);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 0, (int) 'a', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        reportGraph4.panel = jPanel10;
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
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
        boolean boolean66 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) 1, "");
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass6 = jPanel5.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass21 = jPanel20.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
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
        java.lang.Class<?> wildcardClass46 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        boolean boolean59 = reportGraph4.wrongAnalysisType("", (int) (short) -1, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel60 = reportGraph4.panel;
        boolean boolean65 = reportGraph4.isEmpty("", 1, (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(jPanel52);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(jPanel60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
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
        java.lang.Class<?> wildcardClass55 = jPanel53.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
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
        boolean boolean49 = reportGraph4.isEmpty("hi!", 1, 0, "hi!");
        javax.swing.JPanel jPanel50 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass51 = reportGraph4.getClass();
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
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        java.lang.Class<?> wildcardClass49 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 10, (int) (byte) 100, "hi!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        boolean boolean57 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) (short) -1, "");
        boolean boolean62 = reportGraph4.wrongAnalysisType("", 1, 0, "hi!");
        javax.swing.JPanel jPanel63 = null;
        reportGraph4.panel = jPanel63;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) (short) 0, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) 'a', (int) (byte) -1, "hi!");
        boolean boolean15 = reportGraph4.isEmpty("", (int) (byte) 10, 0, "hi!");
        java.lang.Class<?> wildcardClass16 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
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
        boolean boolean40 = reportGraph4.isEmpty("", (-1), 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph45 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel46 = reportGraph45.panel;
        javax.swing.JPanel jPanel47 = reportGraph45.panel;
        reportGraph4.panel = jPanel47;
        java.lang.Class<?> wildcardClass49 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertNotNull(jPanel34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel46);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", (int) 'a', (int) (byte) -1, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 1, (int) '4', "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, 0, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        boolean boolean15 = reportGraph9.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph9.panel;
        reportGraph4.panel = jPanel16;
        statsVisualiser.graph.ReportGraph reportGraph22 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 100, (-1), "");
        javax.swing.JPanel jPanel23 = reportGraph22.panel;
        reportGraph4.panel = jPanel23;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel23);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 100, (int) (byte) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (-1), (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("", (int) 'a', 100, "");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean26 = reportGraph21.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        statsVisualiser.graph.ReportGraph reportGraph32 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean37 = reportGraph32.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean42 = reportGraph32.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph47 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph52 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean57 = reportGraph52.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel58 = reportGraph52.panel;
        reportGraph47.panel = jPanel58;
        reportGraph32.panel = jPanel58;
        javax.swing.JPanel jPanel61 = reportGraph32.panel;
        reportGraph21.panel = jPanel61;
        boolean boolean67 = reportGraph21.wrongAnalysisType("hi!", (int) '#', (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel68 = reportGraph21.panel;
        reportGraph9.panel = jPanel68;
        reportGraph4.panel = jPanel68;
        java.lang.Class<?> wildcardClass71 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(jPanel58);
        org.junit.Assert.assertNotNull(jPanel61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(jPanel68);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        boolean boolean25 = reportGraph4.isEmpty("", (int) (byte) 10, (int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("", 1, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph14.panel = jPanel25;
        boolean boolean31 = reportGraph14.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel32 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        javax.swing.JPanel jPanel44 = reportGraph37.panel;
        reportGraph14.panel = jPanel44;
        reportGraph4.panel = jPanel44;
        java.lang.Class<?> wildcardClass47 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 1, (int) (short) 1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) 100, "");
        boolean boolean16 = reportGraph4.isEmpty("hi!", 10, (int) (byte) 100, "hi!");
        boolean boolean21 = reportGraph4.isEmpty("", 10, (int) (byte) 10, "");
        javax.swing.JPanel jPanel22 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) 'a', (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
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
        statsVisualiser.graph.ReportGraph reportGraph82 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean87 = reportGraph82.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel88 = reportGraph82.panel;
        reportGraph4.panel = jPanel88;
        statsVisualiser.graph.ReportGraph reportGraph94 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel95 = reportGraph94.panel;
        javax.swing.JPanel jPanel96 = reportGraph94.panel;
        reportGraph4.panel = jPanel96;
        javax.swing.JPanel jPanel98 = reportGraph4.panel;
        javax.swing.JPanel jPanel99 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(jPanel88);
        org.junit.Assert.assertNotNull(jPanel95);
        org.junit.Assert.assertNotNull(jPanel96);
        org.junit.Assert.assertNotNull(jPanel98);
        org.junit.Assert.assertNotNull(jPanel99);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 0, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 1, 10, "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, 100, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass7 = jPanel6.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        boolean boolean20 = reportGraph9.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean25 = reportGraph9.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel26 = reportGraph9.panel;
        reportGraph4.panel = jPanel26;
        boolean boolean32 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 0, "hi!");
        javax.swing.JPanel jPanel33 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(jPanel26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) ' ', "");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, 0, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        boolean boolean47 = reportGraph4.wrongAnalysisType("", (int) (short) 10, (int) '4', "hi!");
        javax.swing.JPanel jPanel48 = null;
        reportGraph4.panel = jPanel48;
        boolean boolean54 = reportGraph4.isEmpty("hi!", (int) (byte) 1, (int) (short) 10, "");
        boolean boolean59 = reportGraph4.isEmpty("hi!", (int) (short) 1, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 100, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 10, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        boolean boolean61 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', (int) ' ', "hi!");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 1, 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        reportGraph4.panel = jPanel15;
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
        boolean boolean32 = reportGraph21.isEmpty("", (int) '4', (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel33 = reportGraph21.panel;
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
        boolean boolean76 = reportGraph38.wrongAnalysisType("", (int) (short) 0, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph81 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean86 = reportGraph81.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        javax.swing.JPanel jPanel87 = reportGraph81.panel;
        reportGraph38.panel = jPanel87;
        reportGraph21.panel = jPanel87;
        reportGraph4.panel = jPanel87;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(jPanel65);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(jPanel87);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        boolean boolean42 = reportGraph4.isEmpty("hi!", (int) (byte) 0, (int) '4', "");
        boolean boolean47 = reportGraph4.isEmpty("hi!", (int) (short) 10, (-1), "");
        java.lang.Class<?> wildcardClass48 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 100, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        boolean boolean92 = reportGraph4.wrongAnalysisType("hi!", (int) ' ', 1, "hi!");
        javax.swing.JPanel jPanel93 = reportGraph4.panel;
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
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(jPanel93);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', 0, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 0, 1, "hi!");
        java.lang.Class<?> wildcardClass15 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) (short) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) 'a', (int) ' ', "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) '#', (int) '#', "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (byte) -1, "");
        boolean boolean24 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "");
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) 10, 1, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("hi!", 0, 100, "hi!");
        boolean boolean30 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        java.lang.Class<?> wildcardClass31 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
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
        boolean boolean70 = reportGraph4.isEmpty("", 0, (int) (byte) 100, "");
        boolean boolean75 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (byte) 0, "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (short) 1, "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (short) -1, (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", (int) (byte) -1, 100, "");
        boolean boolean19 = reportGraph4.isEmpty("", (int) (short) 0, 100, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass21 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("", (int) (short) -1, 10, "");
        boolean boolean25 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 100, (int) (short) -1, "hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
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
        boolean boolean58 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(jPanel50);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) '4', (int) 'a', "");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) '#', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel32 = reportGraph26.panel;
        boolean boolean37 = reportGraph26.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean42 = reportGraph26.wrongAnalysisType("", (int) (short) 10, 1, "");
        boolean boolean47 = reportGraph26.wrongAnalysisType("", (int) ' ', (int) (byte) -1, "");
        javax.swing.JPanel jPanel48 = reportGraph26.panel;
        reportGraph4.panel = jPanel48;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(jPanel48);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("", (int) (byte) 100, (int) '#', "");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) 'a', "hi!");
        javax.swing.JPanel jPanel22 = reportGraph21.panel;
        javax.swing.JPanel jPanel23 = reportGraph21.panel;
        reportGraph4.panel = jPanel23;
        javax.swing.JPanel jPanel25 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertNotNull(jPanel23);
        org.junit.Assert.assertNotNull(jPanel25);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) 'a', (int) (short) 1, "");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        javax.swing.JPanel jPanel6 = reportGraph4.panel;
        boolean boolean11 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) 100, "");
        boolean boolean16 = reportGraph4.isEmpty("hi!", 10, (int) (byte) 100, "hi!");
        boolean boolean21 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, (int) (short) 0, "hi!");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("", 100, 1, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("", (int) '4', (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("hi!", 10, (int) (byte) 0, "hi!");
        javax.swing.JPanel jPanel20 = reportGraph19.panel;
        reportGraph9.panel = jPanel20;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph27 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean32 = reportGraph27.wrongAnalysisType("hi!", (int) (byte) 100, (int) (byte) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        boolean boolean48 = reportGraph37.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean53 = reportGraph37.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel54 = reportGraph37.panel;
        reportGraph27.panel = jPanel54;
        boolean boolean60 = reportGraph27.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "hi!");
        boolean boolean65 = reportGraph27.wrongAnalysisType("", (int) (short) 0, (int) (byte) 1, "");
        statsVisualiser.graph.ReportGraph reportGraph70 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean75 = reportGraph70.wrongAnalysisType("hi!", (-1), (int) ' ', "");
        javax.swing.JPanel jPanel76 = reportGraph70.panel;
        reportGraph27.panel = jPanel76;
        reportGraph4.panel = jPanel76;
        java.lang.Class<?> wildcardClass79 = jPanel76.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(jPanel54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(jPanel76);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) -1, (int) (byte) -1, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 100, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', 1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean14 = reportGraph9.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        boolean boolean21 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        boolean boolean26 = reportGraph4.wrongAnalysisType("", 100, (int) (short) 100, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) -1, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel20 = reportGraph14.panel;
        reportGraph4.panel = jPanel20;
        statsVisualiser.graph.ReportGraph reportGraph26 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean31 = reportGraph26.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean36 = reportGraph26.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean41 = reportGraph26.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph46 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        javax.swing.JPanel jPanel47 = reportGraph46.panel;
        reportGraph26.panel = jPanel47;
        statsVisualiser.graph.ReportGraph reportGraph53 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean58 = reportGraph53.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean63 = reportGraph53.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean68 = reportGraph53.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph73 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean78 = reportGraph73.wrongAnalysisType("", 10, (int) (short) -1, "");
        statsVisualiser.graph.ReportGraph reportGraph83 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean88 = reportGraph83.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel89 = reportGraph83.panel;
        reportGraph73.panel = jPanel89;
        reportGraph53.panel = jPanel89;
        reportGraph26.panel = jPanel89;
        javax.swing.JPanel jPanel93 = reportGraph26.panel;
        reportGraph4.panel = jPanel93;
        boolean boolean99 = reportGraph4.wrongAnalysisType("hi!", (-1), (int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(jPanel89);
        org.junit.Assert.assertNotNull(jPanel93);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        boolean boolean46 = reportGraph4.isEmpty("", (int) (short) 1, (int) (short) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        boolean boolean88 = reportGraph4.wrongAnalysisType("", (-1), (int) ' ', "");
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
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, (int) (short) -1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", 100, (int) (byte) 100, "");
        boolean boolean24 = reportGraph4.isEmpty("", 0, 0, "");
        boolean boolean29 = reportGraph4.wrongAnalysisType("hi!", 0, (int) (byte) 100, "");
        javax.swing.JPanel jPanel30 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) 'a', (int) (short) 1, "hi!");
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
        reportGraph4.panel = jPanel48;
        java.lang.Class<?> wildcardClass51 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(jPanel48);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (short) 10, (int) (byte) -1, "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) ' ', (int) ' ', "");
        boolean boolean20 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, 0, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean24 = reportGraph19.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel25 = reportGraph19.panel;
        reportGraph14.panel = jPanel25;
        boolean boolean31 = reportGraph14.wrongAnalysisType("", 10, (int) (byte) 1, "");
        javax.swing.JPanel jPanel32 = reportGraph14.panel;
        statsVisualiser.graph.ReportGraph reportGraph37 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean42 = reportGraph37.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel43 = reportGraph37.panel;
        javax.swing.JPanel jPanel44 = reportGraph37.panel;
        reportGraph14.panel = jPanel44;
        reportGraph4.panel = jPanel44;
        javax.swing.JPanel jPanel47 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass48 = jPanel47.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(jPanel32);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
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
        boolean boolean84 = reportGraph4.isEmpty("hi!", (int) '4', (int) (byte) -1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel42);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(jPanel71);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 10, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph9.isEmpty("hi!", (int) ' ', (int) (byte) 1, "");
        javax.swing.JPanel jPanel15 = reportGraph9.panel;
        reportGraph4.panel = jPanel15;
        java.lang.Class<?> wildcardClass17 = jPanel15.getClass();
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', (int) (byte) 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '4', (int) '#', "hi!");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        boolean boolean55 = reportGraph4.wrongAnalysisType("hi!", 1, 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (byte) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph14.isEmpty("", (int) (byte) 1, (int) '4', "");
        boolean boolean24 = reportGraph14.isEmpty("hi!", 100, 100, "");
        boolean boolean29 = reportGraph14.wrongAnalysisType("", (int) (byte) 100, 1, "");
        javax.swing.JPanel jPanel30 = reportGraph14.panel;
        reportGraph9.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        java.lang.Class<?> wildcardClass33 = jPanel30.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel10 = reportGraph9.panel;
        javax.swing.JPanel jPanel11 = reportGraph9.panel;
        boolean boolean16 = reportGraph9.wrongAnalysisType("", (int) 'a', 100, "");
        javax.swing.JPanel jPanel17 = reportGraph9.panel;
        javax.swing.JPanel jPanel18 = reportGraph9.panel;
        reportGraph4.panel = jPanel18;
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean34 = reportGraph24.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean39 = reportGraph24.isEmpty("", 0, (int) ' ', "");
        boolean boolean44 = reportGraph24.wrongAnalysisType("", (int) (short) 0, (int) ' ', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph49 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean54 = reportGraph49.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean59 = reportGraph49.isEmpty("", 1, (int) (byte) 1, "hi!");
        boolean boolean64 = reportGraph49.isEmpty("", 0, (int) ' ', "");
        statsVisualiser.graph.ReportGraph reportGraph69 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean74 = reportGraph69.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean79 = reportGraph69.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean84 = reportGraph69.isEmpty("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel85 = reportGraph69.panel;
        reportGraph49.panel = jPanel85;
        statsVisualiser.graph.ReportGraph reportGraph91 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) (short) -1, "");
        javax.swing.JPanel jPanel92 = reportGraph91.panel;
        reportGraph49.panel = jPanel92;
        reportGraph24.panel = jPanel92;
        javax.swing.JPanel jPanel95 = reportGraph24.panel;
        reportGraph4.panel = jPanel95;
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
        org.junit.Assert.assertNotNull(jPanel18);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(jPanel85);
        org.junit.Assert.assertNotNull(jPanel92);
        org.junit.Assert.assertNotNull(jPanel95);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        boolean boolean92 = reportGraph4.wrongAnalysisType("hi!", 100, (int) (short) 0, "hi!");
        boolean boolean97 = reportGraph4.wrongAnalysisType("", (int) ' ', (int) (short) 100, "");
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
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (-1), "");
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 1, (int) (short) 0, "");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "");
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
        java.lang.Class<?> wildcardClass40 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel35);
        org.junit.Assert.assertNotNull(jPanel39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 0, 1, "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.isEmpty("hi!", 10, (int) (byte) 100, "");
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.isEmpty("hi!", 100, 10, "");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (int) (short) 0, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass20 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.isEmpty("", 0, (int) (short) 1, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.wrongAnalysisType("hi!", 0, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 100, (int) (byte) -1, "hi!");
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
        boolean boolean55 = reportGraph9.isEmpty("", (int) (short) 10, (int) 'a', "");
        boolean boolean60 = reportGraph9.wrongAnalysisType("hi!", 0, (int) (byte) 10, "hi!");
        javax.swing.JPanel jPanel61 = reportGraph9.panel;
        reportGraph4.panel = jPanel61;
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertNotNull(jPanel47);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(jPanel61);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        boolean boolean63 = reportGraph4.wrongAnalysisType("", (int) (byte) -1, (int) (byte) -1, "");
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (short) 0, (int) (short) -1, "hi!");
        boolean boolean20 = reportGraph4.wrongAnalysisType("hi!", (int) (short) 10, (int) (byte) 0, "");
        javax.swing.JPanel jPanel21 = reportGraph4.panel;
        boolean boolean26 = reportGraph4.isEmpty("hi!", (int) (byte) 1, 100, "hi!");
        boolean boolean31 = reportGraph4.wrongAnalysisType("hi!", 0, 0, "");
        boolean boolean36 = reportGraph4.wrongAnalysisType("", (int) '#', (int) (byte) 0, "");
        javax.swing.JPanel jPanel37 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(jPanel21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(jPanel37);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) '#', (int) (byte) 10, "");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) 100, (int) (short) 10, "hi!");
        boolean boolean14 = reportGraph4.isEmpty("", 0, (int) '4', "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", 10, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) -1, (int) (byte) 10, "hi!");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        java.lang.Class<?> wildcardClass63 = jPanel61.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", 10, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (short) -1, 1, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 0, "hi!");
        boolean boolean19 = reportGraph4.wrongAnalysisType("", (-1), (int) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (int) (byte) 10, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 1, 1, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("", (int) 'a', (int) (short) 10, "hi!");
        boolean boolean24 = reportGraph4.wrongAnalysisType("", (int) (byte) 1, 1, "hi!");
        boolean boolean29 = reportGraph4.isEmpty("hi!", 0, (int) ' ', "hi!");
        java.lang.Class<?> wildcardClass30 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        boolean boolean60 = reportGraph4.isEmpty("hi!", 0, (int) (byte) 0, "");
        javax.swing.JPanel jPanel61 = null;
        reportGraph4.panel = jPanel61;
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
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        javax.swing.JPanel jPanel51 = reportGraph4.panel;
        java.lang.Class<?> wildcardClass52 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(jPanel41);
        org.junit.Assert.assertNotNull(jPanel45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(jPanel51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (byte) 0, "");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        boolean boolean10 = reportGraph4.wrongAnalysisType("", 0, (int) (short) -1, "hi!");
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.wrongAnalysisType("", (int) '4', (int) 'a', "");
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) (byte) -1, (int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '4', 1, "");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 0, (int) (byte) 0, "");
        boolean boolean9 = reportGraph4.isEmpty("", (int) '#', (-1), "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("hi!", 100, 0, "hi!");
        boolean boolean19 = reportGraph4.isEmpty("hi!", 100, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("hi!", (int) (short) 100, 0, "hi!");
        javax.swing.JPanel jPanel16 = reportGraph4.panel;
        javax.swing.JPanel jPanel17 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(jPanel17);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (-1), (-1), "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", 10, (int) (byte) 100, "");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (byte) 10, (int) (short) 10, "hi!");
        javax.swing.JPanel jPanel15 = reportGraph4.panel;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(jPanel15);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", 10, 100, "hi!");
        java.lang.Class<?> wildcardClass5 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (byte) 1, (int) (byte) 0, "hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
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
        boolean boolean57 = reportGraph4.wrongAnalysisType("hi!", 1, (int) (byte) 1, "hi!");
        boolean boolean62 = reportGraph4.wrongAnalysisType("", (int) (byte) 0, 0, "hi!");
        boolean boolean67 = reportGraph4.isEmpty("", (int) (short) 1, (int) (byte) 1, "hi!");
        java.lang.Class<?> wildcardClass68 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(jPanel40);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) 10, (-1), "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", 0, (int) (short) 0, "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        boolean boolean15 = reportGraph4.isEmpty("", (int) (byte) 10, 0, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.isEmpty("", (int) (byte) 1, (int) '4', "");
        javax.swing.JPanel jPanel10 = reportGraph4.panel;
        javax.swing.JPanel jPanel11 = reportGraph4.panel;
        boolean boolean16 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph21 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, 0, "");
        boolean boolean26 = reportGraph21.wrongAnalysisType("", (int) (byte) 100, (int) (short) 100, "hi!");
        javax.swing.JPanel jPanel27 = reportGraph21.panel;
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
        javax.swing.JPanel jPanel88 = reportGraph32.panel;
        reportGraph21.panel = jPanel88;
        reportGraph4.panel = jPanel88;
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(jPanel10);
        org.junit.Assert.assertNotNull(jPanel11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(jPanel27);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(jPanel86);
        org.junit.Assert.assertNotNull(jPanel88);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        statsVisualiser.graph.ReportGraph reportGraph43 = new statsVisualiser.graph.ReportGraph("", (int) (short) 10, (int) '#', "hi!");
        javax.swing.JPanel jPanel44 = reportGraph43.panel;
        reportGraph4.panel = jPanel44;
        java.lang.Class<?> wildcardClass46 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(jPanel44);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
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
        boolean boolean61 = reportGraph4.wrongAnalysisType("", (int) (short) 1, (int) '#', "hi!");
        boolean boolean66 = reportGraph4.wrongAnalysisType("hi!", (int) (byte) 0, (int) (byte) 0, "");
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 1, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", (int) (short) 100, 0, "hi!");
        java.lang.Class<?> wildcardClass10 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) ' ', 10, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph9 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 0, 0, "");
        statsVisualiser.graph.ReportGraph reportGraph14 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 1, (int) '#', "");
        javax.swing.JPanel jPanel15 = reportGraph14.panel;
        javax.swing.JPanel jPanel16 = reportGraph14.panel;
        reportGraph9.panel = jPanel16;
        reportGraph4.panel = jPanel16;
        java.lang.Class<?> wildcardClass19 = jPanel16.getClass();
        org.junit.Assert.assertNotNull(jPanel15);
        org.junit.Assert.assertNotNull(jPanel16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        boolean boolean62 = reportGraph4.isEmpty("", (int) (byte) -1, 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(jPanel20);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(jPanel53);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean9 = reportGraph4.wrongAnalysisType("", 10, (int) (short) -1, "");
        boolean boolean14 = reportGraph4.isEmpty("", 1, (int) (byte) 1, "hi!");
        statsVisualiser.graph.ReportGraph reportGraph19 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        statsVisualiser.graph.ReportGraph reportGraph24 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, (int) '4', "hi!");
        boolean boolean29 = reportGraph24.isEmpty("hi!", (int) '#', 100, "");
        javax.swing.JPanel jPanel30 = reportGraph24.panel;
        reportGraph19.panel = jPanel30;
        reportGraph4.panel = jPanel30;
        boolean boolean37 = reportGraph4.isEmpty("", (int) 'a', 10, "");
        java.lang.Class<?> wildcardClass38 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) '#', (int) (short) 1, "hi!");
        javax.swing.JPanel jPanel5 = reportGraph4.panel;
        org.junit.Assert.assertNotNull(jPanel5);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
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
        statsVisualiser.graph.ReportGraph reportGraph42 = new statsVisualiser.graph.ReportGraph("", (int) (short) 0, 0, "");
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
        reportGraph42.panel = jPanel78;
        reportGraph4.panel = jPanel78;
        java.lang.Class<?> wildcardClass83 = jPanel78.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(jPanel78);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) -1, (int) (short) 100, "");
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        boolean boolean42 = reportGraph4.isEmpty("", (int) '4', (int) (byte) -1, "");
        javax.swing.JPanel jPanel43 = reportGraph4.panel;
        javax.swing.JPanel jPanel44 = null;
        reportGraph4.panel = jPanel44;
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(jPanel43);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("hi!", (int) (short) 100, (int) (short) 100, "hi!");
        boolean boolean9 = reportGraph4.isEmpty("hi!", (int) '#', (int) (byte) 1, "hi!");
        boolean boolean14 = reportGraph4.wrongAnalysisType("", (int) (short) 1, 10, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
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
        statsVisualiser.graph.ReportGraph reportGraph66 = new statsVisualiser.graph.ReportGraph("hi!", (-1), (int) '#', "");
        javax.swing.JPanel jPanel67 = reportGraph66.panel;
        reportGraph4.panel = jPanel67;
        java.lang.Class<?> wildcardClass69 = reportGraph4.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(jPanel30);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(jPanel59);
        org.junit.Assert.assertNotNull(jPanel67);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        statsVisualiser.graph.ReportGraph reportGraph4 = new statsVisualiser.graph.ReportGraph("", (int) (byte) -1, (int) (short) 100, "");
        boolean boolean9 = reportGraph4.wrongAnalysisType("hi!", (int) '#', 100, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        java.lang.Class<?> wildcardClass40 = reportGraph4.getClass();
        org.junit.Assert.assertNotNull(jPanel5);
        org.junit.Assert.assertNotNull(jPanel6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(jPanel22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(jPanel33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }
}

