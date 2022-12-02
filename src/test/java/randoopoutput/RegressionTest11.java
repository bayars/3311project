package randoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        fetchers.Data data0 = new fetchers.Data();
        java.lang.Class<?> wildcardClass1 = data0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) (byte) 10, (int) (short) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) (byte) -1, (int) 'a', "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) ' ', (int) (byte) 10, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) (short) 10, (int) '#', "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) (short) 0, (int) ' ', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (byte) 10, (int) (byte) 10, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) '4', (int) (byte) 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) '4', (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) ' ', (int) (byte) 1, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) (byte) 0, (-1), "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", 10, (int) ' ', "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (short) 0, (int) '#', "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) '4', (int) (byte) 0, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", (-1), (int) (short) 0, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", 10, (int) 'a', "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json", 100, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) '#', (int) (byte) 1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json", 0, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) (byte) 10, (int) '#', "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json", (int) (short) 1, 1, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", (int) (short) 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", 0, (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) (byte) 10, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=10:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=10:0&format=json");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (byte) 100, 0, "");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json", (int) (byte) 100, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=10:0&format=json", (int) (byte) 0, 10, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json", (int) (byte) -1, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) ' ', (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json", (int) (short) -1, 1, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) (byte) 100, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json", (int) '#', (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=35:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=35:100&format=json");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) 'a', 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) (short) 0, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json", (int) (short) 100, (int) (byte) -1, "");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", (int) ' ', (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", (int) (byte) 100, (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) 'a', (int) (byte) 0, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", 100, 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json", (int) (byte) 100, 1, "hi!");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json", 100, (int) (byte) 100, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", 100, (int) '4', "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) (byte) -1, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", 0, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", 10, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", 0, (int) 'a', "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json");
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json", (int) '#', (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", 0, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) '#', 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", (-1), (int) (byte) 0, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("hi!", (int) (short) 1, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json", (int) '4', (int) (short) 0, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json", (int) '4', (int) (byte) 0, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", 0, (-1), "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) '#', (int) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) (byte) -1, (int) (byte) 0, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json", 0, (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json", (int) (byte) 0, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", (int) 'a', (int) (byte) 1, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", 0, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=0:0&format=json");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json", (int) (byte) -1, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json", (int) (byte) 10, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", 1, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) '4', (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json", (int) (short) 100, (int) (byte) 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) (short) 10, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) (byte) 1, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json", (int) (short) 100, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) (short) -1, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json", (int) '4', (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json", 10, (int) (short) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) (byte) 0, (int) (byte) 0, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) '#', (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) (short) 1, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) ' ', (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json", (int) (byte) -1, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json", (int) (byte) 10, (int) '4', "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json", (int) (byte) -1, (-1), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json", (int) (short) 10, (int) (byte) 100, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", (int) (byte) 10, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json", (int) (short) 0, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (-1), 0, "hi!");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=10:0&format=json", (int) ' ', (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=35:100&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json", (int) (short) -1, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (short) 0, 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", 1, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) (short) -1, 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json", (int) '4', (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json", (int) (short) 100, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", 0, 1, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) (short) 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json", (int) (byte) 100, (int) '#', "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=100:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=100:35&format=json");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", (int) '#', (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", 0, (int) '4', "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json", (int) (short) -1, (int) (short) -1, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json", (int) (short) 100, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (short) 100, (int) (byte) -1, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json", 0, (int) (short) 1, "");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json", 1, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json", (int) (byte) 10, (int) (short) 1, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json", (int) ' ', (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json", 100, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", 0, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json", (int) (byte) -1, 0, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json", (int) (short) 0, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) (byte) 10, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) ' ', (int) '#', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json", (int) '#', (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json", 10, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json", 1, 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json", 100, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json", 0, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) '#', (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (-1), (int) '#', "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json", (int) (short) -1, (int) (short) 100, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=-1:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=-1:100&format=json");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", 10, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=10:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=10:-1&format=json");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", 1, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json", 0, (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:1&format=json");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json", (int) (short) -1, (int) '#', "");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) ' ', (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) (short) 10, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=10:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=10:97&format=json");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json", (int) (byte) 10, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json", (-1), (int) (short) -1, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json", (int) (byte) -1, (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json", 1, (int) (byte) 1, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json", (int) (short) -1, (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", 0, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (byte) 0, 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json", (int) (short) 1, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json", (int) (byte) 0, (int) (byte) 10, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json", (int) (short) 0, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json", (int) (byte) 100, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) (short) 10, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json", (int) (byte) 1, 1, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", 100, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json", (int) (byte) 100, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json", 100, 10, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (byte) 10, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json", (int) '4', (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json", (int) (short) 10, (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("hi!", 0, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) (short) 0, 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (byte) 0, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json", (int) (byte) 10, (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json", (-1), (int) (byte) -1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json", (int) (short) 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json", (int) (short) 100, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) 'a', 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json", (int) 'a', (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json?date=97:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json?date=97:-1&format=json");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json", (int) (byte) 0, (-1), "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json", (-1), (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:97&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:97&format=json");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) (short) 0, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json", (int) (byte) -1, 100, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("hi!", (int) '4', (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", 1, (int) ' ', "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json");
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) (short) 0, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json", (int) '4', (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json", (-1), (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) (byte) 100, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json", (int) (short) 1, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (-1), (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json", (int) (short) -1, (int) (short) 100, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json", (int) (short) 0, (int) (byte) 1, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (short) 100, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) '4', 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=52:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=52:10&format=json");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json", (int) 'a', 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=10:-1&format=json", 10, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json", (int) ' ', 100, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=32:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=32:100&format=json");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json", (-1), (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=-1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=-1:1&format=json");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json", (int) '#', (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json?date=97:-1&format=json", (int) (short) -1, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json", 0, (int) '4', "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=0:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=0:52&format=json");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) ' ', (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=-1:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (byte) 1, (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", (int) 'a', (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json", (int) (short) 0, (int) ' ', "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json/indicator/?date=0:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json/indicator/?date=0:32&format=json");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) 'a', (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=97:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=97:-1&format=json");
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json", (int) '4', (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (-1), (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json", (-1), (int) (short) 0, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json", (-1), (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (short) -1, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json?date=-1:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json?date=-1:0&format=json");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json", (int) (byte) 1, (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", (int) (byte) 1, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", 1, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json", (int) '4', (int) (short) 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json", 1, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=1:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=1:100&format=json");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) 'a', (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (short) -1, 10, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:10&format=json");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json", (int) (short) 100, 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=97:-1&format=json", (int) (byte) 10, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json", (int) (byte) 1, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=1:1&format=json");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json", (int) ' ', (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) 'a', (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json", (int) 'a', (int) '#', "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json/indicator/hi!?date=97:35&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json/indicator/hi!?date=97:35&format=json");
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json", (int) (short) 100, 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json", (int) (byte) 100, (int) (byte) 10, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=100:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=100:10&format=json");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json", (int) '4', (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", 100, (int) (short) -1, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/hi!?date=100:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/hi!?date=100:-1&format=json");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json", (int) (short) 10, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=1:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json", (int) ' ', (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", 0, (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json", (int) 'a', (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json?date=97:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json?date=97:1&format=json");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) (byte) 0, 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json", (int) (byte) 100, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=-1:1&format=json", (int) (short) 0, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json", 10, (int) '#', "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json", (int) '#', 10, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", (int) (short) 1, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json?date=1:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json?date=1:0&format=json");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json", (int) '#', 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("hi!", 10, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", 0, (int) (short) 10, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=10:0&format=json", (int) (byte) 100, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json", 1, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=1:100&format=json", (int) (byte) 100, (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:97&format=json", (int) ' ', (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (short) 0, 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:0&format=json");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json", (int) (byte) 10, (int) (short) -1, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=10:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=10:-1&format=json");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json", (int) (byte) 1, (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=1:1&format=json", 100, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json?date=97:-1&format=json", 1, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=1:100&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=100:35&format=json", 1, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json", (int) (byte) 0, 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json", (int) (byte) -1, (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json?date=97:1&format=json", (int) (byte) 1, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/hi!?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json", 1, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json", (int) '#', (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json", (int) (byte) 100, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", 0, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:1&format=json", (int) (byte) -1, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (byte) 100, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (short) 100, 0, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=10:-1&format=json", (int) (byte) 0, (int) (byte) -1, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=97:-1&format=json", (-1), (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=32:100&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json", (int) '4', (int) (short) 10, "");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) (byte) 10, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=10:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=10:100&format=json");
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) '#', (int) (short) 1, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) (byte) 0, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json", (int) (short) 10, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json", (int) (byte) -1, (int) (short) 10, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json?date=-1:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json?date=-1:10&format=json");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=10:-1&format=json", (int) (short) 100, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (short) 10, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json", (int) (short) 0, 100, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) (byte) 10, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json?date=10:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json?date=10:-1&format=json");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json", (int) (byte) 0, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=0:52&format=json", (int) (byte) 100, 1, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json", 0, 10, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json", (int) ' ', (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=32:100&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json", (int) (short) 0, (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json?date=-1:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:0&format=json", (int) (short) 0, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json", 100, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) (short) 10, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json", (int) (byte) 1, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (byte) 10, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", 10, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (short) 1, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=10:100&format=json", 0, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json", 0, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:52&format=json");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) (short) -1, (int) (short) 1, "http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json", (int) (byte) -1, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=10:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json", 0, (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.String str4 = fetchers.Data.makeURL("hi!", 1, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:1&format=json");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=0:52&format=json", (int) (byte) 100, (int) (short) 10, "");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=10:-1&format=json", (int) (short) -1, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json", (int) (short) 100, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json", (int) (short) 100, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json", 100, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json", (int) (short) 0, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json", (int) (byte) 1, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json", (int) (short) -1, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json", (int) (byte) -1, 10, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", 0, (int) (short) 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json", 10, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json", (int) (short) 10, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json", 100, (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) (byte) 0, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json/indicator/hi!?date=97:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json/indicator/hi!?date=97:35&format=json?date=0:-1&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json/indicator/hi!?date=97:35&format=json?date=0:-1&format=json");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:0&format=json/indicator/?date=0:-1&format=json", (int) (byte) 100, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (byte) -1, 10, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", 0, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=32:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json", (int) 'a', (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json", (int) 'a', (int) (short) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=100:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json", (int) (byte) 0, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", (int) (byte) 1, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json?date=1:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json?date=1:10&format=json");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("hi!", (-1), (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json?date=97:1&format=json", (int) (short) -1, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) (byte) 0, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json", (int) (short) 1, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str4 = fetchers.Data.makeURL("", (int) '4', (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=52:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=52:1&format=json");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) 'a', (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json?date=97:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json?date=97:32&format=json");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (short) -1, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json", (int) (short) 10, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json", (int) (short) 0, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json", (int) (short) -1, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:52&format=json", 1, 100, "");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", (int) (short) -1, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=0:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json", (int) 'a', 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/?date=97:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/?date=97:0&format=json");
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json", (int) 'a', (int) (byte) 1, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json", (int) (byte) 0, (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=100:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (-1), (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=97:-1&format=json", 0, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str4 = fetchers.Data.makeURL("", (-1), (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json?date=-1:32&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json?date=-1:32&format=json");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json", 10, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", (int) (byte) 1, (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", (-1), (int) (byte) 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json/indicator/?date=-1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json/indicator/?date=-1:1&format=json");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json", (int) '#', 0, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json", 0, 1, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=-1:1&format=json", (int) 'a', 0, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json", (int) (byte) 0, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json", (int) (short) -1, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json?date=-1:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json?date=-1:100&format=json");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json", (int) (short) 100, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json?date=100:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json?date=100:0&format=json");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) ' ', (int) (short) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", 0, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str4 = fetchers.Data.makeURL("", 0, 10, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json?date=0:10&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json?date=0:10&format=json");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json", (int) (short) 1, 1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json/indicator/?date=1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json/indicator/?date=1:1&format=json");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) (byte) 10, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json", (int) (byte) 1, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json", (int) ' ', 100, "http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=32:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=32:100&format=json");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=0:-1&format=json", 0, (int) (byte) -1, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json", (int) (short) 0, 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=0:0&format=json?date=-1:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json", (int) (short) 10, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json", (int) (byte) 10, 100, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json?date=10:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json", (int) (short) 10, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=-1:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json", (int) 'a', 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=100:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.lang.String str4 = fetchers.Data.makeURL("", 0, (int) (short) 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json?date=0:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json?date=0:100&format=json");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) '4', (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=52:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=52:1&format=json");
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json", (int) (short) 1, (int) (byte) 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json", (int) ' ', 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json", (int) (short) 1, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json?date=97:32&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=10:97&format=json", (int) (byte) 100, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=100:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json/indicator/?date=1:1&format=json", (int) (byte) 10, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json", 1, (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/hi!?date=100:-1&format=json", (int) (short) -1, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json?date=1:10&format=json", (int) '#', 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json", 0, (int) (short) 1, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json?date=0:10&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json?date=97:-1&format=json", 0, (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json?date=1:97&format=json", (int) '#', (int) ' ', "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:10&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=32:97&format=json?date=0:-1&format=json?date=10:-1&format=json", (int) (byte) 10, (int) '#', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json/indicator/?date=-1:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=10:1&format=json", (-1), 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("", (int) ' ', (int) (byte) 100, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=52:10&format=json", 1, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=10:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json", 100, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json", (int) (short) 10, (int) 'a', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:0&format=json/indicator/?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json", 1, 1, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=-1:52&format=json/indicator/hi!?date=97:35&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json?date=1:0&format=json", (int) (byte) 0, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json", 0, (int) '4', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json?date=0:52&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json?date=0:52&format=json");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json", (int) (short) 0, (int) (byte) 0, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json/indicator/?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json/indicator/?date=0:0&format=json");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) (short) 1, 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:97&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json", (-1), (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=0:1&format=json/indicator/?date=97:0&format=json", 10, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=-1:100&format=json", 0, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=0:52&format=json", (int) '#', (int) 'a', "hi!");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json", (int) (short) 1, 100, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=1:100&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=1:100&format=json");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json", (int) ' ', (int) (short) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json?date=10:52&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/hi!?date=100:-1&format=json", (int) 'a', (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=-1:100&format=json", (int) (byte) 0, 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=97:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=97:0&format=json?date=1:1&format=json", (int) (short) 10, 10, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json?date=100:0&format=json?date=-1:32&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json", (int) (short) 100, (int) (short) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", (int) (byte) -1, (int) (byte) 1, "http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=-1:1&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=-1:1&format=json");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=52:0&format=json?date=0:0&format=json", (int) (byte) 1, (-1), "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json?date=0:32&format=json/indicator/?date=0:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=32:0&format=json?date=10:32&format=json?date=1:10&format=json", (int) ' ', (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json/indicator/?date=32:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json/indicator/hi!?date=0:0&format=json?date=97:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json", (int) '4', (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json?date=100:35&format=json", (int) (byte) 10, (int) (short) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=-1:0&format=json?date=0:100&format=json", (int) (short) -1, (int) 'a', "");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json", (int) 'a', (int) (short) 0, "");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=35:100&format=json", 0, (int) (byte) -1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json?date=0:0&format=json?date=35:100&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str4 = fetchers.Data.makeURL("http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json", (int) (byte) 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:0&format=json");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=35:1&format=json", (int) ' ', (int) ' ', "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=35:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=0:-1&format=json?date=52:0&format=json?date=97:-1&format=json");
        java.lang.Class<?> wildcardClass5 = dataSet4.getClass();
        org.junit.Assert.assertNotNull(dataSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/hi!?date=35:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json?date=0:100&format=json", 0, (int) (byte) 0, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=0:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=1:1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=10:0&format=json?date=1:0&format=json", (int) (short) 1, (int) (byte) 1, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json?date=52:35&format=json?date=35:0&format=json/indicator/hi!?date=10:100&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        fetchers.DataSet dataSet4 = fetchers.Data.fetchData("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=100:52&format=json", (int) (byte) 1, (int) (byte) 10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=10:32&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=32:10&format=json?date=10:35&format=json/indicator/?date=0:32&format=json/indicator/http://api.worldbank.org/v2/country//indicator/?date=10:0&format=json?date=32:1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json?date=-1:1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(dataSet4);
    }
}

