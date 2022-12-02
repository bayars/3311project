package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 1.0f);
        point2.y = 0.0d;
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        double double8 = point2.y;
        point2.y = 10L;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = '4';
        point2.x = (-1L);
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 100.0f;
        point2.x = (short) 100;
        point2.x = 0L;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.y = (short) 1;
        double double13 = point2.x;
        point2.y = (-1.0d);
        double double16 = point2.y;
        double double17 = point2.y;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, 0.0d);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 10.0d);
        double double3 = point2.y;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 100);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.y = (byte) 10;
        point2.x = 32.0d;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.x = (byte) -1;
        double double14 = point2.x;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 0L);
        point2.y = (-1.0d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1L);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        point2.y = 1.0f;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 1;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        point2.x = 0L;
        point2.y = '#';
        point2.y = 35.0d;
        point2.x = 35.0d;
        point2.y = 10.0d;
        double double13 = point2.x;
        point2.x = 100.0d;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 10);
        point2.x = 35.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        double double15 = point2.x;
        double double16 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        double double12 = point2.y;
        point2.y = (byte) 10;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.y = (short) 0;
        point2.x = 100.0d;
        point2.y = 10.0d;
        point2.y = 10.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = 0;
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (byte) 0);
        point2.y = 1.0f;
        point2.y = (short) -1;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (-1L));
        double double3 = point2.x;
        point2.x = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        double double3 = point2.y;
        point2.x = 0.0f;
        point2.y = (short) 0;
        point2.y = 100;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 1;
        double double8 = point2.x;
        point2.x = 1.0d;
        point2.y = (short) 0;
        double double13 = point2.y;
        double double14 = point2.y;
        point2.y = (byte) 0;
        point2.x = (-1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.x = 10.0d;
        point2.x = 1L;
        double double10 = point2.x;
        point2.y = 0.0d;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) '#');
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (-1));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (short) 10);
        point2.y = (byte) 0;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 10);
        point2.y = 97.0d;
        point2.x = 10.0d;
        point2.y = 100.0f;
        double double9 = point2.y;
        point2.x = (-1.0f);
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        double double5 = point2.x;
        point2.x = 0.0d;
        point2.y = 0.0d;
        double double10 = point2.x;
        point2.y = 100.0f;
        point2.y = (-1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, 0.0d);
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (-1));
        point2.x = (short) 1;
        point2.x = (short) 1;
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        point2.x = 100;
        point2.x = 100.0d;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (byte) 0);
        point2.x = ' ';
        double double5 = point2.y;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        fetchers.Point point2 = new fetchers.Point((double) 10L, 10.0d);
        point2.y = 35.0d;
        point2.y = 1.0f;
        double double7 = point2.x;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) (short) -1);
        point2.x = 10;
        point2.y = 100.0f;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 0.0d);
        point2.y = (-1.0d);
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 0.0d;
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        fetchers.Point point2 = new fetchers.Point(52.0d, 0.0d);
        point2.y = 0.0d;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (short) -1;
        point2.y = 10;
        double double9 = point2.x;
        point2.y = (short) 10;
        double double12 = point2.y;
        point2.x = 100.0f;
        double double15 = point2.y;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (-1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 97.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        point2.y = (-1.0d);
        double double5 = point2.y;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.y = (-1);
        point2.y = (byte) 0;
        point2.y = 10.0d;
        point2.x = (byte) 1;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        fetchers.Point point2 = new fetchers.Point(0.0d, (-1.0d));
        double double3 = point2.x;
        point2.y = (short) 1;
        double double6 = point2.y;
        point2.x = (-1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 1.0f);
        point2.x = 100.0f;
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) 1L);
        double double3 = point2.y;
        point2.x = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = 100L;
        point2.x = (-1.0f);
        double double9 = point2.x;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 1.0f);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = (byte) -1;
        double double11 = point2.x;
        double double12 = point2.x;
        double double13 = point2.x;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        point2.y = 0.0d;
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (short) 0;
        double double6 = point2.y;
        point2.x = (byte) 10;
        double double9 = point2.y;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (byte) 1);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (short) -1);
        double double3 = point2.y;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.y = 100.0f;
        point2.y = ' ';
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (byte) 0);
        point2.y = 0.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        fetchers.Point point2 = new fetchers.Point(10.0d, 35.0d);
        point2.y = (short) -1;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        fetchers.Point point2 = new fetchers.Point((double) '4', 10.0d);
        point2.y = (byte) 10;
        point2.x = 10L;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) 100.0f);
        point2.x = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (short) 10);
        point2.y = (short) 0;
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = 0L;
        point2.x = (-1L);
        point2.y = 1.0f;
        double double14 = point2.x;
        point2.y = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0.0f);
        double double3 = point2.x;
        point2.y = 0.0d;
        double double6 = point2.x;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 1L);
        point2.y = 10.0d;
        double double5 = point2.y;
        point2.y = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        double double7 = point2.y;
        point2.y = (short) 100;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = (byte) 1;
        point2.y = (-1);
        double double8 = point2.y;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (byte) -1);
        double double3 = point2.x;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        fetchers.Point point2 = new fetchers.Point((double) 100, 35.0d);
        double double3 = point2.y;
        point2.y = 52.0d;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) '4');
        point2.x = 10;
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.x;
        point2.y = (-1.0f);
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (byte) 10);
        point2.x = 10.0d;
        point2.x = (short) 10;
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) 100);
        point2.y = (byte) 1;
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.x = (byte) 0;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (byte) 1;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 52.0d);
        double double3 = point2.y;
        point2.x = 0L;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (byte) 10);
        point2.x = (byte) 10;
        double double5 = point2.x;
        point2.y = 100.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.x = 0.0f;
        point2.x = 100.0d;
        double double12 = point2.x;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1.0d;
        double double7 = point2.x;
        point2.x = (byte) 1;
        point2.x = 32.0d;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (short) 0);
        point2.x = (byte) 100;
        point2.y = 10.0f;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.x = 'a';
        point2.x = (byte) 0;
        point2.x = 10.0f;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = 100L;
        point2.x = (-1.0d);
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 10.0f;
        double double6 = point2.y;
        point2.x = 100.0d;
        point2.x = 'a';
        point2.x = (short) 0;
        point2.x = (short) -1;
        point2.x = '#';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 10);
        double double3 = point2.y;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 1L);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.y = 100L;
        point2.y = (-1);
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        fetchers.Point point2 = new fetchers.Point(100.0d, 100.0d);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        double double12 = point2.x;
        point2.y = (short) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10L);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        point2.x = (short) -1;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        point2.x = 1;
        double double9 = point2.x;
        point2.y = 1.0f;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (-1L));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        point2.x = (byte) 1;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        double double5 = point2.y;
        point2.y = 0.0f;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        double double12 = point2.y;
        point2.y = 35.0d;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (byte) 100;
        point2.y = 100L;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        double double6 = point2.y;
        point2.y = 10.0f;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 0.0f;
        point2.x = (short) 1;
        double double9 = point2.x;
        point2.y = '#';
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (short) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, 32.0d);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (byte) -1);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 1);
        double double3 = point2.x;
        point2.y = 100.0d;
        point2.x = 10.0f;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (short) 10);
        point2.y = (byte) 0;
        point2.y = 0.0d;
        point2.y = 'a';
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 97.0d);
        point2.x = (-1.0d);
        double double5 = point2.y;
        point2.y = (byte) 1;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 100;
        double double5 = point2.x;
        point2.x = 1.0f;
        point2.x = 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 10);
        point2.x = 35.0d;
        double double5 = point2.y;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1L));
        point2.x = 1.0f;
        point2.y = 10L;
        point2.y = 100.0f;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 100.0f;
        point2.y = 35.0d;
        double double7 = point2.y;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '4');
        point2.x = (short) 0;
        point2.x = 1.0d;
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 100;
        double double10 = point2.y;
        point2.y = 1;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = (byte) 100;
        point2.x = (short) 100;
        point2.y = (-1.0f);
        double double14 = point2.x;
        point2.y = 0.0f;
        point2.x = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1L));
        double double3 = point2.y;
        point2.x = 100.0d;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (byte) -1);
        point2.y = (-1.0d);
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 35.0d);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.x;
        point2.y = (-1.0f);
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) 100.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        fetchers.Point point2 = new fetchers.Point((double) ' ', 10.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 35.0d;
        point2.x = 10.0f;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.x = 100L;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1.0f);
        double double3 = point2.x;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.x = 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.x;
        point2.x = 0L;
        point2.y = 'a';
        double double16 = point2.y;
        point2.x = (short) 100;
        double double19 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
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
        double double18 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = (byte) 0;
        double double9 = point2.y;
        point2.y = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = 10.0d;
        point2.x = 1.0f;
        point2.x = (byte) 0;
        double double11 = point2.x;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        point2.y = ' ';
        point2.y = ' ';
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.y = (short) 1;
        double double13 = point2.x;
        point2.y = (-1.0d);
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.y = (byte) 10;
        point2.x = 32.0d;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.x = (byte) -1;
        double double14 = point2.x;
        point2.x = 100L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (short) 10);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 0);
        point2.x = ' ';
        double double5 = point2.x;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = (byte) 0;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0d;
        double double11 = point2.x;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        point2.y = (byte) -1;
        point2.y = 97.0d;
        point2.y = (-1.0d);
        double double9 = point2.y;
        point2.x = (-1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        fetchers.Point point2 = new fetchers.Point((double) 'a', 100.0d);
        point2.x = 'a';
        point2.x = 0.0d;
        double double7 = point2.y;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 10);
        point2.y = 1.0d;
        point2.x = (byte) -1;
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1.0d;
        double double7 = point2.x;
        point2.y = 0;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, 0.0d);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) (byte) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 100);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        fetchers.Point point2 = new fetchers.Point(52.0d, 1.0d);
        point2.y = (short) 10;
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 100;
        double double5 = point2.x;
        point2.x = 1.0f;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.y = 100.0f;
        point2.y = 10.0f;
        point2.y = (byte) -1;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        fetchers.Point point2 = new fetchers.Point(35.0d, (double) 100);
        point2.y = (short) -1;
        point2.y = (-1L);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = (byte) -1;
        point2.y = 100;
        point2.y = '4';
        point2.x = (-1.0d);
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = (byte) -1;
        point2.x = ' ';
        point2.y = (byte) 1;
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1.0f));
        point2.y = 0.0d;
        point2.x = 1.0d;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 0;
        point2.y = (short) 1;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 35.0d;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '#');
        point2.x = '#';
        point2.y = (short) 10;
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 1;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.x = (byte) -1;
        java.lang.Class<?> wildcardClass15 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
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
        double double20 = point2.x;
        java.lang.Class<?> wildcardClass21 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 0.0f);
        point2.x = (byte) -1;
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 100L);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1L));
        point2.x = 35.0d;
        point2.x = 10.0d;
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 100);
        double double3 = point2.y;
        point2.x = 1L;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '#';
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.x;
        point2.x = (short) -1;
        point2.x = 10;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 1;
        point2.x = ' ';
        point2.y = 0.0d;
        point2.x = 52.0d;
        double double16 = point2.y;
        point2.y = 10.0d;
        double double19 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 52.0d + "'", double19 == 52.0d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 1);
        point2.x = 0.0d;
        point2.y = (short) 1;
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = ' ';
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 35.0d;
        point2.x = 10.0f;
        point2.y = (-1L);
        point2.x = 0.0d;
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 10L);
        point2.y = (-1.0d);
        double double5 = point2.y;
        point2.x = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) 1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.x;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
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
        point2.x = (short) 1;
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (byte) -1);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.x;
        point2.x = (short) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 10;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) (short) -1);
        point2.y = 100.0f;
        point2.x = 10.0d;
        point2.x = ' ';
        point2.x = (byte) 0;
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) (-1));
        double double3 = point2.x;
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 10;
        point2.y = 0;
        double double9 = point2.x;
        point2.y = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        point2.y = (short) 100;
        double double8 = point2.y;
        double double9 = point2.y;
        point2.y = 'a';
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        point2.y = 100;
        double double9 = point2.y;
        point2.x = (byte) 0;
        point2.y = 100;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        point2.y = 'a';
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.y = 100.0f;
        point2.y = 10.0f;
        double double12 = point2.x;
        double double13 = point2.x;
        double double14 = point2.y;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 10);
        point2.y = 10L;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) 'a');
        point2.x = (byte) -1;
        point2.y = 35.0d;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        double double18 = point2.x;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        fetchers.Point point2 = new fetchers.Point((double) '4', 1.0d);
        point2.y = (byte) 1;
        point2.y = 10.0f;
        point2.x = (short) 10;
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 100.0f;
        double double10 = point2.x;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        point2.x = 0;
        point2.y = (byte) 10;
        point2.y = (byte) 10;
        point2.x = (-1.0d);
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        double double3 = point2.x;
        point2.y = 100;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (short) -1);
        double double3 = point2.y;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.x = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0.0d;
        point2.y = '#';
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 1L);
        double double3 = point2.y;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) (-1L));
        point2.y = 52.0d;
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (byte) 100;
        point2.y = '#';
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 100.0f);
        point2.y = 100L;
        point2.x = 0L;
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = (byte) 10;
        double double7 = point2.y;
        point2.y = (byte) -1;
        double double10 = point2.x;
        point2.y = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) 100);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.x = 'a';
        point2.y = (-1.0f);
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        fetchers.Point point2 = new fetchers.Point(10.0d, 0.0d);
        point2.x = 97.0d;
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) 10.0f);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 10L);
        point2.x = (-1);
        point2.x = 10.0f;
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) 100);
        point2.x = '4';
        point2.y = 0.0f;
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        fetchers.Point point2 = new fetchers.Point((double) ' ', 10.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 1.0f;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) (byte) 10);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (short) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.y = 10;
        double double13 = point2.x;
        double double14 = point2.y;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = 10.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 1);
        point2.y = (short) -1;
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 52.0d);
        point2.y = 0;
        point2.x = 100.0d;
        point2.x = (byte) 100;
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) 10L);
        double double3 = point2.x;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 52.0d;
        point2.y = (short) 0;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (short) -1);
        point2.x = (byte) 10;
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        fetchers.Point point2 = new fetchers.Point((double) 10, 97.0d);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        point2.x = 100.0d;
        point2.y = 0.0f;
        double double15 = point2.y;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        point2.x = 10;
        double double7 = point2.y;
        point2.x = (byte) -1;
        point2.x = '#';
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (short) 0);
        point2.x = (byte) 100;
        point2.y = 10.0f;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 97.0d);
        point2.x = (-1.0d);
        double double5 = point2.y;
        point2.y = (byte) 1;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = 10.0f;
        point2.y = '#';
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        fetchers.Point point2 = new fetchers.Point((double) 0, 0.0d);
        point2.y = 1.0d;
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        fetchers.Point point2 = new fetchers.Point(97.0d, 0.0d);
        point2.y = (-1.0d);
        point2.x = ' ';
        point2.x = 1.0f;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = 10.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = 100L;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (byte) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = ' ';
        point2.x = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 52.0d);
        point2.y = '4';
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) (short) 1);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.y = 1;
        point2.y = 0.0d;
        double double16 = point2.y;
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 1);
        double double3 = point2.y;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, 1.0d);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 1;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        double double9 = point2.y;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.y = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, 52.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        point2.y = 'a';
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        point2.x = 'a';
        point2.x = 10L;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 35.0d);
        point2.x = (byte) 10;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.y = (short) 10;
        point2.y = 52.0d;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 32.0d);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        point2.x = 10.0d;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) 10.0f);
        point2.y = 52.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        point2.x = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        point2.x = 100.0d;
        point2.y = 0.0d;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        fetchers.Point point2 = new fetchers.Point(1.0d, 1.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 1L);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        double double8 = point2.x;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        point2.x = 'a';
        point2.x = 10.0f;
        point2.x = (byte) -1;
        double double9 = point2.y;
        point2.x = 1.0f;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) '#');
        point2.x = 97.0d;
        point2.x = (byte) 10;
        point2.y = 10.0f;
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 10.0f);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (-1));
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        double double7 = point2.y;
        point2.x = 1.0d;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        point2.y = 35.0d;
        point2.y = 10.0f;
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = 100.0d;
        point2.y = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) 1L);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        double double8 = point2.y;
        point2.x = 35.0d;
        point2.y = 10.0d;
        point2.x = 0.0d;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (byte) -1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.x;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (-1);
        point2.x = 52.0d;
        double double12 = point2.y;
        double double13 = point2.y;
        double double14 = point2.x;
        point2.x = 100.0f;
        double double17 = point2.x;
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 97.0d);
        point2.x = (-1.0d);
        double double5 = point2.y;
        point2.y = (byte) 1;
        point2.x = 1.0d;
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (short) -1);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = 32.0d;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 52.0d;
        point2.y = 100.0f;
        double double9 = point2.x;
        point2.x = (short) 10;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 10);
        double double3 = point2.y;
        point2.x = 32.0d;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 1.0f);
        point2.y = ' ';
        point2.x = 100.0d;
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (short) 10);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (-1.0f));
        point2.x = (-1.0d);
        point2.x = 100.0f;
        point2.x = 100;
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = (short) 100;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = 100.0d;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        fetchers.Point point2 = new fetchers.Point(52.0d, 0.0d);
        point2.y = (-1.0d);
        point2.y = 10.0f;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        double double12 = point2.y;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, 100.0d);
        point2.y = 'a';
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        point2.x = 100.0f;
        point2.x = (-1.0f);
        point2.x = 0.0d;
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.y;
        point2.y = 100L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.x = (byte) -1;
        double double15 = point2.y;
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 100.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        point2.x = 35.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 100);
        double double3 = point2.x;
        point2.y = 1.0d;
        point2.x = 100.0d;
        double double8 = point2.y;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) 100.0f);
        point2.y = 100L;
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 'a');
        double double3 = point2.x;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 0L);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, 97.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (-1);
        point2.x = 52.0d;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 100L);
        point2.y = 0;
        point2.y = 10.0f;
        double double7 = point2.y;
        point2.y = 100.0d;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 1.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 10.0d;
        point2.y = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        fetchers.Point point2 = new fetchers.Point((double) (-1), 52.0d);
        point2.x = 52.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (short) -1);
        point2.y = 0.0d;
        point2.y = 10;
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, 1.0d);
        point2.y = 35.0d;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = (short) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) '#');
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 1L);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, 97.0d);
        point2.x = 1L;
        point2.x = 100;
        point2.x = 0.0f;
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.y = (short) 0;
        point2.x = 100.0d;
        point2.y = (short) 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (-1.0d));
        point2.y = 0;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 10);
        point2.y = 0.0d;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 100L);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 52.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        point2.x = 100.0d;
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 'a');
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        point2.y = ' ';
        point2.y = 10L;
        point2.x = 97.0d;
        double double11 = point2.x;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 97.0d + "'", double11 == 97.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) '#');
        point2.x = 97.0d;
        point2.x = (byte) 10;
        double double7 = point2.x;
        point2.x = '#';
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.y = (short) 0;
        double double8 = point2.x;
        point2.y = (-1.0d);
        double double11 = point2.x;
        double double12 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) '#');
        point2.x = (short) 1;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) ' ');
        double double3 = point2.x;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (short) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = (-1);
        point2.y = 1;
        point2.x = ' ';
        point2.x = (byte) 100;
        double double14 = point2.y;
        point2.y = 100L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, 1.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        point2.x = 10;
        double double5 = point2.y;
        point2.y = (byte) 100;
        point2.y = (-1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 'a');
        point2.x = (-1);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (byte) -1);
        point2.x = (-1.0f);
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) '#');
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) -1);
        point2.x = (-1.0f);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 10.0d);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = '#';
        point2.x = '#';
        point2.x = 100.0f;
        point2.x = (short) 0;
        double double17 = point2.x;
        double double18 = point2.y;
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 100);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        double double8 = point2.x;
        point2.x = 1L;
        point2.y = 10L;
        point2.y = 100L;
        point2.x = 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        point2.x = 100.0f;
        double double6 = point2.y;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, 32.0d);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        fetchers.Point point2 = new fetchers.Point(35.0d, 97.0d);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        fetchers.Point point2 = new fetchers.Point(52.0d, 32.0d);
        point2.x = 100L;
        point2.y = (byte) 10;
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.y;
        point2.y = 100;
        point2.y = '4';
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 100L);
        point2.y = 10.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), 0.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) '#');
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) (short) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        fetchers.Point point2 = new fetchers.Point((double) 10, 1.0d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        point2.x = 0L;
        point2.y = '#';
        point2.y = 35.0d;
        point2.y = (short) 10;
        point2.y = (byte) -1;
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
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
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        double double7 = point2.y;
        point2.y = 100;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 35.0d;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (byte) -1);
        double double3 = point2.x;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 100);
        double double3 = point2.x;
        point2.y = (byte) 0;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 10);
        point2.x = (-1);
        point2.y = 52.0d;
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0L;
        point2.y = 1.0d;
        point2.y = (byte) 10;
        double double13 = point2.x;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        point2.x = (-1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
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
        double double18 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 10);
        double double3 = point2.y;
        point2.y = (-1.0d);
        double double6 = point2.x;
        point2.x = 10;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (short) -1;
        point2.y = 10;
        double double9 = point2.y;
        point2.y = (byte) 0;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = (byte) -1;
        double double9 = point2.y;
        point2.x = 52.0d;
        point2.y = (-1L);
        point2.x = (short) 1;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = 1;
        double double12 = point2.x;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 10.0d;
        double double7 = point2.y;
        point2.x = 0L;
        point2.x = 32.0d;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = (-1);
        point2.y = (short) 100;
        point2.y = (byte) 0;
        point2.x = 1;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.y = 100;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.y = (short) 0;
        point2.y = 100.0f;
        double double7 = point2.x;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (short) 1);
        double double3 = point2.x;
        point2.x = ' ';
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (byte) -1);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) '#');
        point2.y = 10;
        double double5 = point2.y;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 52.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        point2.y = 32.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = ' ';
        double double11 = point2.x;
        point2.x = (byte) -1;
        point2.x = 97.0d;
        double double16 = point2.y;
        java.lang.Class<?> wildcardClass17 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 10);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (byte) 10);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        fetchers.Point point2 = new fetchers.Point((double) (-1), 0.0d);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        double double9 = point2.y;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        point2.y = 100.0d;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 1);
        double double3 = point2.x;
        point2.y = 100.0d;
        double double6 = point2.y;
        point2.y = 100.0f;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 10);
        point2.y = 0.0d;
        point2.x = 100L;
        point2.y = (byte) 1;
        double double9 = point2.y;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (-1));
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (byte) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (-1.0f));
        double double3 = point2.x;
        point2.y = '#';
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
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
        point2.y = 0L;
        point2.x = (short) -1;
        point2.y = 32.0d;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = (short) 100;
        double double9 = point2.y;
        double double10 = point2.y;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (-1));
        point2.x = (short) 1;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 10);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) '#');
        point2.x = '#';
        double double5 = point2.x;
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        double double3 = point2.y;
        point2.y = 1;
        double double6 = point2.y;
        point2.x = 1.0f;
        point2.y = (-1);
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        point2.y = ' ';
        point2.x = (short) 0;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.y = 100L;
        point2.y = (-1);
        double double16 = point2.x;
        java.lang.Class<?> wildcardClass17 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        fetchers.Point point2 = new fetchers.Point((double) '4', 100.0d);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.x;
        point2.x = 10.0f;
        double double10 = point2.y;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.x = 52.0d;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.y = 52.0d;
        point2.x = (-1.0f);
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 97.0d);
        point2.x = (-1.0d);
        double double5 = point2.y;
        point2.y = (byte) 1;
        point2.x = 1.0d;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        fetchers.Point point2 = new fetchers.Point(0.0d, 35.0d);
        point2.x = 100.0f;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.x = 10.0d;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) 0);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.x = 'a';
        point2.x = (byte) 0;
        double double7 = point2.x;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        double double7 = point2.x;
        double double8 = point2.y;
        point2.x = 35.0d;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (byte) 0);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = (byte) -1;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.y = 100L;
        double double14 = point2.y;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) -1);
        double double3 = point2.x;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 35.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 0.0d;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 1.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 100);
        point2.x = 52.0d;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.x = 35.0d;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 100L);
        double double3 = point2.y;
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = (short) 100;
        point2.x = 100.0d;
        double double9 = point2.x;
        point2.y = '4';
        double double12 = point2.x;
        double double13 = point2.y;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (short) 10;
        double double10 = point2.y;
        point2.y = (short) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.y;
        point2.x = 1.0d;
        double double10 = point2.x;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) 10L);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        fetchers.Point point2 = new fetchers.Point((double) 1, 52.0d);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (-1));
        point2.x = 35.0d;
        double double5 = point2.x;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 0.0d);
        point2.y = 0.0d;
        point2.x = 1.0d;
        double double7 = point2.y;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1L));
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 100.0d;
        point2.x = (-1L);
        point2.y = (-1.0d);
        double double12 = point2.y;
        point2.y = 100.0f;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (short) 1);
        double double3 = point2.x;
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = (short) 100;
        double double11 = point2.y;
        point2.x = (short) -1;
        double double14 = point2.x;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1L);
        point2.y = 10.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (byte) -1;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) (byte) 10);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 10);
        point2.x = (-1.0f);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        point2.y = (short) 100;
        double double8 = point2.y;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.x = 1L;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) ' ');
        double double3 = point2.x;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        double double3 = point2.x;
        point2.x = 100;
        point2.x = 1;
        point2.x = 32.0d;
        point2.y = 100;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = (short) 100;
        double double11 = point2.y;
        point2.y = 10L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1));
        point2.x = (byte) 10;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) '4');
        point2.x = 1;
        point2.x = 1.0d;
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        point2.x = 100L;
        point2.y = 1;
        double double7 = point2.x;
        point2.x = ' ';
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 1L;
        double double10 = point2.y;
        point2.y = '4';
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) ' ');
        point2.x = 10.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) (short) -1);
        point2.x = 0.0d;
        point2.x = 1.0d;
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.y = 10.0f;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 35.0d);
        point2.x = 0.0d;
        double double5 = point2.y;
        point2.x = 32.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 0);
        point2.x = ' ';
        point2.x = 1;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 1.0f);
        double double3 = point2.x;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        point2.x = 100.0f;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.x = '#';
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.y = 100.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = (byte) 10;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 10L;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.x = 0.0d;
        point2.x = 52.0d;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        double double9 = point2.y;
        double double10 = point2.x;
        point2.x = (-1L);
        point2.x = (-1.0d);
        point2.y = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        double double9 = point2.x;
        point2.x = (byte) -1;
        double double12 = point2.x;
        point2.y = (-1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 100.0f);
        point2.y = 10L;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 10);
        point2.y = 10;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = (-1.0d);
        double double9 = point2.y;
        point2.x = 52.0d;
        double double12 = point2.x;
        point2.y = 32.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        double double5 = point2.y;
        point2.y = ' ';
        point2.x = (short) 0;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = (byte) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (byte) 0);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 10;
        point2.y = 0;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        double double11 = point2.y;
        point2.x = 1.0f;
        double double14 = point2.x;
        point2.y = (-1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        point2.x = 'a';
        point2.x = 10.0f;
        point2.y = 1.0f;
        point2.y = 10L;
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) (short) -1);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        point2.y = (short) 100;
        point2.y = 52.0d;
        point2.y = 1.0d;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        point2.y = (short) 100;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.y = 35.0d;
        point2.x = 1.0f;
        double double14 = point2.y;
        double double15 = point2.x;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) 100);
        point2.y = (byte) 100;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = 'a';
        point2.y = (-1.0f);
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 100L);
        point2.y = (short) 10;
        point2.y = (short) -1;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 100L);
        point2.x = 10L;
        point2.y = (short) 100;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = (byte) 0;
        point2.x = (short) 1;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.y = (byte) -1;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (short) 10);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (short) 0);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.x = (-1.0d);
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = 100;
        double double8 = point2.y;
        point2.y = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        double double6 = point2.y;
        point2.y = 10.0f;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 10);
        point2.x = (-1.0f);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = (short) 100;
        point2.x = 100.0d;
        point2.x = (short) 1;
        point2.x = 0.0d;
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) ' ');
        point2.y = (short) 1;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 97.0d;
        point2.x = 0.0f;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = (short) 100;
        double double9 = point2.y;
        point2.x = (short) -1;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1L;
        point2.y = 10.0f;
        point2.x = (short) 0;
        point2.x = 10L;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (-1));
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = 0.0f;
        double double11 = point2.y;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        double double7 = point2.x;
        point2.x = 100L;
        double double10 = point2.y;
        point2.y = 1.0d;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.x = 'a';
        point2.y = 10;
        double double13 = point2.x;
        point2.x = (short) 10;
        point2.x = (-1L);
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 1);
        point2.x = ' ';
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) 100);
        double double3 = point2.y;
        point2.x = '#';
        point2.y = (short) -1;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (short) -1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.y = 100.0d;
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) ' ');
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        double double6 = point2.y;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1L));
        point2.x = 1.0f;
        point2.y = '#';
        point2.y = (byte) 1;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (short) -1);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        double double3 = point2.y;
        point2.y = (-1.0d);
        double double6 = point2.x;
        point2.y = (-1.0f);
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = (byte) -1;
        point2.y = 0.0d;
        point2.x = 0L;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (byte) 1;
        point2.x = 1L;
        point2.y = (byte) 10;
        point2.x = (short) 100;
        point2.y = '#';
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        point2.y = ' ';
        point2.y = 35.0d;
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 100L);
        point2.x = 10L;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        double double4 = point2.y;
        point2.x = (short) -1;
        point2.y = 10;
        double double9 = point2.x;
        point2.y = (short) 10;
        double double12 = point2.y;
        point2.x = 100.0f;
        double double15 = point2.x;
        double double16 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        fetchers.Point point2 = new fetchers.Point((double) 1, 97.0d);
        double double3 = point2.y;
        point2.y = 1;
        point2.x = 100.0f;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 1L);
        double double3 = point2.x;
        point2.y = (-1L);
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.x = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = (-1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        double double16 = point2.y;
        point2.y = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        fetchers.Point point2 = new fetchers.Point(35.0d, (double) (short) 100);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) ' ');
        point2.y = (byte) 100;
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) '4');
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 0);
        point2.x = ' ';
        point2.x = 1;
        point2.y = (-1L);
        double double9 = point2.y;
        point2.x = 1.0d;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 1.0f);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 97.0d;
        double double10 = point2.x;
        double double11 = point2.x;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 97.0d + "'", double12 == 97.0d);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.x;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.y = 100L;
        double double14 = point2.x;
        double double15 = point2.x;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (byte) 0);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = (byte) 1;
        point2.y = 0.0d;
        point2.y = 32.0d;
        double double10 = point2.x;
        double double11 = point2.x;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (short) 100);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
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
        point2.y = 0.0f;
        double double18 = point2.x;
        java.lang.Class<?> wildcardClass19 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 35.0d + "'", double18 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        point2.y = 0.0d;
        point2.y = (byte) 10;
        point2.y = 35.0d;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (short) -1);
        point2.y = 1.0f;
    }
}

