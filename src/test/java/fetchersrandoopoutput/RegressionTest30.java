package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url url16 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url url19 = urlBuilder18.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=10:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=10:-1&format=json");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        java.lang.Class<?> wildcardClass27 = urlBuilder26.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 100);
        fetchers.Url url19 = urlBuilder18.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url url16 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass19 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url12 = urlBuilder11.build();
        java.lang.String str13 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.String str16 = url15.toString();
        java.lang.Class<?> wildcardClass17 = url15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart((int) '#');
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=10:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd(1);
        fetchers.Url url9 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder16.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass26 = urlBuilder23.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        java.lang.String str6 = url5.toString();
        java.lang.String str7 = url5.toString();
        java.lang.String str8 = url5.toString();
        java.lang.String str9 = url5.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url url21 = urlBuilder20.build();
        java.lang.String str22 = url21.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url url19 = urlBuilder14.build();
        java.lang.Class<?> wildcardClass20 = url19.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.Class<?> wildcardClass20 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url url10 = urlBuilder2.build();
        java.lang.Class<?> wildcardClass11 = url10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url21 = urlBuilder18.build();
        java.lang.Class<?> wildcardClass22 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        java.lang.String str18 = url15.toString();
        java.lang.String str19 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url url21 = urlBuilder20.build();
        java.lang.Class<?> wildcardClass22 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearEnd((int) (byte) 0);
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url url18 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url url11 = urlBuilder10.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass9 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(100);
        fetchers.Url url17 = urlBuilder16.build();
        java.lang.String str18 = url17.toString();
        java.lang.String str19 = url17.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((-1));
        java.lang.Class<?> wildcardClass16 = urlBuilder13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart(0);
        fetchers.Url url20 = urlBuilder19.build();
        java.lang.String str21 = url20.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) (short) 100);
        fetchers.Url url19 = urlBuilder12.build();
        fetchers.Url url20 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(url20);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (short) -1);
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) '4');
        fetchers.Url url20 = urlBuilder19.build();
        java.lang.String str21 = url20.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:52&format=json" + "'", str21, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:52&format=json");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((-1));
        java.lang.Class<?> wildcardClass22 = urlBuilder21.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url url24 = urlBuilder23.build();
        java.lang.Class<?> wildcardClass25 = urlBuilder23.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(url24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(0);
        fetchers.Url url10 = urlBuilder9.build();
        java.lang.String str11 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder20.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) '4');
        java.lang.Class<?> wildcardClass18 = urlBuilder15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url18 = urlBuilder17.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url url7 = urlBuilder4.build();
        java.lang.Class<?> wildcardClass8 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(0);
        java.lang.Class<?> wildcardClass10 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder0.build();
        java.lang.Class<?> wildcardClass12 = url11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url url15 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) ' ');
        fetchers.Url url21 = urlBuilder20.build();
        java.lang.String str22 = url21.toString();
        java.lang.String str23 = url21.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json" + "'", str23, "http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (short) 10);
        fetchers.Url url18 = urlBuilder17.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder17.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        java.lang.Class<?> wildcardClass9 = urlBuilder2.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setYearEnd(100);
        fetchers.Url url18 = urlBuilder17.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) 'a');
        fetchers.Url url19 = urlBuilder18.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
        fetchers.Url url25 = urlBuilder18.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(url25);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url url9 = urlBuilder6.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.String str13 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str13, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(1);
        java.lang.Class<?> wildcardClass10 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url url18 = urlBuilder8.build();
        java.lang.String str19 = url18.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        java.lang.Class<?> wildcardClass21 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 1);
        fetchers.Url url16 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder16.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = urlBuilder22.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) ' ');
        java.lang.Class<?> wildcardClass18 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        java.lang.Class<?> wildcardClass16 = urlBuilder15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        java.lang.String str6 = url5.toString();
        java.lang.String str7 = url5.toString();
        java.lang.String str8 = url5.toString();
        java.lang.String str9 = url5.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        java.lang.Class<?> wildcardClass13 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd(1);
        fetchers.Url url21 = urlBuilder20.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd(0);
        java.lang.Class<?> wildcardClass23 = urlBuilder22.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder2.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("");
        fetchers.Url url18 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        java.lang.String str8 = url7.toString();
        java.lang.Class<?> wildcardClass9 = url7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url url16 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url url16 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url url9 = urlBuilder6.build();
        java.lang.String str10 = url9.toString();
        java.lang.Class<?> wildcardClass11 = url9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
        fetchers.Url url25 = urlBuilder22.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(url25);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        fetchers.Url url13 = urlBuilder9.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        java.lang.Class<?> wildcardClass16 = url13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass9 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass24 = urlBuilder19.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) '#');
        java.lang.Class<?> wildcardClass21 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("");
        java.lang.Class<?> wildcardClass20 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=-1:97&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=-1:97&format=json");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearEnd((int) (byte) 0);
        fetchers.Url url17 = urlBuilder16.build();
        java.lang.String str18 = url17.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url url9 = urlBuilder6.build();
        java.lang.Class<?> wildcardClass10 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url10 = urlBuilder4.build();
        java.lang.String str11 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=52:97&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=52:97&format=json");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("");
        fetchers.Url url18 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) -1);
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        java.lang.Class<?> wildcardClass25 = urlBuilder24.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) 'a');
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("");
        fetchers.Url url23 = urlBuilder20.build();
        java.lang.String str24 = url23.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(url23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:0&format=json" + "'", str24, "http://api.worldbank.org/v2/country//indicator/?date=0:0&format=json");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass14 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url url19 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) (short) 10);
        fetchers.Url url16 = urlBuilder15.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        java.lang.Class<?> wildcardClass9 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass24 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 0);
        fetchers.Url url18 = urlBuilder15.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((-1));
        fetchers.Url url18 = urlBuilder17.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder17.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder17.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        java.lang.Class<?> wildcardClass16 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url12 = urlBuilder8.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url url21 = urlBuilder20.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((int) (short) 0);
        fetchers.Url url27 = urlBuilder26.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(url27);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url url15 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) '#');
        java.lang.Class<?> wildcardClass18 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (short) 0);
        fetchers.Url url21 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url url15 = urlBuilder13.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        java.lang.Class<?> wildcardClass16 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url url22 = urlBuilder21.build();
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        java.lang.Class<?> wildcardClass13 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url url1 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder3 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:97&format=json");
        fetchers.Url url4 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(url1);
        org.junit.Assert.assertNotNull(urlBuilder3);
        org.junit.Assert.assertNotNull(url4);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        java.lang.String str6 = url5.toString();
        java.lang.String str7 = url5.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd((int) (short) 10);
        fetchers.Url url13 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart(1);
        fetchers.Url url14 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        java.lang.Class<?> wildcardClass14 = urlBuilder13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setYearStart((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url url23 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) '#');
        java.lang.Class<?> wildcardClass20 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url url11 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder20.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url url20 = urlBuilder8.build();
        fetchers.Url url21 = urlBuilder8.build();
        fetchers.Url url22 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder8.setYearStart((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder16.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder23.setYearStart((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url url13 = urlBuilder8.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:100&format=json");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url url18 = urlBuilder9.build();
        java.lang.String str19 = url18.toString();
        java.lang.String str20 = url18.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url url11 = urlBuilder7.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url17 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url url29 = urlBuilder28.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(url29);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url url21 = urlBuilder20.build();
        java.lang.String str22 = url21.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=32:100&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=32:100&format=json");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url url14 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (short) -1);
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.String str17 = url16.toString();
        java.lang.Class<?> wildcardClass18 = url16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/hi!/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url21 = urlBuilder20.build();
        java.lang.String str22 = url21.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder22.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url url13 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.Class<?> wildcardClass16 = url15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url9 = urlBuilder4.build();
        java.lang.Class<?> wildcardClass10 = url9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd((int) (short) 10);
        fetchers.Url url15 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder11.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/hi!?date=0:100&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/hi!?date=0:100&format=json");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url url9 = urlBuilder2.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.String str13 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.Class<?> wildcardClass17 = url16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url url11 = urlBuilder10.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=-1:97&format=json");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) -1);
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.String str20 = url19.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=0:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=10:100&format=json");
        fetchers.Url url18 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        java.lang.String str15 = url14.toString();
        java.lang.String str16 = url14.toString();
        java.lang.String str17 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url url20 = urlBuilder16.build();
        fetchers.Url url21 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setYearEnd((int) (byte) 10);
        fetchers.Url url8 = urlBuilder2.build();
        java.lang.String str9 = url8.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd((int) (byte) -1);
        fetchers.Url url26 = urlBuilder23.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(url26);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=10:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=32:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        java.lang.Class<?> wildcardClass18 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url url13 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url url10 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((-1));
        fetchers.Url url21 = urlBuilder20.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearEnd((-1));
        fetchers.Url url19 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder13.setYearStart((-1));
        java.lang.Class<?> wildcardClass22 = urlBuilder13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url url27 = urlBuilder26.build();
        java.lang.String str28 = url27.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(url27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:97&format=json" + "'", str28, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:97&format=json");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((int) (short) 100);
        fetchers.Url url22 = urlBuilder21.build();
        java.lang.String str23 = url22.toString();
        java.lang.Class<?> wildcardClass24 = url22.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearStart((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        java.lang.Class<?> wildcardClass15 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        java.lang.String str14 = url11.toString();
        java.lang.String str15 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        java.lang.Class<?> wildcardClass22 = urlBuilder21.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url url14 = urlBuilder4.build();
        java.lang.String str15 = url14.toString();
        java.lang.String str16 = url14.toString();
        java.lang.String str17 = url14.toString();
        java.lang.String str18 = url14.toString();
        java.lang.String str19 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json" + "'", str17, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json" + "'", str18, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json" + "'", str19, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url13 = urlBuilder8.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("");
        fetchers.Url url18 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        java.lang.String str20 = url19.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:100&format=json");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearStart((int) ' ');
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url17 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("");
        java.lang.Class<?> wildcardClass17 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) -1);
        fetchers.Url url19 = urlBuilder18.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearEnd((int) (short) 10);
        java.lang.Class<?> wildcardClass24 = urlBuilder19.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url url8 = urlBuilder7.build();
        java.lang.Class<?> wildcardClass9 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(0);
        java.lang.Class<?> wildcardClass17 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) ' ');
        fetchers.Url url18 = urlBuilder17.build();
        java.lang.String str19 = url18.toString();
        java.lang.String str20 = url18.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(0);
        fetchers.Url url11 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearStart(1);
        java.lang.Class<?> wildcardClass18 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=35:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=35:100&format=json");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url url20 = urlBuilder8.build();
        fetchers.Url url21 = urlBuilder8.build();
        fetchers.Url url22 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=10:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url url11 = urlBuilder10.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url url23 = urlBuilder20.build();
        fetchers.Url url24 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(url23);
        org.junit.Assert.assertNotNull(url24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(urlBuilder30);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url url18 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(10);
        java.lang.Class<?> wildcardClass13 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url url23 = urlBuilder22.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) -1);
        fetchers.Url url17 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=10:0&format=json");
        java.lang.Class<?> wildcardClass25 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url url5 = urlBuilder4.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url url20 = urlBuilder19.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(url20);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        java.lang.Class<?> wildcardClass11 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url url24 = urlBuilder21.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(url24);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url url15 = urlBuilder14.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:10&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:10&format=json");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = urlBuilder20.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        java.lang.Class<?> wildcardClass17 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) -1);
        fetchers.Url url19 = urlBuilder16.build();
        java.lang.String str20 = url19.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder2.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url url9 = urlBuilder7.build();
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) -1);
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.Class<?> wildcardClass20 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder22.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url url21 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        java.lang.String str6 = url5.toString();
        java.lang.String str7 = url5.toString();
        java.lang.String str8 = url5.toString();
        java.lang.String str9 = url5.toString();
        java.lang.String str10 = url5.toString();
        java.lang.String str11 = url5.toString();
        java.lang.String str12 = url5.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder7.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:0&format=json");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd((int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url url15 = urlBuilder6.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart(0);
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.String str17 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder20.setYearEnd((int) (byte) 0);
        fetchers.Url url29 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder31 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(url29);
        org.junit.Assert.assertNotNull(urlBuilder31);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder6.build();
        java.lang.String str10 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:0&format=json");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        java.lang.Class<?> wildcardClass14 = url13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        java.lang.Class<?> wildcardClass13 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearEnd((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
        fetchers.Url url14 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url9 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart(1);
        java.lang.Class<?> wildcardClass17 = urlBuilder16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("");
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.Class<?> wildcardClass20 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) ' ');
        fetchers.Url url17 = urlBuilder10.build();
        java.lang.String str18 = url17.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=32:97&format=json" + "'", str18, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=32:97&format=json");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((int) (short) 100);
        fetchers.Url url22 = urlBuilder18.build();
        java.lang.String str23 = url22.toString();
        java.lang.String str24 = url22.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json" + "'", str24, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (short) 10);
        fetchers.Url url21 = urlBuilder20.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        java.lang.Class<?> wildcardClass8 = urlBuilder5.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url9 = urlBuilder4.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.String str13 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json" + "'", str11, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json" + "'", str13, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(10);
        java.lang.Class<?> wildcardClass19 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url url19 = urlBuilder12.build();
        java.lang.String str20 = url19.toString();
        java.lang.String str21 = url19.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(10);
        fetchers.Url url17 = urlBuilder14.build();
        java.lang.String str18 = url17.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=10:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=10:-1&format=json");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '4');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url url18 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url url16 = urlBuilder14.build();
        java.lang.Class<?> wildcardClass17 = url16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) (byte) 10);
        java.lang.Class<?> wildcardClass23 = urlBuilder18.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (short) -1);
        fetchers.Url url25 = urlBuilder20.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(url25);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearStart((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url url6 = urlBuilder5.build();
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder5.setYearStart((int) ' ');
        java.lang.Class<?> wildcardClass9 = urlBuilder5.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(url6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 10);
        fetchers.Url url19 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        java.lang.Class<?> wildcardClass17 = url16.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url url21 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder20.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) -1);
        fetchers.Url url19 = urlBuilder16.build();
        java.lang.String str20 = url19.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=97:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=97:-1&format=json");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder9.setYearStart((int) (short) 0);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/?date=1:52&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/?date=1:52&format=json");
    }
}

