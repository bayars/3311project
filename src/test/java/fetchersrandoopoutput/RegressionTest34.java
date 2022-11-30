package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url url12 = urlBuilder11.build();
        java.lang.String str13 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=52:10&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=52:10&format=json");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder24.setYearEnd((int) '#');
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearEnd(0);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart((int) '#');
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url url11 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder7.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder7.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (short) 1);
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
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
        fetchers.Url url20 = urlBuilder19.build();
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder19.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass23 = urlBuilder22.getClass();
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) (byte) 10);
        java.lang.Class<?> wildcardClass24 = urlBuilder21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url url18 = urlBuilder8.build();
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = urlBuilder15.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        fetchers.Url url18 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(100);
        fetchers.Url url23 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder20.setYearEnd((int) (short) 10);
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
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(url23);
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart((int) ' ');
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url url12 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder7.setYearStart((int) (short) 10);
        fetchers.Url url15 = urlBuilder7.build();
        java.lang.String str16 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json/indicator/null?date=10:0&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json/indicator/null?date=10:0&format=json");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) 'a');
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 10);
        fetchers.Url url20 = urlBuilder17.build();
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url url25 = urlBuilder24.build();
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=52:1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json?date=10:0&format=json");
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        java.lang.String str11 = url10.toString();
        java.lang.String str12 = url10.toString();
        java.lang.Class<?> wildcardClass13 = url10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
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
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearStart((int) (byte) 100);
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/?date=52:-1&format=json");
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
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("");
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
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url url16 = urlBuilder10.build();
        java.lang.String str17 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json?date=0:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json?date=0:-1&format=json");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 10);
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
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("");
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (short) 10);
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
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json?date=0:35&format=json");
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
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 10);
        fetchers.Url url14 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setYearStart(1);
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
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(0);
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
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url url18 = urlBuilder17.build();
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
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) -1);
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
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:97&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setYearStart((int) '4');
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
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 0);
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        fetchers.Url url16 = urlBuilder12.build();
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder2.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
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
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(10);
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder11.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder11.setYearEnd((int) (byte) -1);
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
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json?date=1:0&format=json");
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
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder20.setYearStart((int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url url20 = urlBuilder19.build();
        fetchers.Url url21 = urlBuilder19.build();
        java.lang.String str22 = url21.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("");
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
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        fetchers.Url url21 = urlBuilder18.build();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=0:1&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=0:1&format=json");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
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
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
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
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
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
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearStart((int) ' ');
        fetchers.Url url27 = urlBuilder22.build();
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder31 = urlBuilder29.setYearStart((int) 'a');
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
        org.junit.Assert.assertNotNull(url27);
        org.junit.Assert.assertNotNull(urlBuilder29);
        org.junit.Assert.assertNotNull(urlBuilder31);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
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
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd(1);
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
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) ' ');
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
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:-1&format=json");
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder15.setYearStart((int) (short) -1);
        fetchers.Url url23 = urlBuilder15.build();
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
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) ' ');
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.Class<?> wildcardClass14 = urlBuilder12.getClass();
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
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url url25 = urlBuilder24.build();
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
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(10);
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
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:52&format=json");
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
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder2.setYearStart((int) (short) 10);
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
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        fetchers.Url url23 = urlBuilder20.build();
        java.lang.String str24 = url23.toString();
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
        org.junit.Assert.assertNotNull(url23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=10:0&format=json" + "'", str24, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=10:0&format=json");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart((int) (short) 0);
        fetchers.Url url20 = urlBuilder19.build();
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder19.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/?date=52:32&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url23 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder20.setYearEnd((int) ' ');
        fetchers.Url url26 = urlBuilder25.build();
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(url26);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearStart((int) '#');
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
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(0);
        java.lang.Class<?> wildcardClass17 = urlBuilder10.getClass();
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
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=97:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) 10);
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
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 1);
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
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json?date=1:0&format=json");
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
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url url19 = urlBuilder18.build();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json" + "'", str21, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
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
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
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
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        java.lang.String str16 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder15.setYearStart((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        java.lang.String str15 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:0&format=json");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json");
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
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:10&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:10&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:10&format=json" + "'", str13, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:10&format=json");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder14.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
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
        fetchers.Url url21 = urlBuilder18.build();
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
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 1);
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
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=-1:0&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=-1:0&format=json");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setYearStart((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder17.setYearStart((int) (short) 100);
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 0);
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
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder2.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) 1);
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
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (short) 100);
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
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder27.setYearEnd((int) (short) 100);
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
        org.junit.Assert.assertNotNull(urlBuilder27);
        org.junit.Assert.assertNotNull(urlBuilder29);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) 'a');
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
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) 'a');
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder8.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url url27 = urlBuilder26.build();
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder26.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:97&format=json");
        java.lang.Class<?> wildcardClass30 = urlBuilder29.getClass();
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
        org.junit.Assert.assertNotNull(url27);
        org.junit.Assert.assertNotNull(urlBuilder29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url url18 = urlBuilder14.build();
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
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder7.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=10:-1&format=json");
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
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 0);
        fetchers.Url url21 = urlBuilder18.build();
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
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        java.lang.String str13 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:100&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:100&format=json");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        java.lang.Class<?> wildcardClass12 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(1);
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
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) -1);
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
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearStart((int) ' ');
        fetchers.Url url27 = urlBuilder22.build();
        java.lang.Class<?> wildcardClass28 = url27.getClass();
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
        org.junit.Assert.assertNotNull(url27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder16.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd(0);
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
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) '#');
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder20.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(10);
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
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
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
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=35:-1&format=json");
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
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(0);
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
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=52:0&format=json");
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
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) ' ');
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
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
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
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass18 = urlBuilder15.getClass();
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
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        fetchers.Url url26 = urlBuilder23.build();
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
        org.junit.Assert.assertNotNull(url26);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url url19 = urlBuilder18.build();
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
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json/indicator/null?date=1:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json/indicator/null?date=1:0&format=json");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("");
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
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) -1);
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
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        java.lang.Class<?> wildcardClass27 = urlBuilder20.getClass();
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart(100);
        fetchers.Url url25 = urlBuilder24.build();
        java.lang.Class<?> wildcardClass26 = url25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url url16 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=10:-1&format=json");
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
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(10);
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
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("");
        java.lang.Class<?> wildcardClass17 = urlBuilder10.getClass();
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
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json?date=1:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=35:100&format=json");
        java.lang.Class<?> wildcardClass11 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 10);
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearStart((int) (short) 1);
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
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((-1));
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
        fetchers.Url url18 = urlBuilder17.build();
        fetchers.Url url19 = urlBuilder17.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd(100);
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
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (byte) 100);
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
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
        java.lang.Class<?> wildcardClass21 = urlBuilder19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart(0);
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
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearStart((int) (short) 100);
        fetchers.Url url8 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setYearEnd((int) (byte) 100);
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
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url url17 = urlBuilder14.build();
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
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
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
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        java.lang.String str4 = url3.toString();
        java.lang.String str5 = url3.toString();
        java.lang.String str6 = url3.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json" + "'", str5, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder7.setYearStart((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearStart((int) (short) 100);
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
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url url23 = urlBuilder22.build();
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
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("");
        fetchers.Url url12 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        fetchers.Url url21 = urlBuilder18.build();
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
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url url12 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=10:100&format=json");
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
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json" + "'", str24, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/?date=52:-1&format=json");
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
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
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
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
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
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
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=-1:-1&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
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
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        fetchers.Url url19 = urlBuilder17.build();
        java.lang.String str20 = url19.toString();
        java.lang.String str21 = url19.toString();
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
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder5.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=32:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        fetchers.Url url17 = urlBuilder16.build();
        java.lang.String str18 = url17.toString();
        java.lang.Class<?> wildcardClass19 = url17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=100:52&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=97:100&format=json");
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
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(0);
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json?date=0:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json?date=0:-1&format=json");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url23 = urlBuilder22.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder25);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
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
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:10&format=json");
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
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
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
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json?date=10:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        java.lang.Class<?> wildcardClass19 = urlBuilder16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
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
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url url15 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url url20 = urlBuilder10.build();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/?date=10:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/?date=10:-1&format=json");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
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
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart((int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = urlBuilder11.getClass();
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
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=1:-1&format=json");
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
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) 0);
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:97&format=json");
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
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder16.getClass();
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
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearEnd((int) (short) 1);
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
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(1);
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        java.lang.String str15 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/?date=100:100&format=json" + "'", str28, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/?date=100:100&format=json");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass13 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=0:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/?date=0:100&format=json");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
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
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        java.lang.Class<?> wildcardClass13 = url12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(0);
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
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder0.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=1:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 0);
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
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=10:10&format=json");
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
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json?date=10:0&format=json");
        java.lang.Class<?> wildcardClass28 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:-1&format=json");
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
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearEnd((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder0.build();
        java.lang.Class<?> wildcardClass12 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd(0);
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url url16 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder2.setYearEnd((int) '#');
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
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) 'a');
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
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 100);
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
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 100);
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearStart((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 0);
        fetchers.Url url14 = urlBuilder13.build();
        java.lang.String str15 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=100:52&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
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
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url18 = urlBuilder12.build();
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
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder27.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
        org.junit.Assert.assertNotNull(urlBuilder29);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = urlBuilder0.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setYearEnd((int) (byte) 10);
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
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=52:100&format=json");
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
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url6 = urlBuilder5.build();
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder5.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(100);
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.Class<?> wildcardClass14 = urlBuilder10.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(url6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearEnd((int) (byte) 10);
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
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=52:1&format=json");
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
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json");
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
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json?date=0:100&format=json");
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
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url url26 = urlBuilder23.build();
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
        org.junit.Assert.assertNotNull(url26);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=52:-1&format=json");
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
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json?date=10:10&format=json");
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
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd((int) (short) 1);
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
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json?date=-1:0&format=json");
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
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder4.setYearEnd((int) ' ');
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
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder12.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd(0);
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
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        java.lang.Class<?> wildcardClass9 = url8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 0);
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
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) '4');
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
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder5.setYearEnd(0);
        fetchers.Url url12 = urlBuilder11.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        java.lang.Class<?> wildcardClass16 = urlBuilder14.getClass();
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
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url url12 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder7.setYearStart((int) (short) 10);
        fetchers.Url url15 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearEnd(1);
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 0);
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
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json?date=-1:0&format=json");
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
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder7.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 10);
        java.lang.Class<?> wildcardClass15 = urlBuilder12.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearEnd(100);
        fetchers.Url url17 = urlBuilder6.build();
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
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=100:52&format=json");
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
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearEnd((-1));
        fetchers.Url url24 = urlBuilder19.build();
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
        org.junit.Assert.assertNotNull(url24);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(10);
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
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearEnd(0);
        fetchers.Url url17 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=100:52&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (byte) 1);
        fetchers.Url url20 = urlBuilder19.build();
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        java.lang.Class<?> wildcardClass23 = urlBuilder19.getClass();
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((int) '4');
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
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=0:-1&format=json");
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
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
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
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
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:-1&format=json");
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
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder24.setYearStart(100);
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
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        java.lang.String str16 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(100);
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
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (short) -1);
        fetchers.Url url10 = urlBuilder9.build();
        fetchers.Url url11 = urlBuilder9.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
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
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/null?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json?date=0:100&format=json");
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
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(1);
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart(10);
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
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass25 = urlBuilder24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(0);
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
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(0);
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
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(1);
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
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=97:100&format=json");
        fetchers.Url url17 = urlBuilder14.build();
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
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((int) (byte) 0);
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
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        java.lang.Class<?> wildcardClass9 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        java.lang.Class<?> wildcardClass26 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setYearEnd((int) '4');
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
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder20.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder20.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder20.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder31 = urlBuilder20.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder33 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder35 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
        org.junit.Assert.assertNotNull(urlBuilder29);
        org.junit.Assert.assertNotNull(urlBuilder31);
        org.junit.Assert.assertNotNull(urlBuilder33);
        org.junit.Assert.assertNotNull(urlBuilder35);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url url11 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
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
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd(1);
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
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url23 = urlBuilder22.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder22.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder25.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
        org.junit.Assert.assertNotNull(urlBuilder29);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart(0);
        fetchers.Url url22 = urlBuilder19.build();
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
        org.junit.Assert.assertNotNull(url22);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder12.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
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
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url16 = urlBuilder10.build();
        java.lang.String str17 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json?date=52:1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json?date=52:1&format=json");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) '#');
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
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json?date=0:0&format=json");
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
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd(100);
        fetchers.Url url25 = urlBuilder22.build();
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder22.setYearStart((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(urlBuilder24);
        org.junit.Assert.assertNotNull(url25);
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        java.lang.String str5 = url4.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str5, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (byte) -1);
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
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) (short) -1);
        fetchers.Url url24 = urlBuilder21.build();
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
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((int) (short) 0);
        fetchers.Url url24 = urlBuilder23.build();
        fetchers.Url url25 = urlBuilder23.build();
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
        org.junit.Assert.assertNotNull(url25);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setYearEnd((int) 'a');
        java.lang.Class<?> wildcardClass18 = urlBuilder14.getClass();
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
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=52:100&format=json");
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
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url url16 = urlBuilder14.build();
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url url18 = urlBuilder14.build();
        fetchers.Url url19 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("");
        java.lang.Class<?> wildcardClass24 = urlBuilder21.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertNotNull(url18);
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(urlBuilder23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
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
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder8.setYearEnd((int) (byte) 0);
        fetchers.Url url23 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder8.setYearStart((int) (byte) 10);
        java.lang.Class<?> wildcardClass26 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(url23);
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url12 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder9.setYearStart(1);
        java.lang.Class<?> wildcardClass15 = urlBuilder14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder2.setYearEnd((int) (short) 0);
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
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd((int) (byte) 0);
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
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder27.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder31 = urlBuilder27.setYearEnd((-1));
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
        org.junit.Assert.assertNotNull(urlBuilder29);
        org.junit.Assert.assertNotNull(urlBuilder31);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
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
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:100&format=json");
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
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) ' ');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (short) 1);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) 'a');
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
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url url16 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setYearEnd((int) 'a');
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
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url url9 = urlBuilder2.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=32:97&format=json");
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
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url url19 = urlBuilder16.build();
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
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=0:100&format=json");
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
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) '4');
        fetchers.Url url18 = urlBuilder17.build();
        java.lang.String str19 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=52:52&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=52:52&format=json");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (byte) 0);
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
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder17.setYearStart(0);
        java.lang.Class<?> wildcardClass26 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 10);
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json/indicator/null?date=10:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder25);
        org.junit.Assert.assertNotNull(urlBuilder27);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (short) -1);
        fetchers.Url url23 = urlBuilder20.build();
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
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setYearStart((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=32:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url31 = urlBuilder30.build();
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
        org.junit.Assert.assertNotNull(url31);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd(0);
        java.lang.Class<?> wildcardClass7 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json?date=1:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json?date=1:-1&format=json");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 100);
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.String str17 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country//indicator/hi!?date=100:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country//indicator/hi!?date=100:-1&format=json");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json");
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
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("");
        fetchers.Url url17 = urlBuilder12.build();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
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
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url url12 = urlBuilder8.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
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
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url22 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setYearEnd((int) (byte) 100);
        fetchers.Url url29 = urlBuilder28.build();
        java.lang.String str30 = url29.toString();
        java.lang.String str31 = url29.toString();
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
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(url29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=100:100&format=json" + "'", str30, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=100:100&format=json");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=100:100&format=json" + "'", str31, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=100:100&format=json");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        java.lang.String str18 = url17.toString();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json?date=52:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json?date=52:0&format=json");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder12.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json?date=10:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json?date=10:-1&format=json");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass18 = urlBuilder17.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder7.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country//indicator/?date=97:100&format=json");
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
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json?date=1:-1&format=json");
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
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) 10);
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
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url url20 = urlBuilder17.build();
        java.lang.String str21 = url20.toString();
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=1:0&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=1:0&format=json");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (byte) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url url23 = urlBuilder22.build();
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
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) '#');
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
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        java.lang.Class<?> wildcardClass20 = urlBuilder16.getClass();
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
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder11.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) ' ');
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
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        java.lang.Class<?> wildcardClass20 = urlBuilder16.getClass();
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
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder17.setYearStart((int) ' ');
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
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json");
        fetchers.Url url18 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd(1);
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
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
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
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
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
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("");
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
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
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
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url20 = urlBuilder19.build();
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
        org.junit.Assert.assertNotNull(url20);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
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
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 0);
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
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(1);
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
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
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
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
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
        java.lang.Class<?> wildcardClass21 = urlBuilder16.getClass();
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
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd(0);
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
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) 'a');
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
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearStart((int) (byte) 0);
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
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:0&format=json");
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
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((-1));
        java.lang.Class<?> wildcardClass20 = urlBuilder17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder5.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearStart((int) (byte) 0);
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
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
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
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
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
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearEnd((int) (byte) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (byte) 0);
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
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) 'a');
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
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url16 = urlBuilder15.build();
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
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("");
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
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json");
        fetchers.Url url21 = urlBuilder18.build();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json?date=1:0&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json?date=1:0&format=json");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
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
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 1);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder20);
        org.junit.Assert.assertNotNull(urlBuilder22);
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (byte) -1);
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
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd((int) (byte) -1);
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
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
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
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) '4');
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
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
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
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url url11 = urlBuilder8.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json/indicator/?date=1:52&format=json");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setYearEnd(0);
        fetchers.Url url17 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder6.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url22 = urlBuilder21.build();
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
        org.junit.Assert.assertNotNull(urlBuilder21);
        org.junit.Assert.assertNotNull(url22);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setYearEnd(0);
        fetchers.Url url5 = urlBuilder4.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setYearEnd((-1));
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
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
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
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url url15 = urlBuilder12.build();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("");
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
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart((int) '4');
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
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 0);
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
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url url13 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=10:100&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=10:100&format=json");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd(0);
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
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=32:97&format=json");
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
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
        fetchers.Url url24 = urlBuilder21.build();
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder21.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder21.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder28.setYearStart((int) '4');
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
        org.junit.Assert.assertNotNull(url24);
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(urlBuilder30);
        org.junit.Assert.assertNotNull(urlBuilder32);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url url15 = urlBuilder14.build();
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
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url url12 = urlBuilder2.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json?date=1:0&format=json");
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
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((int) '#');
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
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart(10);
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
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearEnd((int) (byte) 10);
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
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder2.setYearStart((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 100);
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
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        java.lang.Class<?> wildcardClass15 = urlBuilder10.getClass();
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
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
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
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=-1:0&format=json");
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
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder26.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder26.setYearEnd((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(urlBuilder32);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (byte) -1);
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
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url10 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country//indicator/?date=1:100&format=json");
        java.lang.Class<?> wildcardClass26 = urlBuilder17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (byte) 10);
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
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearEnd(0);
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
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
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
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 0);
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
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.Class<?> wildcardClass14 = url13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url20 = urlBuilder17.build();
        java.lang.String str21 = url20.toString();
        java.lang.String str22 = url20.toString();
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:-1&format=json");
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
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        fetchers.Url url20 = urlBuilder15.build();
        fetchers.Url url21 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
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
        org.junit.Assert.assertNotNull(url20);
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearStart((int) (short) 0);
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
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json");
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
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) ' ');
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
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=32:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder22.setYearEnd((int) (short) 100);
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json?date=-1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearEnd((int) (byte) 100);
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
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (short) 100);
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
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
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
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
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
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
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
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url url9 = urlBuilder6.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.Class<?> wildcardClass13 = url9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 100);
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
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        fetchers.Url url19 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:100&format=json");
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
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) 'a');
        fetchers.Url url16 = urlBuilder15.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (short) 1);
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
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=52:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
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
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:100&format=json");
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
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=0:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:100&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
    }
}

