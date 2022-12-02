package randoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest65 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.Class<?> wildcardClass2 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass7 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass7 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass6 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.country;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass7 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        int int5 = eraseGraph1.yearStart;
        int int6 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        int int8 = eraseGraph1.yearEnd;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass6 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = 0;
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.graphType;
        java.lang.String str6 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (short) 0;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.graphType = "";
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (-1);
        int int10 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = (short) 0;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.Class<?> wildcardClass6 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        int int7 = eraseGraph1.yearStart;
        java.lang.String str8 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.yearEnd = 0;
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.yearStart = 35;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.yearStart = 'a';
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass5 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.yearEnd = 10;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 10;
        int int9 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "hi!";
        int int6 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.Class<?> wildcardClass17 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        int int13 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass7 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "";
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.analysis = "";
        int int8 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        java.lang.String str8 = eraseGraph1.country;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 10;
        int int9 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass17 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str10 = eraseGraph1.country;
        java.lang.String str11 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (-1);
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "";
        int int16 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass5 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = ' ';
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearStart = (short) 10;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        int int16 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "";
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearEnd;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.analysis = "hi!";
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "hi!";
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        int int8 = eraseGraph1.yearStart;
        java.lang.String str9 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearStart = 'a';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass17 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        int int5 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = (-1);
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearStart = 'a';
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 100;
        int int8 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 1;
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 100;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.analysis;
        java.lang.String str3 = eraseGraph1.country;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass5 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        java.lang.String str10 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        java.lang.Class<?> wildcardClass7 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 1;
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        java.lang.String str11 = eraseGraph1.country;
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.country = "hi!";
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "";
        java.lang.String str10 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = '4';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        int int7 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = '4';
        java.lang.String str12 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        java.lang.String str12 = eraseGraph1.graphType;
        int int13 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        java.lang.String str15 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        int int2 = eraseGraph1.yearEnd;
        java.lang.String str3 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = (-1);
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "";
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.country = "";
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = (short) -1;
        java.lang.String str15 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 52;
        eraseGraph1.yearStart = (short) 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.yearEnd = (short) -1;
        eraseGraph1.graphType = "";
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearStart = 35;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        int int7 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str14 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.graphType = "";
        java.lang.String str6 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "hi!";
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 35;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.graphType;
        int int16 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        java.lang.String str11 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.analysis = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.country = "";
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        int int16 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        int int19 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str18 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass19 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass6 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearEnd = 'a';
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        int int14 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        int int7 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.graphType = "";
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.analysis = "";
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearStart = '#';
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.yearStart = (short) 0;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 'a';
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 10;
        java.lang.String str15 = eraseGraph1.graphType;
        int int16 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "";
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.yearStart = (byte) -1;
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str18 = eraseGraph1.country;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.graphType = "";
        java.lang.String str11 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 100;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.yearStart = (short) -1;
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.country = "";
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (byte) 1;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = '#';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        eraseGraph1.graphType = "hi!";
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.country;
        java.lang.String str3 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "";
        java.lang.String str10 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        int int13 = eraseGraph1.yearStart;
        java.lang.String str14 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        java.lang.String str14 = eraseGraph1.country;
        java.lang.String str15 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 0;
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.String str11 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 'a';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        int int2 = eraseGraph1.yearEnd;
        java.lang.String str3 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass4 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = '4';
        eraseGraph1.country = "";
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.country;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        eraseGraph1.country = "";
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str18 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str10 = eraseGraph1.country;
        java.lang.String str11 = eraseGraph1.analysis;
        java.lang.String str12 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.graphType = "";
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        int int9 = eraseGraph1.yearEnd;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.graphType = "";
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.analysis;
        int int8 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "";
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 100;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.analysis = "hi!";
        int int4 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass5 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        int int17 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        int int10 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 52;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = '#';
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.analysis;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.country;
        int int12 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 10;
        java.lang.String str15 = eraseGraph1.graphType;
        int int16 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = 100;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = (short) -1;
        eraseGraph1.yearEnd = 'a';
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearStart = (short) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = (short) 0;
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.yearStart = 1;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str15 = eraseGraph1.country;
        java.lang.String str16 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.String str11 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 100;
        java.lang.String str12 = eraseGraph1.graphType;
        int int13 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "hi!";
        int int12 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        java.lang.String str11 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        int int7 = eraseGraph1.yearStart;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.yearStart = (short) -1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.graphType;
        int int9 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.analysis;
        int int6 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        int int14 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (-1);
        eraseGraph1.yearStart = '#';
        java.lang.String str16 = eraseGraph1.country;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        int int8 = eraseGraph1.yearEnd;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (byte) 10;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        java.lang.String str12 = eraseGraph1.graphType;
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.String str11 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.graphType = "";
        int int8 = eraseGraph1.yearStart;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "";
        int int8 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 0;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 1;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 35;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "";
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = '#';
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        java.lang.String str12 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = 'a';
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        java.lang.String str14 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass15 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.analysis;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (short) 10;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        int int2 = eraseGraph1.yearEnd;
        java.lang.String str3 = eraseGraph1.graphType;
        int int4 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.graphType;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearStart = (short) 10;
        eraseGraph1.yearStart = (byte) 0;
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearEnd = 35;
        eraseGraph1.graphType = "hi!";
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        int int9 = eraseGraph1.yearEnd;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (-1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (byte) 0;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.Class<?> wildcardClass4 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        int int12 = eraseGraph1.yearEnd;
        java.lang.String str13 = eraseGraph1.country;
        java.lang.String str14 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.country = "";
        java.lang.String str12 = eraseGraph1.graphType;
        int int13 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        int int6 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        int int17 = eraseGraph1.yearEnd;
        java.lang.String str18 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        eraseGraph1.country = "hi!";
        java.lang.String str14 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        int int16 = eraseGraph1.yearEnd;
        int int17 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearEnd = 0;
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        java.lang.String str7 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (byte) 1;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (-1);
        eraseGraph1.yearStart = '#';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 0;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (short) 1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 0;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        java.lang.String str12 = eraseGraph1.country;
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearEnd = 35;
        eraseGraph1.country = "hi!";
        java.lang.String str13 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "";
        java.lang.String str12 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearStart = (short) -1;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.String str14 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearEnd = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.yearStart = (-1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.analysis;
        int int8 = eraseGraph1.yearEnd;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        java.lang.String str17 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        java.lang.String str20 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 100;
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        java.lang.Class<?> wildcardClass4 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        int int15 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass16 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) -1;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 100;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.analysis;
        int int11 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        int int9 = eraseGraph1.yearEnd;
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        int int13 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        java.lang.Class<?> wildcardClass7 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (byte) 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.analysis;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        eraseGraph1.country = "";
        java.lang.String str15 = eraseGraph1.country;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        int int11 = eraseGraph1.yearStart;
        java.lang.String str12 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass13 = eraseGraph1.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.yearEnd = 0;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.country;
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        int int7 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = (byte) 10;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "hi!";
        java.lang.String str15 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        int int11 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.Class<?> wildcardClass16 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (byte) 0;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 1;
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (-1);
        eraseGraph1.yearStart = 52;
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "";
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        java.lang.String str7 = eraseGraph1.analysis;
        int int8 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = 35;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        java.lang.String str7 = eraseGraph1.country;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        int int11 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (byte) 10;
        int int9 = eraseGraph1.yearStart;
        java.lang.String str10 = eraseGraph1.analysis;
        int int11 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 1;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 52;
        eraseGraph1.yearStart = (short) 10;
        eraseGraph1.yearStart = (byte) 1;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.yearEnd = (short) -1;
        eraseGraph1.yearStart = '4';
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.Class<?> wildcardClass4 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.graphType = "hi!";
        java.lang.String str8 = eraseGraph1.country;
        eraseGraph1.yearStart = '4';
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.yearEnd = '#';
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 10;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 1;
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.Class<?> wildcardClass11 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = (byte) 100;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 100;
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "hi!";
        java.lang.Class<?> wildcardClass18 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.yearStart = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        int int16 = eraseGraph1.yearEnd;
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        int int18 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        int int12 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        java.lang.String str16 = eraseGraph1.analysis;
        java.lang.String str17 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 100;
        int int20 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        java.lang.String str8 = eraseGraph1.graphType;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.country;
        eraseGraph1.yearStart = '#';
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 100;
        java.lang.String str12 = eraseGraph1.graphType;
        java.lang.String str13 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        java.lang.String str10 = eraseGraph1.analysis;
        java.lang.String str11 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 0;
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str13 = eraseGraph1.analysis;
        java.lang.String str14 = eraseGraph1.country;
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearStart = 35;
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (-1);
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = '4';
        eraseGraph1.country = "";
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 32;
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        java.lang.String str6 = eraseGraph1.analysis;
        int int7 = eraseGraph1.yearStart;
        int int8 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        java.lang.String str10 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (byte) 1;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 1;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.graphType;
        int int10 = eraseGraph1.yearStart;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (byte) 0;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        int int8 = eraseGraph1.yearEnd;
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        int int9 = eraseGraph1.yearEnd;
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        int int6 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearStart = 1;
        java.lang.String str13 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.graphType = "hi!";
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "";
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = (byte) -1;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearStart = (short) 1;
        eraseGraph1.graphType = "";
        eraseGraph1.graphType = "";
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        java.lang.String str12 = eraseGraph1.graphType;
        eraseGraph1.graphType = "";
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        java.lang.String str9 = eraseGraph1.graphType;
        java.lang.String str10 = eraseGraph1.graphType;
        int int11 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 100;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearStart = 10;
        eraseGraph1.yearStart = 97;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.analysis = "";
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearEnd = 35;
        java.lang.String str15 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) 1;
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        int int2 = eraseGraph1.yearEnd;
        int int3 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        java.lang.String str11 = eraseGraph1.graphType;
        eraseGraph1.yearStart = (short) 0;
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        java.lang.String str9 = eraseGraph1.analysis;
        java.lang.Class<?> wildcardClass10 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        java.lang.String str2 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = 'a';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        eraseGraph1.yearStart = ' ';
        eraseGraph1.analysis = "";
        java.lang.String str14 = eraseGraph1.country;
        int int15 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) 1;
        eraseGraph1.graphType = "";
        java.lang.String str13 = eraseGraph1.country;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str7 = eraseGraph1.graphType;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.country = "";
        eraseGraph1.country = "hi!";
        java.lang.String str13 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.country = "";
        eraseGraph1.yearStart = (byte) 0;
        eraseGraph1.country = "";
        int int14 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str15 = eraseGraph1.analysis;
        int int16 = eraseGraph1.yearEnd;
        java.lang.String str17 = eraseGraph1.country;
        java.lang.String str18 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        java.lang.String str4 = eraseGraph1.analysis;
        int int5 = eraseGraph1.yearEnd;
        eraseGraph1.analysis = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        java.lang.String str7 = eraseGraph1.country;
        java.lang.String str8 = eraseGraph1.analysis;
        int int9 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.country = "hi!";
        int int14 = eraseGraph1.yearStart;
        java.lang.String str15 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 0;
        eraseGraph1.analysis = "hi!";
        java.lang.Class<?> wildcardClass17 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.yearStart = '4';
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.graphType;
        java.lang.String str7 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 1;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = '4';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = (byte) 100;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        eraseGraph1.country = "";
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearStart = 100;
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearStart;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        eraseGraph1.yearEnd = '#';
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearEnd;
        java.lang.String str8 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.country;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.analysis;
        java.lang.String str5 = eraseGraph1.analysis;
        java.lang.String str6 = eraseGraph1.analysis;
        java.lang.String str7 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) 10;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        java.lang.String str8 = eraseGraph1.graphType;
        eraseGraph1.country = "";
        int int11 = eraseGraph1.yearEnd;
        java.lang.String str12 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) 100;
        eraseGraph1.country = "";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        java.lang.String str8 = eraseGraph1.analysis;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "";
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.analysis = "hi!";
        int int4 = eraseGraph1.yearStart;
        java.lang.String str5 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        java.lang.String str9 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        java.lang.String str12 = eraseGraph1.graphType;
        int int13 = eraseGraph1.yearEnd;
        java.lang.String str14 = eraseGraph1.graphType;
        int int15 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = 'a';
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearEnd = 0;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.country = "hi!";
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = (byte) 100;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        java.lang.Class<?> wildcardClass18 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        java.lang.String str6 = eraseGraph1.country;
        int int7 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (short) -1;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.analysis;
        eraseGraph1.graphType = "";
        int int10 = eraseGraph1.yearStart;
        int int11 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        eraseGraph1.graphType = "";
        java.lang.String str11 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.country = "";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.yearStart = 'a';
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) 1;
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.country;
        java.lang.String str6 = eraseGraph1.country;
        java.lang.String str7 = eraseGraph1.analysis;
        java.lang.String str8 = eraseGraph1.graphType;
        java.lang.String str9 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        eraseGraph1.graphType = "hi!";
        java.lang.String str10 = eraseGraph1.country;
        eraseGraph1.yearEnd = (short) 100;
        int int13 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass14 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (byte) 100;
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.analysis;
        int int6 = eraseGraph1.yearStart;
        int int7 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearStart = (-1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        int int6 = eraseGraph1.yearStart;
        java.lang.String str7 = eraseGraph1.country;
        int int8 = eraseGraph1.yearStart;
        int int9 = eraseGraph1.yearStart;
        java.lang.String str10 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        int int4 = eraseGraph1.yearEnd;
        java.lang.String str5 = eraseGraph1.analysis;
        int int6 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.graphType = "";
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.yearEnd = 0;
        java.lang.String str13 = eraseGraph1.graphType;
        int int14 = eraseGraph1.yearEnd;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearStart;
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (byte) 1;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.country = "hi!";
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        int int5 = eraseGraph1.yearStart;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.country = "";
        java.lang.String str10 = eraseGraph1.analysis;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.yearEnd = (short) 0;
        java.lang.String str10 = eraseGraph1.graphType;
        eraseGraph1.analysis = "";
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        int int16 = eraseGraph1.yearStart;
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.country = "hi!";
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = 0;
        eraseGraph1.country = "";
        java.lang.String str10 = eraseGraph1.graphType;
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        eraseGraph1.yearStart = (short) 0;
        eraseGraph1.yearStart = 0;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = (byte) 10;
        eraseGraph1.yearStart = (short) 100;
        eraseGraph1.country = "";
        int int10 = eraseGraph1.yearStart;
        java.lang.String str11 = eraseGraph1.graphType;
        java.lang.Class<?> wildcardClass12 = eraseGraph1.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        int int4 = eraseGraph1.yearStart;
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 100;
        java.lang.String str9 = eraseGraph1.country;
        eraseGraph1.graphType = "";
        eraseGraph1.country = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        java.lang.String str4 = eraseGraph1.analysis;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.graphType = "hi!";
        java.lang.String str9 = eraseGraph1.analysis;
        eraseGraph1.yearEnd = ' ';
        eraseGraph1.country = "hi!";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.yearStart = (byte) 10;
        int int8 = eraseGraph1.yearEnd;
        java.lang.String str9 = eraseGraph1.graphType;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        java.lang.String str4 = eraseGraph1.country;
        java.lang.String str5 = eraseGraph1.graphType;
        int int6 = eraseGraph1.yearEnd;
        java.lang.String str7 = eraseGraph1.graphType;
        int int8 = eraseGraph1.yearStart;
        java.lang.Class<?> wildcardClass9 = eraseGraph1.getClass();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = 100;
        eraseGraph1.yearStart = 'a';
        java.lang.String str6 = eraseGraph1.country;
        eraseGraph1.yearStart = (-1);
        int int9 = eraseGraph1.yearStart;
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearEnd = (byte) 1;
        java.lang.String str12 = eraseGraph1.country;
        eraseGraph1.yearEnd = (byte) -1;
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.analysis = "";
        eraseGraph1.analysis = "hi!";
        eraseGraph1.analysis = "hi!";
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        java.lang.String str4 = eraseGraph1.graphType;
        eraseGraph1.analysis = "hi!";
        eraseGraph1.country = "hi!";
        int int9 = eraseGraph1.yearStart;
        int int10 = eraseGraph1.yearEnd;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.graphType = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.yearEnd = (byte) 0;
        java.lang.Class<?> wildcardClass8 = eraseGraph1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = '#';
        eraseGraph1.analysis = "";
        eraseGraph1.yearEnd = (short) 1;
        eraseGraph1.country = "";
        eraseGraph1.graphType = "";
        eraseGraph1.yearStart = 'a';
        eraseGraph1.country = "";
        eraseGraph1.yearStart = 10;
        eraseGraph1.country = "hi!";
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.graphType = "hi!";
        eraseGraph1.yearStart = 52;
        java.lang.String str12 = eraseGraph1.graphType;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = '4';
        eraseGraph1.yearStart = (byte) 1;
        java.lang.String str6 = eraseGraph1.analysis;
        eraseGraph1.yearStart = (short) -1;
        eraseGraph1.yearEnd = 35;
        eraseGraph1.country = "hi!";
        java.lang.String str13 = eraseGraph1.country;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        statsVisualiser.gui.Main main0 = null;
        statsVisualiser.command.EraseGraph eraseGraph1 = new statsVisualiser.command.EraseGraph(main0);
        eraseGraph1.yearEnd = (byte) -1;
        eraseGraph1.yearEnd = 1;
        eraseGraph1.yearEnd = (short) 10;
        eraseGraph1.yearEnd = (byte) 0;
        eraseGraph1.yearStart = 'a';
        eraseGraph1.yearStart = 100;
        eraseGraph1.graphType = "";
        int int16 = eraseGraph1.yearEnd;
        // The following exception was thrown during execution in test generation
        try {
            eraseGraph1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"panelCenter\" because \"this.ui\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}

