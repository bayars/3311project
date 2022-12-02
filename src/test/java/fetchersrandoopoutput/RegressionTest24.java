package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '#';
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = ' ';
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        fetchers.Point point2 = new fetchers.Point(52.0d, 1.0d);
        point2.y = (short) 10;
        point2.y = 10.0f;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 100.0f;
        double double7 = point2.y;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 1);
        point2.y = (short) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, 97.0d);
        double double3 = point2.y;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) 0);
        double double3 = point2.x;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100L);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        fetchers.Point point2 = new fetchers.Point((double) 10, 32.0d);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        fetchers.Point point2 = new fetchers.Point((double) 100, (-1.0d));
        double double3 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 97.0d);
        point2.y = 10.0f;
        point2.y = 'a';
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.y = 100.0d;
        double double11 = point2.y;
        point2.x = 1.0f;
        point2.y = 0.0f;
        point2.x = 1.0f;
        point2.x = 97.0d;
        java.lang.Class<?> wildcardClass20 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (short) -1);
        point2.x = (short) -1;
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) (short) 10);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.x;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 10.0d;
        point2.y = 0.0d;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) '#');
        point2.y = (byte) 1;
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        fetchers.Point point2 = new fetchers.Point(35.0d, 97.0d);
        double double3 = point2.y;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        fetchers.Point point2 = new fetchers.Point(52.0d, 32.0d);
        point2.x = (-1L);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) -1);
        double double3 = point2.y;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        point2.y = ' ';
        double double14 = point2.y;
        double double15 = point2.x;
        point2.x = (byte) 10;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (-1.0f));
        point2.x = 0.0d;
        point2.y = (-1.0d);
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 0.0f);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 1L;
        point2.y = 0.0d;
        point2.x = 1.0f;
        point2.y = 100L;
        double double19 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        point2.y = 100L;
        point2.y = (short) 1;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (short) 1);
        point2.x = 1.0d;
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.y = 10;
        point2.x = (short) 0;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (-1));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        point2.x = (short) -1;
        point2.y = ' ';
        point2.x = 1.0d;
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (short) 10;
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = (byte) 100;
        point2.x = 35.0d;
        double double12 = point2.x;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '#');
        double double3 = point2.y;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 32.0d;
        point2.y = 0;
        point2.y = (short) 0;
        point2.y = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 1);
        point2.y = 100.0d;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.x = 'a';
        point2.x = (byte) 0;
        point2.x = 10.0f;
        double double9 = point2.x;
        double double10 = point2.y;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (-1));
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (-1.0f));
        point2.y = 0L;
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1.0d;
        double double7 = point2.y;
        point2.y = 52.0d;
        point2.y = 0.0d;
        double double12 = point2.x;
        double double13 = point2.x;
        point2.x = 1.0f;
        double double16 = point2.x;
        point2.y = (short) -1;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 1;
        point2.x = 100.0f;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        fetchers.Point point2 = new fetchers.Point(52.0d, 0.0d);
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) (-1));
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.y = 100.0f;
        double double10 = point2.x;
        point2.x = '#';
        point2.x = '4';
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        double double5 = point2.y;
        point2.y = 0.0d;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) (short) -1);
        point2.y = 100.0f;
        point2.x = 10.0d;
        point2.x = ' ';
        point2.y = (short) 0;
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        point2.y = 100;
        point2.x = 100L;
        double double11 = point2.x;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 100L);
        point2.y = 0;
        point2.y = 10.0f;
        double double7 = point2.y;
        point2.y = 100.0d;
        point2.y = 10.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) '#');
        point2.x = 'a';
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        point2.x = (short) 10;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.x = 52.0d;
        point2.y = (short) 0;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.y = '#';
        point2.y = 100L;
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        point2.x = 100;
        double double7 = point2.y;
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) ' ');
        point2.x = (byte) 0;
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.x = 0.0f;
        point2.y = 100;
        point2.y = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = (-1.0d);
        point2.y = 100;
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (short) -1);
        point2.y = '#';
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1.0f));
        point2.y = 0.0d;
        double double5 = point2.y;
        point2.x = 10.0f;
        point2.y = (-1L);
        point2.y = (-1L);
        double double12 = point2.y;
        point2.x = 32.0d;
        point2.y = 35.0d;
        double double17 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) 10);
        point2.y = 97.0d;
        point2.x = 10.0d;
        point2.y = 100.0f;
        double double9 = point2.y;
        point2.x = 10.0d;
        double double12 = point2.y;
        point2.y = 1.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        fetchers.Point point2 = new fetchers.Point(52.0d, 0.0d);
        point2.y = 0.0d;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.y;
        point2.x = 1.0d;
        point2.y = 1.0f;
        point2.x = 100.0f;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (byte) 1;
        point2.x = 1L;
        point2.x = 0.0d;
        double double10 = point2.y;
        point2.x = (byte) 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 10.0d);
        point2.y = 0.0d;
        point2.y = 1;
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        double double3 = point2.y;
        point2.x = 0.0f;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = (short) -1;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        fetchers.Point point2 = new fetchers.Point((double) 10L, 32.0d);
        point2.x = 10L;
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = (byte) 1;
        double double5 = point2.y;
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        double double10 = point2.y;
        double double11 = point2.y;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        fetchers.Point point2 = new fetchers.Point((double) '#', (-1.0d));
        point2.y = 1L;
        point2.x = (-1.0f);
        double double7 = point2.x;
        point2.y = 100.0f;
        double double10 = point2.y;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        point2.x = (byte) 1;
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (short) 10);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 10.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        point2.y = (short) 0;
        point2.y = 0;
        double double8 = point2.y;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.x = (-1.0d);
        point2.x = 97.0d;
        point2.x = (byte) 1;
        point2.y = 100L;
        double double13 = point2.y;
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0);
        double double3 = point2.x;
        point2.y = ' ';
        double double6 = point2.x;
        double double7 = point2.x;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (short) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        double double13 = point2.x;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        fetchers.Point point2 = new fetchers.Point(10.0d, (-1.0d));
        double double3 = point2.y;
        point2.y = 10;
        point2.y = 0.0d;
        point2.y = 100;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = (-1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = (short) 100;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        point2.x = 0.0f;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 1.0f);
        point2.y = 10;
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.x = 32.0d;
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, 35.0d);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        double double12 = point2.x;
        point2.x = 100;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = '#';
        double double5 = point2.x;
        point2.x = (byte) 10;
        point2.y = (short) -1;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.x = (byte) -1;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
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
        point2.x = 1.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 0L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        point2.y = (-1L);
        double double5 = point2.y;
        point2.x = (-1L);
        point2.x = 1;
        point2.y = 10;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (short) 1);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) (-1L));
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (short) -1);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 10);
        point2.x = (byte) 0;
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = (byte) 100;
        point2.x = (short) 100;
        point2.y = (-1.0f);
        point2.x = (-1.0d);
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 1;
        point2.x = 0L;
        point2.x = 100;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1L);
        point2.y = 10.0f;
        point2.x = '#';
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        double double6 = point2.y;
        point2.y = (byte) 10;
        double double9 = point2.y;
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        fetchers.Point point2 = new fetchers.Point((double) ' ', 10.0d);
        point2.x = (byte) 10;
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = (short) 100;
        point2.x = 100.0d;
        double double9 = point2.y;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), 52.0d);
        double double3 = point2.y;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.x = (short) -1;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
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
        java.lang.Class<?> wildcardClass16 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        fetchers.Point point2 = new fetchers.Point(32.0d, 10.0d);
        point2.x = 0.0d;
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (-1.0f));
        point2.x = '#';
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 1);
        point2.y = (-1.0d);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = (byte) -1;
        point2.x = (short) 10;
        point2.x = '4';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (short) 1);
        point2.y = 10L;
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 1;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 10L;
        double double7 = point2.x;
        double double8 = point2.y;
        point2.x = 100;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (byte) 10);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) '#');
        point2.y = '#';
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        fetchers.Point point2 = new fetchers.Point((double) ' ', 10.0d);
        point2.x = 35.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0L);
        double double3 = point2.x;
        point2.y = 10.0f;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) 10L);
        point2.x = 1L;
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) (short) 1);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        fetchers.Point point2 = new fetchers.Point((double) 10L, 10.0d);
        point2.y = 35.0d;
        point2.y = 1.0f;
        point2.y = ' ';
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) (short) -1);
        point2.y = (byte) 0;
        point2.y = ' ';
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) '4');
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = (byte) 100;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 0.0d);
        point2.y = 1.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        point2.y = 100;
        point2.x = 100L;
        double double11 = point2.x;
        point2.x = ' ';
        point2.y = (short) 1;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) 100);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 100.0f);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = 0L;
        double double5 = point2.x;
        point2.y = 97.0d;
        double double8 = point2.x;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.y;
        point2.x = 1.0d;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        point2.y = ' ';
        point2.y = 100L;
        point2.y = 0.0d;
        point2.y = '4';
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        point2.y = 10.0d;
        point2.x = 10;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 35.0d;
        point2.x = (byte) 1;
        point2.x = 52.0d;
        point2.y = (byte) 10;
        point2.y = 0;
        double double18 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) '4');
        double double3 = point2.y;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = (byte) -1;
        point2.x = (short) 10;
        point2.y = (short) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (-1.0d);
        point2.x = '#';
        point2.y = 100.0d;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, 52.0d);
        double double3 = point2.y;
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        point2.x = 10.0f;
        point2.y = 'a';
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.x = (byte) 100;
        double double10 = point2.y;
        double double11 = point2.x;
        point2.y = (-1L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        point2.x = (byte) 10;
        double double7 = point2.y;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 100.0f);
        double double3 = point2.y;
        point2.x = (short) -1;
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        fetchers.Point point2 = new fetchers.Point(52.0d, (-1.0d));
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), 10.0d);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) 100;
        point2.y = 0.0d;
        point2.x = 10.0f;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (byte) 1);
        point2.x = 1;
        double double5 = point2.x;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, 10.0d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = '4';
        double double9 = point2.y;
        double double10 = point2.y;
        point2.x = 100L;
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) 0.0f);
        point2.x = 0.0d;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        point2.x = '#';
        point2.x = '#';
        point2.x = 100.0f;
        point2.x = (short) 0;
        point2.y = 32.0d;
        point2.y = 10.0f;
        double double21 = point2.x;
        double double22 = point2.x;
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.x = 97.0d;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 1.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 'a';
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        point2.y = 1;
        double double14 = point2.y;
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.y = 52.0d;
        point2.x = 0.0d;
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        point2.x = 'a';
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (short) 1);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        point2.y = 0.0d;
        double double7 = point2.y;
        point2.y = 10L;
        point2.x = (short) -1;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.x = (-1L);
        double double10 = point2.y;
        double double11 = point2.y;
        point2.x = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        double double19 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 10);
        point2.x = (byte) 0;
        point2.x = 10L;
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 100.0d);
        point2.y = 1;
        point2.y = (short) 100;
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        double double5 = point2.x;
        point2.x = 0.0d;
        point2.y = 0.0d;
        double double10 = point2.x;
        point2.y = 100.0f;
        point2.x = (byte) -1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        point2.x = (short) -1;
        double double7 = point2.x;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 1);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        point2.x = 1L;
        double double5 = point2.x;
        double double6 = point2.y;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = (short) 1;
        point2.x = 10L;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        fetchers.Point point2 = new fetchers.Point((double) 1, 97.0d);
        point2.x = 10.0f;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        fetchers.Point point2 = new fetchers.Point((double) 1L, 100.0d);
        point2.y = (-1L);
        point2.y = (short) 1;
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (-1));
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (-1.0f));
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.x = 32.0d;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        double double12 = point2.x;
        point2.x = 100;
        point2.x = 97.0d;
        double double17 = point2.x;
        double double18 = point2.x;
        double double19 = point2.y;
        double double20 = point2.y;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 32.0d + "'", double19 == 32.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        fetchers.Point point2 = new fetchers.Point((double) '4', 10.0d);
        point2.y = (byte) 10;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        fetchers.Point point2 = new fetchers.Point((double) 100, (-1.0d));
        point2.y = (byte) 1;
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        point2.y = 0L;
        point2.x = (-1L);
        point2.y = 97.0d;
        point2.x = 100.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        point2.x = (-1.0d);
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 35.0d + "'", double14 == 35.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.x = (byte) 100;
        double double10 = point2.y;
        double double11 = point2.x;
        double double12 = point2.x;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.y = ' ';
        double double8 = point2.x;
        double double9 = point2.x;
        point2.y = 0;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) '4');
        double double3 = point2.y;
        point2.x = 'a';
        double double6 = point2.x;
        point2.x = (-1.0d);
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        point2.y = 52.0d;
        double double6 = point2.y;
        point2.x = (-1.0d);
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 100);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
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
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 100L);
        point2.x = 10L;
        point2.y = (short) 100;
        point2.x = 1.0d;
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (byte) 10);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 10;
        double double7 = point2.x;
        point2.y = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.x;
        double double7 = point2.y;
        point2.y = 35.0d;
        point2.x = (byte) 1;
        point2.x = 52.0d;
        point2.y = (byte) 10;
        point2.y = 0;
        double double18 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        double double17 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (byte) -1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.x;
        point2.x = (short) -1;
        point2.x = 100L;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.y;
        point2.x = (short) 1;
        double double6 = point2.x;
        point2.x = 0.0d;
        point2.y = 0;
        point2.y = 10.0d;
        point2.x = 10.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 1.0f;
        point2.y = (-1L);
        point2.x = (-1);
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '#');
        point2.x = (byte) 100;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (short) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 0.0d;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = 10.0f;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, 35.0d);
        point2.y = (byte) 100;
        point2.y = 100;
        point2.x = 10L;
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) 'a');
        point2.x = (byte) -1;
        point2.x = 10L;
        point2.y = (-1.0f);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 1;
        point2.y = 100.0f;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        point2.x = 100L;
        point2.y = 1;
        double double7 = point2.x;
        point2.y = 1.0d;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 0.0f);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) (short) -1);
        point2.y = 1L;
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (-1.0f));
        point2.x = 0;
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (-1.0f));
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 1.0d);
        double double3 = point2.x;
        point2.x = 97.0d;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.x = 1;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = 0L;
        double double5 = point2.x;
        point2.x = 1.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 1L);
        point2.y = 0.0f;
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        fetchers.Point point2 = new fetchers.Point((double) 1, 0.0d);
        double double3 = point2.x;
        point2.y = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
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
        double double16 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 0.0f);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (byte) 1);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = (byte) -1;
        point2.x = 0.0d;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) 'a');
        point2.x = 100;
        point2.x = 100.0d;
        point2.x = 100.0d;
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 10);
        point2.x = 35.0d;
        point2.y = 100L;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        double double8 = point2.y;
        point2.x = 35.0d;
        double double11 = point2.y;
        double double12 = point2.y;
        java.lang.Class<?> wildcardClass13 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0L);
        point2.y = 1L;
        double double5 = point2.y;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) (short) 100);
        point2.x = 100.0d;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        fetchers.Point point2 = new fetchers.Point((double) 0L, 35.0d);
        point2.x = 0.0d;
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.y = (short) 100;
        double double9 = point2.y;
        point2.x = 100;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = '#';
        double double5 = point2.x;
        point2.x = (byte) 10;
        point2.y = (short) -1;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        point2.y = 0.0d;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        fetchers.Point point2 = new fetchers.Point((double) '4', 32.0d);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) '#');
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        point2.x = 100;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 1);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 100);
        point2.x = 35.0d;
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 1.0f;
        double double9 = point2.y;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 10L);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 35.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, 0.0d);
        point2.y = (short) 100;
        point2.x = '#';
        point2.x = 100.0d;
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        point2.x = (byte) 10;
        double double5 = point2.x;
        point2.y = '#';
        double double8 = point2.x;
        double double9 = point2.x;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) 1);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) '#');
        point2.x = '#';
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        point2.x = 0.0f;
        double double5 = point2.y;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.y = (short) 1;
        point2.y = 0.0d;
        point2.x = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        point2.y = ' ';
        point2.x = (short) 0;
        point2.y = 0.0d;
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, 32.0d);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 10);
        double double3 = point2.y;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 'a');
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 10);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (-1);
        point2.y = (short) 0;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = 0;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        fetchers.Point point2 = new fetchers.Point(10.0d, 97.0d);
        point2.y = 1.0f;
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), 32.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        point2.y = 100L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) ' ');
        point2.y = (byte) 1;
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = 10L;
        point2.y = (-1.0f);
        point2.x = (byte) 0;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        double double12 = point2.y;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
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
        point2.y = 32.0d;
        double double18 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.y;
        point2.y = (byte) 1;
        double double11 = point2.y;
        double double12 = point2.x;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 1);
        double double3 = point2.y;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.x = (byte) 100;
        point2.y = 100;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100L);
        double double3 = point2.y;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        fetchers.Point point2 = new fetchers.Point((double) (-1), 52.0d);
        point2.x = 52.0d;
        point2.y = (short) 1;
        double double7 = point2.x;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.y = (-1);
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.x;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) 10.0f);
        double double3 = point2.y;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        double double3 = point2.x;
        point2.x = 100;
        point2.x = 1;
        point2.x = 32.0d;
        point2.x = 0L;
        point2.x = (short) 10;
        point2.y = (byte) -1;
        double double16 = point2.y;
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (byte) 10);
        double double3 = point2.y;
        point2.y = '4';
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 0);
        double double3 = point2.y;
        point2.y = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.x = 1;
        point2.x = 1;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) (-1L));
        point2.y = 0.0f;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 0);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.x = '#';
        double double9 = point2.x;
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (byte) 1);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) '#');
        point2.x = 'a';
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (short) 1);
        point2.x = 10.0d;
        point2.y = (-1.0f);
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        double double3 = point2.x;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = 0L;
        point2.x = (short) 100;
        double double7 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) (short) 10);
        point2.x = 35.0d;
        point2.y = 100L;
        point2.x = 100.0f;
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (-1.0f));
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) 10L);
        point2.y = 1.0f;
        point2.x = 0.0d;
        double double7 = point2.y;
        point2.y = (short) 100;
        double double10 = point2.x;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.y = (-1L);
        point2.y = 10.0d;
        point2.x = 52.0d;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        point2.y = (short) 1;
        point2.y = (short) 0;
        point2.y = (short) 100;
        point2.y = (short) 100;
        double double12 = point2.y;
        double double13 = point2.x;
        point2.x = 100;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 0.0f;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        point2.x = 100.0f;
        double double12 = point2.y;
        double double13 = point2.x;
        point2.y = 1;
        point2.y = 0L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        fetchers.Point point2 = new fetchers.Point((double) 100L, 1.0d);
        point2.x = (byte) 0;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (-1.0d));
        point2.x = '4';
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) (-1.0f));
        point2.x = 100L;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        fetchers.Point point2 = new fetchers.Point(35.0d, (double) 1L);
        point2.y = (short) 1;
        point2.y = (short) 1;
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
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
        double double16 = point2.y;
        double double17 = point2.x;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1L;
        point2.y = 10.0f;
        point2.x = (short) 0;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (short) 0);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 100);
        double double3 = point2.x;
        point2.y = 10.0d;
        point2.x = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = (short) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        fetchers.Point point2 = new fetchers.Point((double) '#', 1.0d);
        point2.y = 1L;
        double double5 = point2.y;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        double double3 = point2.y;
        double double4 = point2.y;
        point2.y = (short) 100;
        point2.y = 0.0d;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 10.0d);
        point2.x = 10L;
        point2.x = (byte) 1;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) (short) -1);
        point2.y = 1L;
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 0L);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 0.0f);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        point2.x = 10.0d;
        point2.y = (byte) 1;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) (-1L));
        point2.x = 0.0f;
        point2.x = (short) 100;
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) 10);
        point2.y = (byte) -1;
        point2.y = 97.0d;
        point2.y = (-1.0d);
        double double9 = point2.y;
        double double10 = point2.x;
        double double11 = point2.y;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = (byte) -1;
        point2.x = (short) 10;
        double double13 = point2.x;
        point2.y = 1;
        double double16 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        point2.y = (byte) -1;
        double double5 = point2.y;
        double double6 = point2.x;
        double double7 = point2.y;
        double double8 = point2.x;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 1;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = '#';
        point2.x = 97.0d;
        double double12 = point2.y;
        double double13 = point2.x;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 1;
        point2.x = 10.0f;
        point2.y = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        fetchers.Point point2 = new fetchers.Point((double) 100, 35.0d);
        double double3 = point2.y;
        point2.y = 52.0d;
        point2.y = (short) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        double double9 = point2.x;
        point2.y = 35.0d;
        double double12 = point2.y;
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 35.0d + "'", double13 == 35.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = (byte) -1;
        point2.x = 0.0d;
        double double10 = point2.x;
        point2.y = (short) 1;
        double double13 = point2.x;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = (byte) 10;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.x = 10L;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        fetchers.Point point2 = new fetchers.Point((double) (-1.0f), (double) 10);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (-1.0f));
        double double3 = point2.x;
        point2.x = (-1);
        point2.x = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        fetchers.Point point2 = new fetchers.Point((double) 1.0f, (double) 0L);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) (byte) -1);
        point2.x = 0;
        point2.y = (short) 1;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) 10L);
        point2.y = (short) 10;
        double double5 = point2.y;
        point2.x = 100.0f;
        double double8 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        fetchers.Point point2 = new fetchers.Point(35.0d, 97.0d);
        double double3 = point2.y;
        point2.y = (short) 100;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (short) 1);
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (-1.0d));
        point2.y = '#';
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 10L;
        point2.y = 1L;
        point2.x = 10.0f;
        point2.x = 0L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (byte) -1);
        double double3 = point2.x;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (byte) 0);
        point2.y = 97.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        double double7 = point2.y;
        double double8 = point2.x;
        double double9 = point2.y;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (short) 0);
        point2.y = 0.0d;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) (-1));
        point2.y = 1.0f;
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        double double11 = point2.y;
        double double12 = point2.y;
        double double13 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 10);
        point2.y = 10L;
        double double5 = point2.x;
        double double6 = point2.x;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = (byte) 10;
        point2.y = 100;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = 1.0d;
        double double9 = point2.y;
        point2.y = 0;
        point2.y = (byte) -1;
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (byte) 100);
        point2.x = (short) -1;
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        point2.y = 0.0f;
        point2.x = 10;
        double double7 = point2.y;
        double double8 = point2.y;
        double double9 = point2.y;
        point2.x = '4';
        double double12 = point2.x;
        point2.x = '#';
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (byte) -1);
        point2.x = 32.0d;
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (-1.0d);
        double double7 = point2.y;
        point2.y = 1;
        double double10 = point2.x;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) -1;
        point2.x = 35.0d;
        double double12 = point2.x;
        point2.y = 10.0f;
        point2.y = 1.0d;
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1L);
        point2.y = 10.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        double double8 = point2.x;
        point2.y = '4';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        fetchers.Point point2 = new fetchers.Point((double) 1, (double) (byte) 100);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = ' ';
        point2.y = 32.0d;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = 0;
        point2.y = (-1.0f);
        double double13 = point2.y;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        fetchers.Point point2 = new fetchers.Point(1.0d, 97.0d);
        point2.y = ' ';
        double double5 = point2.x;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 1;
        point2.x = 0L;
        double double9 = point2.y;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        point2.x = (byte) 0;
        point2.y = (short) 0;
        point2.x = 100.0d;
        point2.x = (byte) 10;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 100.0f);
        point2.y = 100L;
        double double5 = point2.x;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (-1.0d));
        double double3 = point2.x;
        double double4 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        point2.x = 'a';
        point2.x = 97.0d;
        point2.y = (byte) -1;
        point2.y = 0L;
        double double16 = point2.x;
        double double17 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.x;
        double double7 = point2.x;
        point2.y = 97.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        point2.y = 0L;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        fetchers.Point point2 = new fetchers.Point(32.0d, 35.0d);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        point2.x = 1L;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (-1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) -1);
        point2.y = 0;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 10L);
        point2.y = (short) 10;
        double double5 = point2.y;
        double double6 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        double double5 = point2.y;
        point2.y = 10.0f;
        double double8 = point2.x;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) '#');
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) (byte) 10);
        point2.y = 10;
        point2.y = (short) 100;
        point2.x = 100.0d;
        double double9 = point2.x;
        point2.y = 32.0d;
        double double12 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 10L);
        point2.x = 100.0d;
        double double5 = point2.y;
        point2.x = (short) 0;
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        point2.y = 1L;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, 10.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        point2.y = 1.0f;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 1;
        point2.x = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        fetchers.Point point2 = new fetchers.Point((double) 1L, 0.0d);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        point2.x = 'a';
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
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) -1);
        point2.y = (byte) 10;
        point2.x = (byte) 100;
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        point2.x = (short) -1;
        point2.x = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) '4');
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 10.0d;
        double double7 = point2.y;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        point2.y = (short) 100;
        point2.x = 0.0f;
        java.lang.Class<?> wildcardClass20 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) (byte) 10);
        point2.y = 'a';
        point2.x = 100L;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) '#');
        double double3 = point2.x;
        point2.y = 10;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 1.0d;
        double double7 = point2.y;
        point2.y = 0.0d;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        point2.x = 100;
        point2.y = ' ';
        point2.x = '#';
        double double11 = point2.y;
        point2.y = ' ';
        point2.y = '4';
        point2.x = (short) 10;
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 32.0d + "'", double11 == 32.0d);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, 0.0d);
        point2.x = 100.0f;
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        point2.y = (byte) -1;
        point2.x = 1;
        java.lang.Class<?> wildcardClass17 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) ' ');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 52.0d;
        point2.y = ' ';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        fetchers.Point point2 = new fetchers.Point((double) 1L, 100.0d);
        point2.x = 10.0d;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) (byte) 1);
        double double3 = point2.y;
        point2.y = 0L;
        double double6 = point2.y;
        double double7 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = (byte) 10;
        double double9 = point2.x;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (byte) 1;
        point2.x = '4';
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.y = 100;
        point2.y = '#';
        double double10 = point2.y;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) (byte) 1);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) (byte) -1);
        double double3 = point2.x;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) 10);
        point2.x = (-1);
        point2.y = 0L;
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        double double10 = point2.x;
        double double11 = point2.y;
        point2.x = (-1.0d);
        double double14 = point2.y;
        point2.x = (short) 1;
        double double17 = point2.x;
        point2.y = (short) 0;
        java.lang.Class<?> wildcardClass20 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        fetchers.Point point2 = new fetchers.Point((double) 'a', (double) ' ');
        point2.x = (byte) 0;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = 100;
        double double7 = point2.y;
        point2.y = (short) 100;
        point2.x = 0.0d;
        point2.x = 0.0f;
        point2.x = 10L;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        double double17 = point2.x;
        double double18 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 97.0d + "'", double17 == 97.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 97.0d + "'", double18 == 97.0d);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        fetchers.Point point2 = new fetchers.Point((-1.0d), 52.0d);
        point2.y = 0.0d;
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, 0.0d);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = 97.0d;
        point2.y = (byte) 0;
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        fetchers.Point point2 = new fetchers.Point(100.0d, (double) 1);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 0);
        point2.y = (byte) -1;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (short) 1);
        point2.y = (byte) 1;
        double double5 = point2.y;
        point2.x = 1L;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) (-1.0f));
        double double3 = point2.x;
        double double4 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = (-1.0d);
        double double5 = point2.x;
        point2.y = 10.0d;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0.0f);
        point2.y = ' ';
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) ' ');
        point2.y = (byte) 1;
        double double5 = point2.x;
        point2.x = 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        point2.x = (short) 100;
        double double10 = point2.x;
        double double11 = point2.x;
        point2.x = 0.0d;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = (-1.0d);
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) 0);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        point2.y = 'a';
        double double8 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        point2.x = 0.0d;
        double double9 = point2.y;
        double double10 = point2.x;
        point2.y = (-1L);
        double double13 = point2.x;
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        fetchers.Point point2 = new fetchers.Point((-1.0d), (double) 10L);
        point2.y = 1.0d;
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) ' ');
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 32.0d;
        point2.y = 0;
        double double9 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.y = 52.0d;
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.y = 0.0f;
        point2.y = 1L;
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) (byte) 100);
        point2.x = '4';
        point2.x = (byte) 1;
        point2.y = 100.0f;
        double double9 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, 97.0d);
        point2.x = (-1.0d);
        double double5 = point2.y;
        point2.y = 35.0d;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = (byte) -1;
        point2.y = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 10;
        point2.y = 10.0d;
        point2.x = 1.0f;
        double double9 = point2.y;
        double double10 = point2.y;
        point2.y = 1;
        double double13 = point2.y;
        double double14 = point2.y;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        fetchers.Point point2 = new fetchers.Point((double) 100L, (double) (short) 100);
        double double3 = point2.y;
        point2.x = (byte) 100;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        fetchers.Point point2 = new fetchers.Point((double) '4', (double) (-1));
        point2.x = 52.0d;
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        point2.y = 35.0d;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 35.0d + "'", double11 == 35.0d);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1.0f);
        point2.y = (-1.0f);
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.x = 1L;
        double double8 = point2.y;
        point2.x = 35.0d;
        double double11 = point2.y;
        point2.x = (byte) -1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) 100);
        point2.x = (byte) 0;
        double double5 = point2.x;
        double double6 = point2.x;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 0);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.y = 0.0f;
        double double7 = point2.x;
        point2.y = 100;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) 100);
        point2.x = 1;
        point2.x = '4';
        point2.y = (byte) 10;
        double double9 = point2.x;
        point2.y = 10.0d;
        double double12 = point2.x;
        point2.x = 0.0d;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        fetchers.Point point2 = new fetchers.Point(0.0d, (double) 100);
        double double3 = point2.x;
        double double4 = point2.x;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (-1.0d));
        point2.x = 100L;
        double double5 = point2.x;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        fetchers.Point point2 = new fetchers.Point(97.0d, (double) (short) 1);
        double double3 = point2.y;
        point2.x = 100.0d;
        point2.x = 'a';
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) 'a');
        point2.y = (short) 10;
        double double5 = point2.y;
        point2.y = 10.0d;
        point2.x = 100.0d;
        point2.x = 0.0f;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.x;
        point2.y = 10;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 0.0d;
        point2.x = '4';
        point2.x = 0.0f;
        point2.x = (byte) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (short) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) 10);
        double double3 = point2.x;
        double double4 = point2.y;
        double double5 = point2.y;
        point2.y = (short) 100;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.y = 100;
        point2.y = 100L;
        point2.x = '#';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.x = 0.0f;
        double double8 = point2.x;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = '#';
        point2.x = 0.0d;
        point2.y = 1.0f;
        point2.y = 35.0d;
        double double14 = point2.x;
        double double15 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.y = (short) 1;
        double double10 = point2.y;
        point2.x = 35.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        fetchers.Point point2 = new fetchers.Point(1.0d, (double) 100);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 100;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = 0.0f;
        point2.y = 'a';
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        double double16 = point2.y;
        point2.x = (byte) 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        fetchers.Point point2 = new fetchers.Point((double) '4', 35.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.x = 35.0d;
        point2.y = 0.0d;
        double double9 = point2.x;
        double double10 = point2.x;
        point2.y = (short) -1;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 35.0d + "'", double10 == 35.0d);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 1L);
        double double3 = point2.x;
        point2.y = 100L;
        java.lang.Class<?> wildcardClass6 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 0;
        double double8 = point2.y;
        point2.x = 'a';
        java.lang.Class<?> wildcardClass11 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        point2.y = 1.0f;
        double double8 = point2.y;
        point2.x = (-1);
        point2.x = 1L;
        double double13 = point2.x;
        double double14 = point2.y;
        double double15 = point2.x;
        point2.y = 52.0d;
        java.lang.Class<?> wildcardClass18 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 100);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (short) -1);
        point2.x = 0.0d;
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        fetchers.Point point2 = new fetchers.Point((double) '#', (double) 1.0f);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        fetchers.Point point2 = new fetchers.Point(0.0d, 35.0d);
        point2.x = 100.0f;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        fetchers.Point point2 = new fetchers.Point((double) (short) 1, (double) 1L);
        point2.y = 10.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.x = (byte) -1;
        double double9 = point2.y;
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        fetchers.Point point2 = new fetchers.Point((double) (short) -1, (double) (-1));
        double double3 = point2.x;
        double double4 = point2.x;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1);
        point2.x = 0L;
        point2.y = 35.0d;
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 10);
        double double3 = point2.y;
        point2.x = 10.0f;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (short) 1);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) '4');
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = 10L;
        point2.y = 1L;
        point2.x = (byte) 0;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        fetchers.Point point2 = new fetchers.Point((double) (-1), (double) (-1.0f));
        point2.y = 0.0d;
        point2.x = 1.0d;
        double double7 = point2.x;
        java.lang.Class<?> wildcardClass8 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100);
        point2.y = (-1);
        point2.x = (byte) 100;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (-1.0d));
        point2.y = (short) 100;
        point2.x = (byte) 10;
        double double7 = point2.y;
        point2.x = 0.0d;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        point2.x = 10;
        point2.y = 1.0f;
        point2.y = 0.0d;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) (short) 10);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        fetchers.Point point2 = new fetchers.Point((double) '4', 100.0d);
        double double3 = point2.y;
        double double4 = point2.y;
        java.lang.Class<?> wildcardClass5 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 10.0f);
        double double3 = point2.x;
        point2.x = 10.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 100.0d);
        double double3 = point2.x;
        point2.y = 1L;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '#');
        point2.y = (-1);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (-1.0d));
        double double3 = point2.x;
        point2.x = 0.0d;
        point2.y = 0.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = (byte) -1;
        point2.x = (short) 1;
        point2.x = 35.0d;
        double double12 = point2.x;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 35.0d + "'", double12 == 35.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = (byte) -1;
        point2.x = 1;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 100.0f);
        point2.x = 0;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        double double6 = point2.y;
        point2.y = '4';
        point2.x = (short) 100;
        double double11 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) (byte) 1);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        double double5 = point2.y;
        double double6 = point2.y;
        double double7 = point2.y;
        point2.x = (-1);
        point2.x = 0;
        point2.y = (-1L);
        double double14 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        double double16 = point2.y;
        point2.x = 52.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 32.0d + "'", double16 == 32.0d);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 1, (double) 100);
        point2.x = (byte) 0;
        point2.y = 0.0f;
        point2.x = 0;
        double double9 = point2.y;
        double double10 = point2.x;
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        point2.y = 0.0d;
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 0L);
        point2.x = (byte) 0;
        double double5 = point2.y;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0d;
        double double5 = point2.x;
        double double6 = point2.y;
        double double7 = point2.x;
        point2.x = '4';
        java.lang.Class<?> wildcardClass10 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) 0.0f);
        point2.x = (byte) 1;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = (short) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        fetchers.Point point2 = new fetchers.Point((double) 100, (double) 'a');
        point2.y = 0.0d;
        double double5 = point2.x;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        fetchers.Point point2 = new fetchers.Point((double) 0.0f, (double) 100.0f);
        double double3 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        fetchers.Point point2 = new fetchers.Point(0.0d, 32.0d);
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, 0.0d);
        point2.y = ' ';
        point2.y = 100L;
        point2.y = 0.0d;
        java.lang.Class<?> wildcardClass9 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        point2.y = (-1L);
        point2.y = 10.0d;
        point2.x = 52.0d;
        point2.y = 100.0f;
        point2.x = (byte) 10;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        fetchers.Point point2 = new fetchers.Point((double) 10, (double) 1.0f);
        point2.x = (short) 1;
        double double5 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.x = (byte) 100;
        double double7 = point2.y;
        double double8 = point2.y;
        point2.x = 100L;
        point2.y = 0.0d;
        point2.y = (-1L);
        double double15 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        fetchers.Point point2 = new fetchers.Point((double) ' ', (double) 1L);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        fetchers.Point point2 = new fetchers.Point((double) (byte) -1, (double) '4');
        double double3 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.x = (short) 0;
        point2.y = (short) 1;
        double double9 = point2.x;
        double double10 = point2.x;
        double double11 = point2.x;
        java.lang.Class<?> wildcardClass12 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) 1);
        double double3 = point2.y;
        double double4 = point2.x;
        point2.y = (-1);
        point2.y = (short) 100;
        point2.y = (byte) 0;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 10, (double) '#');
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        fetchers.Point point2 = new fetchers.Point(52.0d, (double) 100L);
        double double3 = point2.y;
        point2.x = (short) -1;
        double double6 = point2.y;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        fetchers.Point point2 = new fetchers.Point(52.0d, 1.0d);
        point2.y = (short) 10;
        point2.x = 10.0d;
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) '4');
        point2.y = (short) 0;
        point2.y = 100.0f;
        double double7 = point2.x;
        point2.y = 1L;
        point2.y = (short) 1;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.y = 1;
        double double8 = point2.x;
        point2.x = (-1.0f);
        double double11 = point2.x;
        double double12 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        fetchers.Point point2 = new fetchers.Point((double) (-1L), (double) (byte) 10);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.y;
        double double6 = point2.x;
        point2.y = 0.0d;
        point2.y = 10L;
        point2.x = 0;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 1);
        point2.x = 1L;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = 0.0d;
        point2.x = (byte) -1;
        point2.y = '#';
        double double13 = point2.x;
        java.lang.Class<?> wildcardClass14 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        fetchers.Point point2 = new fetchers.Point((double) 1L, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = 10L;
        java.lang.Class<?> wildcardClass7 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        fetchers.Point point2 = new fetchers.Point((double) (short) 100, (double) 0.0f);
        double double3 = point2.x;
        double double4 = point2.y;
        point2.x = 10L;
        point2.y = 0.0d;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        fetchers.Point point2 = new fetchers.Point((double) 1, 97.0d);
        point2.y = (byte) 100;
        point2.y = (byte) -1;
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 1;
        point2.x = 0L;
        point2.x = '4';
        point2.y = 97.0d;
        double double13 = point2.x;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 0, (double) (byte) -1);
        double double3 = point2.x;
        double double4 = point2.x;
        point2.y = (short) 1;
        point2.x = 0L;
        double double9 = point2.y;
        point2.y = 97.0d;
        point2.y = 1.0f;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        fetchers.Point point2 = new fetchers.Point((double) 10L, (double) (byte) -1);
        point2.x = 1L;
        double double5 = point2.x;
        point2.x = 0.0d;
        point2.x = 97.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        fetchers.Point point2 = new fetchers.Point((double) 10.0f, (double) 0L);
        double double3 = point2.y;
        point2.x = 0.0d;
        point2.y = (byte) -1;
        point2.x = 0.0d;
        point2.y = (-1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        fetchers.Point point2 = new fetchers.Point((double) (short) 0, (double) '#');
        point2.x = 100L;
        double double5 = point2.y;
        point2.x = 1L;
        point2.x = 100.0d;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        fetchers.Point point2 = new fetchers.Point((double) 0L, (double) 10);
        point2.y = 10;
        double double5 = point2.y;
        double double6 = point2.y;
        point2.y = (-1.0d);
        double double9 = point2.y;
        double double10 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        fetchers.Point point2 = new fetchers.Point((double) (byte) 100, (double) ' ');
        point2.x = 1L;
        double double5 = point2.y;
        point2.y = (-1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 1);
        point2.x = 10.0f;
        point2.x = (byte) -1;
        point2.y = (short) 100;
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        fetchers.Point point2 = new fetchers.Point(32.0d, (double) (byte) 100);
        java.lang.Class<?> wildcardClass3 = point2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        fetchers.Point point2 = new fetchers.Point(10.0d, (double) 1L);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        fetchers.Point point2 = new fetchers.Point((double) 100.0f, (double) (short) 1);
        double double3 = point2.y;
        java.lang.Class<?> wildcardClass4 = point2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        fetchers.Point point2 = new fetchers.Point((double) (short) 10, (double) (byte) 100);
        point2.y = 0.0d;
        double double5 = point2.y;
        point2.y = 0.0d;
        double double8 = point2.x;
        point2.x = 0.0d;
        point2.y = (byte) 100;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        fetchers.Point point2 = new fetchers.Point((double) 0, (double) 0L);
        point2.y = 0.0f;
        double double5 = point2.x;
        point2.x = 0.0f;
        double double8 = point2.x;
        point2.y = 1.0d;
        double double11 = point2.y;
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
    }
}

