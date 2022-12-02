package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (-1L));
        double double3 = point2.x;
        point2.y = 35.0d;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 1.0d);
        double double3 = point2.x;
        point2.x = 97.0d;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 10;
        double double9 = point2.x;
        point2.x = 100L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (byte) -1);
        double double3 = point2.y;
        point2.y = (-1.0f);
        point2.y = (byte) 1;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 100;
        double double10 = point2.y;
        point2.x = 97.0d;
        double double13 = point2.x;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 35.0d;
        point2.y = 10L;
        point2.y = 10L;
        point2.x = (short) 10;
        point2.x = (byte) -1;
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 10.0d);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1L));
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        fetchers.Point point2 = new fetchers.Point((double) 1, 10.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, 0.0d);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        fetchers.Point point2 = new fetchers.Point(32.0d, (-1.0d));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) '#');
        point2.y = 10;
        double double5 = point2.y;
        point2.x = 0;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (-1));
        point2.y = 1;
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 10L);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = 10L;
        double double7 = point2.x;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.y;
        double double13 = point2.x;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (-1.0d));
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        fetchers.Point point2 = new fetchers.Point(10.0d, 1.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        double double10 = point2.y;
        point2.y = (short) 0;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        point2.x = 0L;
        point2.x = (byte) 0;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '4');
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '#');
        point2.y = 100.0d;
        point2.x = '4';
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = (byte) 0;
        point2.x = (-1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        fetchers.Point point2 = new fetchers.Point((double) 1, 97.0d);
        double double3 = point2.y;
        point2.y = 1;
        point2.x = 100.0f;
        double double8 = point2.x;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.x = (-1.0d);
        point2.x = 97.0d;
        point2.x = (byte) 1;
        point2.y = 0;
        point2.y = 10.0f;
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) 100);
        point2.x = '4';
        point2.x = (byte) 1;
        point2.y = 10.0d;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 'a');
        point2.x = 52.0d;
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 97.0d;
        point2.x = 0.0f;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.y = 35.0d;
        point2.y = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 100.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (-1L);
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        point2.y = 0.0d;
        double double7 = point2.y;
        point2.y = 10L;
        point2.x = (short) -1;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        point2.x = (byte) 1;
        point2.y = 100.0d;
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 0L);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (-1.0f));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.x;
        point2.x = (short) 0;
        point2.x = 10L;
        point2.x = (short) 1;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        fetchers.Point point2 = new fetchers.Point(97.0d, 0.0d);
        point2.y = (-1.0d);
        point2.x = ' ';
        point2.x = 0L;
        double double9 = point2.y;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) 1);
        double double3 = point2.x;
        point2.y = (short) 0;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.x = (byte) -1;
        point2.x = 10;
        point2.x = (-1.0d);
        point2.x = 0L;
        point2.x = 100.0f;
        point2.x = (byte) 10;
        point2.x = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = 1L;
        point2.y = ' ';
        point2.x = 1L;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        point2.x = 10;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.y;
        point2.y = 100.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.x = 0.0f;
        point2.x = '4';
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        point2.y = 32.0d;
        point2.y = 0.0f;
        point2.y = 10L;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (short) -1);
        point2.x = (byte) 1;
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = (short) 100;
        double double11 = point2.y;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) '4');
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.y = 10L;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = '4';
        point2.x = (-1L);
        point2.y = 52.0d;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.x = 'a';
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.y = 52.0d;
        point2.y = (byte) -1;
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) '#');
        point2.y = (short) 100;
        point2.y = (short) 1;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = (-1.0d);
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        point2.x = 0L;
        point2.y = 0L;
        point2.x = (-1L);
        double double9 = point2.y;
        double double10 = point2.x;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = 100.0f;
        point2.y = 0;
        point2.x = (short) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        point2.x = 0.0f;
        point2.x = 97.0d;
        double double13 = point2.y;
        double double14 = point2.y;
        double double15 = point2.y;
        point2.x = (short) 0;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        point2.x = 0;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 10.0d;
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.y = 0.0d;
        double double12 = point2.x;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        double double9 = point2.y;
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 100.0f);
        point2.x = 0.0d;
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) '#');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.x;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 100.0d);
        double double3 = point2.x;
        point2.y = (byte) -1;
        double double6 = point2.x;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) '4');
        point2.x = 1L;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = '4';
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1.0f));
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        point2.y = (short) 100;
        double double17 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = 1L;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = (-1L);
        point2.y = 35.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 1.0f);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0.0f);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        double double7 = point2.y;
        point2.y = (byte) 10;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 100.0f;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        point2.x = (short) -1;
        point2.x = 10;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        fetchers.Point point2 = new fetchers.Point((double) 1L, 1.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = (short) 100;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 1L);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 10);
        point2.x = 0.0d;
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 0.0d);
        point2.x = (byte) 1;
        point2.y = 0;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (-1.0f));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.x = 100.0f;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 52.0d;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (-1L));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 100.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        fetchers.Point point2 = new fetchers.Point((double) '4', 10.0d);
        point2.y = (byte) 10;
        point2.x = 10L;
        point2.y = ' ';
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.y = 1;
        point2.y = 100.0f;
        point2.x = 1.0d;
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) 1);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 100);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) 1);
        double double3 = point2.y;
        point2.y = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 0;
        point2.y = 35.0d;
        double double11 = point2.y;
        point2.x = 10.0f;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        fetchers.Point point2 = new fetchers.Point(97.0d, 0.0d);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 100.0f);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        point2.y = ' ';
        point2.y = 100L;
        point2.y = 0.0d;
        point2.x = 0.0d;
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        point2.y = '4';
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (-1.0f));
        point2.x = (-1.0d);
        point2.y = 'a';
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 1L);
        point2.y = (-1);
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        point2.y = ' ';
        point2.y = '4';
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.y;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.y = (short) 10;
        point2.y = (byte) 0;
        point2.x = (-1L);
        double double18 = point2.x;
        double double19 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = (byte) 1;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.y = 100.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.x = (short) -1;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.y = 10;
        double double13 = point2.x;
        point2.x = (short) 10;
        double double16 = point2.y;
        double double17 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 35.0d);
        point2.x = 10;
        point2.x = '4';
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.y = 0.0d;
        point2.y = 0.0d;
        point2.x = 1.0f;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = 100.0f;
        point2.y = 0;
        point2.x = 10.0d;
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        point2.x = 10;
        double double7 = point2.y;
        point2.x = (byte) -1;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 97.0d;
        point2.x = 0.0f;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 10.0f);
        point2.y = 1.0f;
        double double5 = point2.x;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        fetchers.Point point2 = new fetchers.Point((double) (-1), 10.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        double double7 = point2.y;
        point2.y = (short) 100;
        point2.x = 0.0d;
        double double12 = point2.y;
        point2.x = 0L;
        point2.y = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (short) 10);
        point2.x = 0.0d;
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        fetchers.Point point2 = new fetchers.Point((double) '#', 32.0d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (short) -1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 10L);
        point2.x = 1L;
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 100.0f;
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) 100);
        point2.x = '4';
        point2.x = (byte) 1;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 1);
        point2.x = (byte) 10;
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        double double9 = point2.y;
        double double10 = point2.x;
        double double11 = point2.y;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 1.0d);
        double double3 = point2.x;
        point2.y = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        point2.x = 0.0f;
        double double5 = point2.x;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        point2.x = 10L;
        point2.x = (-1L);
        double double14 = point2.y;
        double double15 = point2.x;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        double double3 = point2.x;
        point2.x = 100;
        point2.x = 1;
        point2.x = 32.0d;
        point2.x = 0L;
        point2.x = (short) 10;
        point2.x = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (byte) -1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = '#';
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.x = 0L;
        point2.y = 32.0d;
        double double16 = point2.y;
        double double17 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        point2.x = 100.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = (byte) 1;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (byte) 10);
        point2.x = (short) 100;
        double double5 = point2.y;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 0.0f;
        point2.x = (short) 1;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, 52.0d);
        double double3 = point2.y;
        point2.y = 97.0d;
        point2.y = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        point2.x = 0.0f;
        double double8 = point2.y;
        point2.x = (byte) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) 1);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.y;
        double double13 = point2.x;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 100.0f);
        point2.y = 35.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = 100;
        double double11 = point2.y;
        point2.y = 0L;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (-1.0d));
        point2.y = 1;
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.x;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        fetchers.Point point2 = new fetchers.Point((double) 0, 32.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0L);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) (byte) -1);
        point2.y = 0.0d;
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0f;
        point2.x = 100L;
        point2.x = 10.0d;
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = (-1L);
        point2.y = 35.0d;
        point2.y = (byte) -1;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) ' ');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 100;
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.x = (byte) 0;
        point2.y = (byte) 100;
        double double12 = point2.y;
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (-1));
        double double3 = point2.x;
        point2.y = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 10);
        point2.y = 1.0f;
        point2.y = (-1L);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 35.0d;
        double double13 = point2.x;
        point2.x = 0.0f;
        point2.y = 0L;
        double double18 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        point2.x = 100.0d;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 0.0d);
        point2.y = 0.0d;
        point2.x = 1.0d;
        double double7 = point2.x;
        point2.x = 10.0d;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) (byte) -1);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 100.0f);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) -1;
        double double10 = point2.y;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) '4');
        point2.y = (short) 0;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 52.0d;
        double double10 = point2.y;
        point2.x = (-1L);
        point2.x = ' ';
        point2.x = 0.0d;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = 0.0f;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, 0.0d);
        point2.y = 0.0d;
        point2.y = 97.0d;
        point2.y = (-1);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.x = 0.0f;
        point2.y = 100;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = 'a';
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        point2.x = 1;
        point2.y = (byte) 10;
        point2.y = 0L;
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = 100;
        point2.y = 0.0f;
        double double13 = point2.x;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.y = 10L;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 0L);
        point2.x = (byte) 0;
        double double5 = point2.y;
        point2.y = 100L;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 10);
        point2.y = 10L;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        point2.x = 1.0f;
        point2.x = (short) 0;
        point2.y = 97.0d;
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 0;
        point2.y = 35.0d;
        double double11 = point2.y;
        point2.x = 10.0f;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) '4');
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (byte) 0;
        double double9 = point2.x;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = 0.0f;
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 52.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        fetchers.Point point2 = new fetchers.Point(10.0d, 0.0d);
        point2.y = 35.0d;
        point2.y = 1;
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.x;
        point2.y = '#';
        double double8 = point2.x;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 32.0d;
        point2.y = 0;
        point2.y = (short) 0;
        point2.y = '#';
        point2.x = 'a';
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) 1.0f);
        point2.y = (short) 0;
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.y = 10;
        double double13 = point2.y;
        point2.x = (-1.0f);
        double double16 = point2.x;
        double double17 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) ' ');
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 0);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.y = 0.0d;
        point2.y = 0.0d;
        point2.x = 1.0f;
        double double16 = point2.y;
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1));
        point2.y = 1.0d;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        point2.x = (byte) 1;
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (short) -1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 0L);
        point2.y = 10L;
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (-1));
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = 1.0f;
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.y;
        point2.x = '4';
        double double15 = point2.x;
        double double16 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (short) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.y = 1;
        double double14 = point2.x;
        point2.y = 'a';
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        double double3 = point2.x;
        point2.x = 0.0d;
        point2.y = (short) 1;
        point2.y = (-1L);
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        point2.x = 100.0d;
        point2.y = 0.0d;
        point2.x = 32.0d;
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = (-1);
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = (byte) 10;
        double double7 = point2.y;
        point2.x = ' ';
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.y = (-1L);
        point2.y = 10.0d;
        point2.x = 52.0d;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10L);
        point2.y = (-1);
        point2.x = '#';
        point2.y = (byte) -1;
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = 10L;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.y = 35.0d;
        double double12 = point2.y;
        point2.y = (byte) 1;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1.0f);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 52.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        point2.x = 100.0d;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 1);
        double double3 = point2.x;
        point2.x = 10.0f;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (byte) -1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 10L);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 1.0f);
        double double3 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 52.0d);
        point2.y = 100.0f;
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        double double12 = point2.y;
        point2.y = (byte) 0;
        double double15 = point2.x;
        point2.y = 100.0f;
        point2.x = 1.0d;
        double double20 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.y = 1.0d;
        point2.y = 0;
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 10L);
        point2.x = 100.0d;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.x = 35.0d;
        point2.y = 10.0f;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 0);
        point2.y = '4';
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.x;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 1);
        point2.x = 10;
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 100);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (-1L));
        double double3 = point2.x;
        point2.x = 10L;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        point2.x = 1.0f;
        double double5 = point2.x;
        point2.y = 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 97.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.x;
        point2.y = '4';
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = (byte) -1;
        point2.y = 0.0d;
        double double7 = point2.y;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        double double3 = point2.x;
        point2.y = (short) -1;
        point2.y = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        point2.y = (short) 100;
        double double8 = point2.y;
        double double9 = point2.y;
        point2.x = (-1.0f);
        double double12 = point2.x;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        point2.x = 100;
        point2.x = ' ';
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.y = 10;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.y = 0L;
        point2.x = (byte) 100;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 100.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (-1.0d));
        double double3 = point2.x;
        point2.x = 'a';
        double double6 = point2.x;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        double double5 = point2.y;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = 1.0d;
        point2.y = (byte) 0;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        point2.y = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 0L);
        point2.x = (byte) 0;
        double double5 = point2.y;
        point2.y = 100L;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        fetchers.Point point2 = new fetchers.Point((double) 1, 97.0d);
        double double3 = point2.y;
        point2.y = 1;
        point2.x = '#';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = '#';
        double double14 = point2.x;
        double double15 = point2.y;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 1;
        point2.x = ' ';
        point2.y = 0.0d;
        double double14 = point2.y;
        double double15 = point2.y;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.y = '#';
        point2.x = 100.0f;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        fetchers.Point point2 = new fetchers.Point(0.0d, (-1.0d));
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 10);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.y;
        double double13 = point2.x;
        double double14 = point2.y;
        point2.x = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.y = (short) 0;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 10L);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) 1);
        double double3 = point2.x;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.y;
        point2.x = 1.0d;
        point2.y = 1.0f;
        point2.x = 100.0f;
        double double14 = point2.x;
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 1;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = (short) -1;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (short) 100);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (short) 0;
        point2.x = 35.0d;
        double double8 = point2.y;
        point2.x = 1L;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        point2.x = '#';
        double double5 = point2.x;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) -1;
        point2.x = 35.0d;
        double double12 = point2.x;
        point2.y = 10.0f;
        double double15 = point2.y;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = (short) 100;
        point2.x = 100.0d;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.y = (byte) -1;
        point2.x = (short) -1;
        point2.x = (short) 1;
        double double18 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, 0.0d);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) 'a');
        point2.x = (byte) -1;
        point2.x = 10L;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        point2.x = 97.0d;
        point2.x = 35.0d;
        double double19 = point2.y;
        double double20 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) -1);
        point2.y = ' ';
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        point2.x = (byte) 0;
        point2.y = 100L;
        double double16 = point2.y;
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) ' ');
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0.0d;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.x = 0.0d;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) 0);
        double double3 = point2.x;
        point2.y = (byte) -1;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = (byte) -1;
        point2.y = 100;
        point2.y = '4';
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        fetchers.Point point2 = new fetchers.Point(0.0d, (-1.0d));
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (short) 0;
        point2.y = 0;
        double double8 = point2.y;
        point2.x = (byte) 10;
        point2.x = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.x = (byte) 0;
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        double double3 = point2.x;
        point2.x = (-1.0d);
        point2.x = 1;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        double double16 = point2.x;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.x = '4';
        point2.y = (-1.0d);
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (-1L));
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 10.0f);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 100L);
        point2.y = 0;
        point2.y = 10.0f;
        double double7 = point2.y;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = 100.0f;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) ' ');
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.y;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.y = (short) 10;
        point2.y = 10.0d;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        double double5 = point2.x;
        point2.y = (short) 0;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        fetchers.Point point2 = new fetchers.Point(0.0d, 0.0d);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        point2.x = (-1.0f);
        point2.y = (-1L);
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (byte) -1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = (short) 1;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 10.0d);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        double double10 = point2.x;
        point2.y = 52.0d;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        point2.y = (byte) 1;
        point2.y = '4';
        point2.y = (short) 0;
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        fetchers.Point point2 = new fetchers.Point(97.0d, 0.0d);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (short) 10);
        point2.y = (-1L);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        point2.y = 0.0d;
        point2.x = 52.0d;
        point2.x = 100L;
        double double11 = point2.x;
        double double12 = point2.y;
        double double13 = point2.y;
        point2.y = (-1.0f);
        double double16 = point2.x;
        double double17 = point2.x;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 1.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 100L);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        fetchers.Point point2 = new fetchers.Point((double) 100, 35.0d);
        point2.y = (byte) 10;
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 100);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 100);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 10;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (-1.0d));
        double double3 = point2.x;
        point2.x = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = 1L;
        point2.y = ' ';
        point2.y = 1L;
        point2.x = 1L;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (byte) 0;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (-1));
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (-1.0d);
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) -1);
        point2.x = 1;
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) 1);
        double double3 = point2.x;
        point2.y = 32.0d;
        double double6 = point2.y;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) '#');
        point2.x = '#';
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        double double10 = point2.y;
        point2.y = 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) ' ');
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = (byte) 1;
        double double5 = point2.y;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) '#');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        point2.y = (byte) -1;
        point2.x = 100;
        point2.x = (short) 1;
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        point2.x = (short) 1;
        double double6 = point2.x;
        point2.x = (byte) 1;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '#');
        double double3 = point2.y;
        point2.x = (-1.0d);
        point2.x = 10;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        double double3 = point2.y;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        fetchers.Point point2 = new fetchers.Point(35.0d, (double) (short) 0);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0.0f);
        point2.x = (byte) -1;
        double double5 = point2.y;
        point2.y = 0L;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (byte) -1);
        point2.y = 0.0d;
        point2.y = (-1.0f);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0f;
        point2.x = 100L;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        fetchers.Point point2 = new fetchers.Point(100.0d, 35.0d);
        point2.y = 0.0f;
        point2.x = 0.0f;
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        point2.x = 10;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 0.0f);
        point2.y = (-1.0f);
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) 100;
        point2.y = 10;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 100L);
        point2.y = 10;
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        double double12 = point2.y;
        point2.y = (byte) 0;
        double double15 = point2.x;
        point2.y = 100.0f;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        point2.y = 0.0d;
        point2.y = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 0.0d);
        point2.y = 0.0d;
        point2.x = 1.0d;
        double double7 = point2.x;
        point2.x = 10.0d;
        point2.y = (short) 1;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1L;
        point2.y = 10.0f;
        point2.x = (short) 0;
        point2.x = 10L;
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        point2.x = 1;
        point2.y = (byte) 10;
        point2.y = 0L;
        double double13 = point2.x;
        point2.y = (-1L);
        double double16 = point2.x;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.y = 100.0f;
        double double10 = point2.x;
        point2.x = '#';
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        fetchers.Point point2 = new fetchers.Point(0.0d, 1.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        double double7 = point2.y;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        double double11 = point2.y;
        double double12 = point2.y;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        double double10 = point2.x;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        fetchers.Point point2 = new fetchers.Point(10.0d, 52.0d);
        double double3 = point2.x;
        point2.y = 1.0f;
        double double6 = point2.x;
        point2.x = 97.0d;
        point2.y = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        fetchers.Point point2 = new fetchers.Point((double) ' ', 10.0d);
        double double3 = point2.x;
        point2.y = 10L;
        point2.x = 35.0d;
        point2.x = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 10);
        point2.y = 10L;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) '#');
        point2.x = 'a';
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 52.0d;
        double double11 = point2.x;
        double double12 = point2.x;
        double double13 = point2.x;
        point2.y = (-1L);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (short) 1;
        double double10 = point2.y;
        point2.x = 0;
        double double13 = point2.x;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 32.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) '#');
        point2.x = '#';
        double double5 = point2.x;
        point2.x = (-1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) '#');
        point2.x = '#';
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = (short) 10;
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) 100);
        double double3 = point2.y;
        point2.x = (byte) 100;
        point2.x = (byte) 0;
        point2.y = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) (-1.0f));
        point2.y = 1.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (byte) 1;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        fetchers.Point point2 = new fetchers.Point((double) 100, 52.0d);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.x = (short) -1;
        double double5 = point2.x;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.x = 'a';
        point2.y = (byte) 1;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0.0f);
        point2.x = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 1L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.x = '4';
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 'a');
        point2.y = (-1L);
        point2.x = 35.0d;
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1.0f));
        point2.x = (-1L);
        point2.y = (byte) -1;
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) 0L);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = 100L;
        point2.y = 0.0d;
        double double13 = point2.x;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        double double11 = point2.y;
        point2.x = 1.0f;
        point2.y = 0.0f;
        point2.x = 32.0d;
        double double18 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 32.0d + "'", double18 == 32.0d);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 0L);
        point2.x = 0.0d;
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.x = 32.0d;
        point2.y = 0.0d;
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        point2.y = (short) 0;
        double double6 = point2.y;
        point2.y = 0.0f;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (-1));
        double double3 = point2.x;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 100.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 10L);
        point2.y = 1.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (-1.0d);
        point2.x = '#';
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.y = 10L;
        point2.x = 100L;
        double double16 = point2.y;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        fetchers.Point point2 = new fetchers.Point((double) 1L, 52.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        double double7 = point2.y;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        double double3 = point2.x;
        point2.x = (-1.0d);
        point2.x = 1;
        point2.y = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) 1);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 0.0d;
        double double11 = point2.x;
        point2.x = 10L;
        point2.y = (-1.0f);
        double double16 = point2.x;
        point2.y = (short) 10;
        double double19 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1));
        point2.y = 1.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (short) -1);
        point2.y = 0L;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 0);
        point2.y = (byte) -1;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (byte) -1);
        point2.x = 10.0d;
        point2.y = 0.0d;
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 1L);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 1.0d);
        point2.x = (byte) 0;
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        point2.x = 10L;
        point2.x = (-1L);
        double double14 = point2.y;
        double double15 = point2.x;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = 0L;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = (-1.0f);
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0f;
        point2.x = 100L;
        point2.x = 10.0d;
        double double15 = point2.x;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 10.0d);
        double double3 = point2.y;
        point2.y = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) '4');
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 1L);
        double double3 = point2.x;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (short) -1);
        point2.y = (byte) 0;
        point2.y = ' ';
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.y = 10;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 10L);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) 10);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, 1.0d);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (-1.0d));
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        double double3 = point2.y;
        point2.y = 100;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = 1L;
        double double9 = point2.x;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 'a');
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (-1L));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (short) 10);
        point2.x = 1;
        point2.y = 32.0d;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        double double8 = point2.x;
        point2.x = 1L;
        double double11 = point2.y;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        point2.x = (byte) 1;
        point2.x = 1.0d;
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        point2.y = ' ';
        point2.x = ' ';
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = '4';
        double double9 = point2.y;
        double double10 = point2.y;
        point2.x = 100L;
        point2.y = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = 0L;
        double double5 = point2.x;
        point2.x = 52.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (-1.0f));
        double double3 = point2.x;
        point2.x = (-1);
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = (byte) 100;
        point2.x = (short) 100;
        double double12 = point2.y;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = 1.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) 1.0f);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) '4');
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 35.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 1);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        double double9 = point2.y;
        double double10 = point2.x;
        double double11 = point2.y;
        double double12 = point2.y;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        double double15 = point2.y;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = '#';
        point2.x = '#';
        point2.x = 100.0f;
        point2.x = (short) 0;
        point2.y = 32.0d;
        point2.y = (byte) 1;
        java.lang.Class<?> wildcardClass21 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, 52.0d);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        point2.y = (byte) -1;
        point2.x = 0.0f;
        point2.y = 0.0f;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.y;
        point2.x = 1.0d;
        point2.x = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        fetchers.Point point2 = new fetchers.Point(100.0d, 0.0d);
        point2.x = 0.0d;
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        point2.x = 'a';
        point2.x = 10.0f;
        point2.x = (byte) -1;
        double double9 = point2.y;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 0;
        double double9 = point2.y;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (-1.0d));
        double double3 = point2.x;
        point2.x = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.y = 10;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 1L;
        double double10 = point2.x;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = 52.0d;
        double double11 = point2.x;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        fetchers.Point point2 = new fetchers.Point(32.0d, 52.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        point2.x = 1L;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, 35.0d);
        point2.x = 1.0f;
        point2.x = '4';
        point2.x = 1;
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 0;
        point2.x = 1.0d;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (byte) 1);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        point2.y = ' ';
        point2.y = 10L;
        double double9 = point2.x;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0.0f);
        point2.y = (short) 0;
        point2.x = 10.0f;
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.y = (byte) 10;
        point2.y = (-1.0f);
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 52.0d);
        double double3 = point2.y;
        point2.x = 0L;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0.0d;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.y = (-1L);
        double double13 = point2.y;
        double double14 = point2.x;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) 0L);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        point2.y = 100L;
        point2.y = (-1.0d);
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        point2.y = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 0.0d);
        point2.x = 100L;
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) 100);
        point2.x = '4';
        point2.x = (byte) 1;
        point2.y = 10.0d;
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) ' ');
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1.0f));
        point2.x = (byte) 1;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        fetchers.Point point2 = new fetchers.Point((double) 10, 35.0d);
        double double3 = point2.y;
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '#');
        point2.x = '#';
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, 97.0d);
        double double3 = point2.y;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.y = (byte) 10;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        point2.y = ' ';
        double double14 = point2.x;
        point2.y = (byte) 10;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        fetchers.Point point2 = new fetchers.Point((double) 1L, 100.0d);
        double double3 = point2.x;
        point2.x = 10L;
        point2.x = '#';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 32.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        point2.x = (-1.0f);
        point2.y = (-1L);
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        point2.x = 10;
        double double7 = point2.y;
        point2.x = (byte) -1;
        double double10 = point2.y;
        point2.y = (short) -1;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1.0f;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        point2.x = 100.0d;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        point2.y = (byte) 1;
        point2.y = '4';
        point2.x = 0;
        double double9 = point2.y;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 100L);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        double double5 = point2.y;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.y = (short) 1;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (-1.0d));
        point2.y = (short) 1;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        double double5 = point2.x;
        point2.x = 0.0d;
        point2.y = 0.0d;
        double double10 = point2.x;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) (-1L));
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (short) 10);
        point2.x = (short) 1;
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 0L);
        point2.x = 52.0d;
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = (short) 1;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) 100.0f);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 10);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.x;
        point2.x = (short) -1;
        point2.x = 10;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1));
        point2.y = 1.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        point2.y = (-1L);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) -1);
        point2.y = 52.0d;
        point2.x = 'a';
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        point2.x = 'a';
        point2.y = 100;
        point2.x = 0.0d;
        point2.x = (byte) 0;
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) 10L);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        fetchers.Point point2 = new fetchers.Point((double) 1, 0.0d);
        point2.y = 1;
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (-1.0d));
        point2.x = 100L;
        point2.y = 0.0d;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.x;
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        point2.x = (byte) 10;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 10);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = 10.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.x = 1L;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (short) 100);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 'a');
        point2.x = (short) 0;
        point2.x = (-1);
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (short) 1;
        point2.y = (-1L);
        double double12 = point2.y;
        double double13 = point2.x;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.x = 10.0d;
        point2.x = 1L;
        double double10 = point2.x;
        point2.y = 0.0d;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 10.0f);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = 1L;
        point2.y = ' ';
        point2.y = 1L;
        point2.x = 1L;
        double double11 = point2.y;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.y;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.x = 52.0d;
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (-1L));
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 100L);
        point2.y = (short) 0;
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = (byte) 1;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 10L);
        double double3 = point2.x;
        point2.x = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = (-1L);
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 10;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 10.0f;
        point2.y = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = 10.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.y = 1;
        double double13 = point2.x;
        double double14 = point2.x;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        point2.y = (-1.0d);
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        point2.x = 0L;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = '#';
        point2.x = '#';
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }
}

