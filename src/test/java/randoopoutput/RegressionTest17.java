package randoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.y = (-1L);
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        point2.x = (short) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.x = (-1L);
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        point2.x = 0;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 'a';
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = (byte) 100;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = 10L;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.x;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = 100;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        point2.y = 'a';
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.y = (short) 100;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = (byte) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.x = (byte) 0;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 1L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1L);
        point2.y = 10.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.x = 0L;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.y = (short) 10;
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (short) 1;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        fetchers.Point point2 = new fetchers.Point((double) 0L, 1.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) '4');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.y = (-1L);
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        double double3 = point2.x;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        point2.x = 'a';
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        double double11 = point2.y;
        double double12 = point2.x;
        double double13 = point2.y;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = 1;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) ' ');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        point2.y = (byte) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        point2.y = (byte) -1;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) -1);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.x = 0L;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.y = 0L;
        point2.x = (-1);
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = (-1.0d);
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        point2.x = 100.0f;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) ' ');
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.y = 10.0f;
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        double double3 = point2.x;
        point2.y = 100.0f;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.y = (-1L);
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (-1.0f));
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 10L);
        point2.y = (-1.0d);
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 1L;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (short) 0;
        point2.y = 0;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 0;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        double double12 = point2.y;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 0;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.y = 10.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        point2.x = 1;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.y;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.y = 1;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        fetchers.Point point2 = new fetchers.Point(52.0d, 1.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 0.0f);
        point2.x = (byte) 100;
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = (byte) 100;
        point2.x = (byte) -1;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        point2.y = 'a';
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        double double5 = point2.y;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = '#';
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 0.0d);
        point2.y = 0.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 0.0f;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        fetchers.Point point2 = new fetchers.Point(10.0d, 1.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 0L);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = 1L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = '#';
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 10L);
        point2.x = 100.0d;
        double double5 = point2.y;
        point2.x = (short) 0;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.x = 35.0d;
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        point2.x = (short) 100;
        point2.x = 100.0d;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 10L);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        double double12 = point2.y;
        point2.x = 0.0d;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.y = 'a';
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 100L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        double double12 = point2.y;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        point2.x = 100L;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.x = 100.0f;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        point2.x = 1L;
        point2.y = (byte) 0;
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = 0L;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.x;
        point2.x = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.x;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = '#';
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 35.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        double double11 = point2.y;
        point2.x = 1.0f;
        double double14 = point2.y;
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 10L);
        point2.x = (short) 10;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        fetchers.Point point2 = new fetchers.Point((double) '#', 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        fetchers.Point point2 = new fetchers.Point((double) 10L, 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0.0f);
        point2.x = (byte) -1;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0d;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.x = (short) -1;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) ' ');
        point2.y = '#';
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), 1.0d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        fetchers.Point point2 = new fetchers.Point(0.0d, 35.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 100.0f);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 10L);
        point2.x = 0;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 10);
        point2.y = 10;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 100.0f;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = (byte) 100;
        double double10 = point2.y;
        double double11 = point2.y;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 0.0f);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        double double12 = point2.x;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.y = (short) 0;
        point2.x = 100.0d;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.y = 10.0d;
        point2.y = (byte) 1;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.y = (-1);
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.x = 0;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.x = (short) -1;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 100);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (short) 10);
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.x = 0;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 10L);
        point2.x = 100.0d;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.x;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        point2.y = (byte) 100;
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        double double3 = point2.y;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        double double10 = point2.y;
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.x = 10;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 52.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, 0.0d);
        point2.x = 97.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.y = 52.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        double double12 = point2.x;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 100.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 0;
        point2.y = (short) 1;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.y = (short) 0;
        point2.y = 100.0f;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        fetchers.Point point2 = new fetchers.Point((double) 'a', 35.0d);
        point2.x = 10L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 52.0d;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (byte) 10);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        point2.y = (byte) -1;
        point2.y = 97.0d;
        point2.y = 100.0f;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        point2.x = ' ';
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 0L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        point2.x = 0.0f;
        point2.x = 97.0d;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.y = (short) 0;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = (byte) 100;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        point2.y = (short) 100;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 1L;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.y = 0L;
        point2.x = (-1);
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 97.0d;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) 100.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) '4');
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        point2.x = 'a';
        point2.x = 97.0d;
        double double12 = point2.y;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) 1);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        point2.x = 0;
        point2.y = (byte) 10;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0L);
        point2.x = (byte) 0;
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 0;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        double double10 = point2.x;
        point2.x = '#';
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) 10);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 10L);
        double double3 = point2.y;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 100.0f);
        point2.y = 32.0d;
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 1L;
        double double10 = point2.x;
        point2.y = 100L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = 1L;
        point2.y = ' ';
        point2.y = 1L;
        point2.x = 0.0d;
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        fetchers.Point point2 = new fetchers.Point(97.0d, 32.0d);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.y = (-1L);
        point2.y = 10.0d;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1.0f));
        point2.x = (byte) 1;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = 10.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        double double10 = point2.y;
        point2.y = (short) 0;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 10L);
        point2.y = (-1.0d);
        point2.x = (-1L);
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, 97.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 0;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 1.0f);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 10;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.y = 0;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 100;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        double double7 = point2.y;
        double double8 = point2.x;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1.0f));
        point2.x = (byte) 1;
        double double5 = point2.x;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        point2.y = 100L;
        point2.y = (short) 1;
        point2.y = (byte) 1;
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = 52.0d;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        double double5 = point2.y;
        point2.x = (-1L);
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = (byte) 10;
        double double9 = point2.x;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '#');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (short) -1;
        point2.y = 10;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        point2.y = (byte) 1;
        point2.y = '4';
        double double7 = point2.x;
        point2.x = (byte) 0;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (byte) 100);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = (byte) 100;
        double double10 = point2.x;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = (byte) 10;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        fetchers.Point point2 = new fetchers.Point(52.0d, 1.0d);
        point2.y = (short) 10;
        point2.y = (short) 10;
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        double double5 = point2.x;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) (short) -1);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (-1));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) '#');
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.y = (byte) 10;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 100L;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.y = (-1);
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 0.0d);
        point2.y = 0.0d;
        point2.x = 0L;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.x = 100.0f;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) -1);
        point2.x = 10.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        fetchers.Point point2 = new fetchers.Point(1.0d, 35.0d);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 52.0d;
        double double10 = point2.y;
        double double11 = point2.y;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        java.lang.Class<?> wildcardClass17 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 0.0d);
        point2.x = (byte) 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        point2.y = 100;
        point2.x = 100L;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        fetchers.Point point2 = new fetchers.Point(0.0d, 52.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (-1.0d));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        fetchers.Point point2 = new fetchers.Point((double) 10, 0.0d);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 10L);
        point2.y = (-1.0d);
        point2.x = (-1L);
        point2.y = 'a';
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (-1.0d);
        point2.x = '#';
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0.0f);
        point2.y = (byte) 1;
        point2.x = 0.0d;
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        double double5 = point2.y;
        double double6 = point2.y;
        point2.x = (byte) 0;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        double double3 = point2.x;
        point2.y = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
        double double17 = point2.x;
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (byte) -1);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (byte) 1);
        point2.y = (short) 1;
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        point2.y = 100L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.x = (byte) 100;
        point2.y = 100;
        double double10 = point2.x;
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = '4';
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 100L);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.y = (short) -1;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.x = (byte) 0;
        point2.y = (byte) 100;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 100.0f;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0.0d;
        double double9 = point2.y;
        double double10 = point2.x;
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = '#';
        point2.x = '#';
        point2.x = 100.0f;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (-1.0f));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (byte) 1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 1L;
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (byte) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 0;
        point2.y = (short) 1;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.y = 0L;
        point2.x = (byte) 100;
        point2.y = 1;
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
        point2.x = (byte) 0;
        double double17 = point2.x;
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 10);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 1);
        point2.x = ' ';
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        fetchers.Point point2 = new fetchers.Point((double) 100, 100.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 100);
        double double3 = point2.x;
        point2.y = 1.0d;
        point2.x = 100.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        point2.x = '4';
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.y = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 0L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 100.0f;
        point2.y = (byte) 1;
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (-1L);
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        point2.y = 'a';
        point2.y = 10.0f;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        double double10 = point2.x;
        point2.y = 52.0d;
        point2.x = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.x = (-1.0d);
        point2.x = 97.0d;
        point2.x = (byte) 1;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        point2.x = 100.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = (byte) 1;
        double double5 = point2.y;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        fetchers.Point point2 = new fetchers.Point((double) 10L, 1.0d);
        point2.y = (short) 100;
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, 10.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        point2.x = 0;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        point2.y = (-1L);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) 10L);
        point2.y = (short) 10;
        double double5 = point2.y;
        point2.y = 0.0f;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 97.0d;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.y = 52.0d;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.x = (short) -1;
        point2.x = (-1);
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = 'a';
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.y = (short) 100;
        point2.x = 1L;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.x = (byte) 100;
        double double11 = point2.x;
        point2.x = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, 1.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0.0d;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = 35.0d;
        point2.y = 10.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        double double7 = point2.x;
        double double8 = point2.y;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) 0);
        double double3 = point2.x;
        point2.y = (byte) -1;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        point2.x = 1;
        point2.y = 10L;
        point2.x = (short) 1;
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.x;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 10L);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        point2.x = (-1.0f);
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.x = (-1L);
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        fetchers.Point point2 = new fetchers.Point((double) 'a', 0.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = (byte) 0;
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (-1));
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 100.0f);
        point2.x = (byte) 1;
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        point2.y = (short) 100;
        double double8 = point2.y;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 10L;
        double double7 = point2.x;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        double double3 = point2.y;
        point2.y = 0.0f;
        point2.x = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '#');
        point2.y = 0L;
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (-1.0f));
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 52.0d;
        double double10 = point2.y;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 1L);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        double double3 = point2.x;
        point2.y = (-1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        double double5 = point2.x;
        point2.x = 0.0d;
        point2.y = 1L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 1;
        double double8 = point2.x;
        point2.x = (-1.0f);
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 10L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        point2.y = (short) 1;
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (byte) 100);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.y = (byte) 10;
        point2.x = 100.0f;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 100L);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 0);
        point2.y = (byte) 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, 97.0d);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0f;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.x = (byte) 1;
        point2.y = 10.0f;
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 52.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.x = 1;
        point2.x = 1;
        point2.y = (byte) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (byte) 1;
        double double6 = point2.y;
        point2.y = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        point2.x = 1L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (-1.0d));
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 10.0f);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 1;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.y = 1;
        point2.y = 100.0f;
        point2.x = (short) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.x = (short) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 1L);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 35.0d;
        point2.x = 100.0f;
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = (byte) -1;
        double double9 = point2.y;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.y;
        point2.y = 1;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = (byte) -1;
        point2.x = 0.0d;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = 0L;
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        fetchers.Point point2 = new fetchers.Point((double) (-1), 52.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        point2.x = (short) 100;
        point2.x = 100.0d;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        point2.y = 0L;
        point2.x = (-1);
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = (short) 10;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = (byte) -1;
        double double9 = point2.y;
        point2.x = 52.0d;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 100.0f);
        point2.y = (-1L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.y = 100.0d;
        double double12 = point2.y;
        point2.y = ' ';
        double double15 = point2.x;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) -1;
        point2.x = 35.0d;
        double double12 = point2.y;
        point2.y = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.x = 0L;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1.0f));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 1L;
        point2.x = (-1L);
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        double double7 = point2.x;
        point2.x = (byte) -1;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = 100;
        point2.y = '#';
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        fetchers.Point point2 = new fetchers.Point((double) 100, 1.0d);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.x;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 1;
        point2.x = ' ';
        point2.x = (byte) 100;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 1;
        point2.y = 100.0f;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.y = 10.0d;
        double double8 = point2.y;
        point2.x = (short) 1;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 0);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 0.0d;
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) '4');
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = 52.0d;
        point2.y = ' ';
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (short) 0;
        point2.y = 35.0d;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = (byte) 100;
        point2.y = (-1.0f);
        point2.x = (short) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (short) -1);
        point2.y = 0L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

