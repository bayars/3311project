package randoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) 1);
        point2.x = ' ';
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.x = 10;
        point2.y = 52.0d;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (-1.0d);
        point2.x = '#';
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (-1.0f));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 0.0f);
        point2.y = (-1L);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        fetchers.Point point2 = new fetchers.Point((double) '4', 0.0d);
        point2.y = (byte) 1;
        point2.x = 100.0d;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (-1L));
        point2.x = '#';
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = 10.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.y = 100.0d;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        point2.x = 0L;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0;
        double double9 = point2.y;
        point2.x = 52.0d;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 100L;
        point2.y = 32.0d;
        point2.x = (-1L);
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = (byte) 1;
        double double6 = point2.x;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        fetchers.Point point2 = new fetchers.Point(35.0d, (double) 100);
        point2.y = (short) -1;
        point2.x = 35.0d;
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        point2.y = (short) -1;
        double double13 = point2.y;
        double double14 = point2.y;
        point2.x = 0;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1));
        point2.y = (byte) -1;
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (short) 0;
        point2.x = 35.0d;
        double double8 = point2.y;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        double double12 = point2.x;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) (short) 10);
        point2.y = 35.0d;
        point2.y = 10.0f;
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.y = 0.0d;
        point2.y = 1;
        point2.y = (short) 1;
        point2.x = 35.0d;
        point2.y = '#';
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (-1));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (byte) -1);
        point2.y = 0.0d;
        point2.x = (byte) -1;
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = (byte) 10;
        double double9 = point2.x;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (byte) 0;
        point2.y = (byte) 0;
        double double9 = point2.y;
        double double10 = point2.x;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = '#';
        point2.x = 0.0d;
        point2.y = 1.0f;
        point2.y = 35.0d;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 10);
        double double3 = point2.x;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 100.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 'a');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = (short) 100;
        point2.x = 100.0d;
        double double9 = point2.x;
        double double10 = point2.y;
        point2.x = (-1L);
        double double13 = point2.x;
        double double14 = point2.y;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 10.0d);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.y = (short) 0;
        point2.y = (short) 100;
        double double10 = point2.x;
        point2.x = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (short) -1;
        point2.y = 10;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.y = (byte) 100;
        double double13 = point2.y;
        double double14 = point2.y;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        fetchers.Point point2 = new fetchers.Point((double) 1, 97.0d);
        double double3 = point2.y;
        point2.y = 1;
        point2.x = 100.0f;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.x;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '4');
        point2.x = (short) 0;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 52.0d;
        point2.y = 100.0f;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.x = (byte) -1;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.x = 10.0d;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        double double5 = point2.y;
        point2.y = 0.0f;
        double double8 = point2.x;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 100.0d);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 10L);
        point2.y = 'a';
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (short) -1;
        point2.y = 10;
        double double9 = point2.x;
        point2.y = ' ';
        point2.x = 35.0d;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 10);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (-1.0f));
        point2.x = 100.0f;
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.x = (-1L);
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, 0.0d);
        point2.y = (-1.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.y = 1.0f;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.y = 0L;
        point2.x = (byte) 100;
        double double9 = point2.y;
        point2.y = ' ';
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) '#');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.y = 10L;
        point2.x = 100L;
        double double16 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = '#';
        point2.x = 0.0d;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = 1L;
        double double9 = point2.x;
        point2.y = 1.0f;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.x = 100;
        point2.y = (short) 10;
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        double double10 = point2.x;
        double double11 = point2.x;
        double double12 = point2.x;
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.x = (byte) -1;
        point2.y = 35.0d;
        double double17 = point2.y;
        double double18 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 35.0d + "'", double17 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = '#';
        double double5 = point2.x;
        point2.x = (byte) 10;
        point2.y = (short) -1;
        double double10 = point2.y;
        double double11 = point2.x;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, 97.0d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), 10.0d);
        double double3 = point2.x;
        point2.y = (byte) 1;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        double double12 = point2.x;
        double double13 = point2.y;
        point2.x = (short) 1;
        point2.y = (short) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1L;
        point2.y = 10.0f;
        point2.x = (short) 0;
        point2.x = 10L;
        double double13 = point2.y;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) '#');
        point2.x = (short) 1;
        point2.y = 0.0d;
        point2.x = 0.0d;
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (short) -1);
        point2.x = ' ';
        point2.y = (short) 0;
        double double7 = point2.y;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = (byte) 1;
        double double14 = point2.y;
        point2.x = (short) 100;
        java.lang.Class<?> wildcardClass17 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (-1.0f));
        double double3 = point2.y;
        point2.x = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = (byte) 10;
        double double11 = point2.x;
        point2.y = (short) 1;
        double double14 = point2.y;
        point2.x = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 'a');
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        fetchers.Point point2 = new fetchers.Point((double) 'a', 100.0d);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 10;
        double double7 = point2.x;
        double double8 = point2.y;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = (-1.0d);
        double double5 = point2.x;
        double double6 = point2.x;
        point2.y = 32.0d;
        point2.x = (-1.0f);
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        point2.y = (-1);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        point2.x = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.y = (byte) 10;
        point2.x = 32.0d;
        point2.x = 0;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.x;
        point2.x = 0.0d;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0);
        double double3 = point2.x;
        point2.y = ' ';
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.x = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        fetchers.Point point2 = new fetchers.Point((double) 'a', 35.0d);
        point2.x = 10L;
        point2.x = '4';
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = 35.0d;
        point2.y = 32.0d;
        double double7 = point2.x;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        point2.x = (-1.0f);
        point2.x = 10.0f;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        point2.x = 100.0d;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 1;
        point2.x = ' ';
        point2.y = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        double double3 = point2.y;
        point2.x = 97.0d;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        double double11 = point2.y;
        double double12 = point2.x;
        double double13 = point2.y;
        double double14 = point2.y;
        double double15 = point2.x;
        point2.y = 0.0f;
        double double18 = point2.x;
        point2.x = (byte) 10;
        point2.y = (short) 100;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        point2.x = 100L;
        point2.x = 52.0d;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 10L);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.x = 32.0d;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) '#');
        point2.y = 10;
        double double5 = point2.y;
        point2.x = 0;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = (-1L);
        point2.y = 1.0f;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 10);
        double double3 = point2.y;
        point2.x = 32.0d;
        point2.x = (short) 1;
        double double8 = point2.y;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        point2.y = (short) 10;
        point2.y = 10;
        double double7 = point2.x;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (-1.0d));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.x = 100L;
        double double9 = point2.y;
        point2.y = (byte) 1;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) '#');
        point2.x = '#';
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = (byte) -1;
        point2.x = (short) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) 10.0f);
        point2.y = (byte) 10;
        point2.x = (byte) 10;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (byte) -1);
        double double3 = point2.x;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) -1);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) '#');
        point2.y = 0L;
        point2.x = (short) 100;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.x = (short) 100;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) 0);
        point2.y = (-1);
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '4');
        point2.x = 100L;
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.x = 'a';
        point2.x = 0.0d;
        double double13 = point2.x;
        double double14 = point2.x;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 10);
        point2.y = 0.0d;
        point2.x = 100L;
        point2.x = 0.0f;
        point2.x = (short) 0;
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = 'a';
        double double11 = point2.x;
        point2.x = (byte) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        point2.x = 10.0d;
        double double12 = point2.y;
        double double13 = point2.y;
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 1.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 10L;
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.y = (-1);
        point2.y = (-1.0f);
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = ' ';
        point2.y = (short) 0;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        fetchers.Point point2 = new fetchers.Point((double) 10L, 100.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 0.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (byte) 10);
        point2.x = (short) 100;
        point2.y = 100.0f;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.y = (short) 0;
        point2.x = (-1.0f);
        point2.x = 0L;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = 100L;
        point2.y = 0.0d;
        double double13 = point2.x;
        double double14 = point2.y;
        double double15 = point2.y;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 10);
        point2.y = 97.0d;
        point2.x = 10.0d;
        point2.y = 100.0f;
        point2.y = 10.0d;
        double double11 = point2.y;
        point2.y = 100;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = 100L;
        point2.y = 0.0d;
        double double13 = point2.x;
        double double14 = point2.y;
        double double15 = point2.y;
        double double16 = point2.y;
        point2.y = 100.0d;
        point2.x = 0.0d;
        double double21 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, 10.0d);
        point2.y = 100.0d;
        double double5 = point2.y;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 0);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (-1.0f));
        point2.x = 0.0d;
        point2.y = (-1.0d);
        double double7 = point2.y;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }
}

