package fetchersrandoopoutput;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
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
        java.lang.Class<?> wildcardClass21 = urlBuilder12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(10);
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
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("hi!");
        fetchers.Url url13 = urlBuilder8.build();
        java.lang.Class<?> wildcardClass14 = urlBuilder8.getClass();
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
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        java.lang.Class<?> wildcardClass13 = urlBuilder10.getClass();
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
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 0);
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
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url url16 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
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
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder27.setYearEnd((int) (byte) 1);
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
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:1&format=json");
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
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url url18 = urlBuilder16.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertNotNull(url18);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json?date=52:100&format=json");
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
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
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
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
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
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) (byte) -1);
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
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:10&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=52:10&format=json");
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) '#');
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
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder13.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/null?date=52:1&format=json");
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
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(100);
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
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url url12 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(0);
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
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setYearStart((int) '4');
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
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((-1));
        fetchers.Url url14 = urlBuilder8.build();
        java.lang.Class<?> wildcardClass15 = url14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
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
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json/indicator/?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) (short) 1);
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
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url url13 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        java.lang.Class<?> wildcardClass9 = urlBuilder6.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=32:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
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
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(0);
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
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearEnd((int) 'a');
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
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
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
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=100:-1&format=json");
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
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 10);
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
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url url28 = urlBuilder23.build();
        java.lang.String str29 = url28.toString();
        java.lang.Class<?> wildcardClass30 = url28.getClass();
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
        org.junit.Assert.assertNotNull(url28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=52:100&format=json" + "'", str29, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=52:100&format=json");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=10:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:-1&format=json");
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
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 100);
        fetchers.Url url23 = urlBuilder22.build();
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
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) 0);
        java.lang.Class<?> wildcardClass5 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
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
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
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
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder27.setYearStart((int) (byte) 0);
        java.lang.Class<?> wildcardClass30 = urlBuilder29.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) 'a');
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
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder30.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url url33 = urlBuilder32.build();
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
        org.junit.Assert.assertNotNull(url33);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
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
        fetchers.Url url22 = urlBuilder21.build();
        fetchers.Url url23 = urlBuilder21.build();
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
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertNotNull(url23);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
        java.lang.Class<?> wildcardClass10 = urlBuilder7.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=1:-1&format=json");
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
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=35:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url url20 = urlBuilder18.build();
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
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder12.setanalysisMode("");
        fetchers.Url url25 = urlBuilder12.build();
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
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url9 = urlBuilder8.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=0:97&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=0:97&format=json");
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:97&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:97&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:97&format=json");
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
        java.lang.Class<?> wildcardClass31 = urlBuilder30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
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
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
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
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url13 = urlBuilder12.build();
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
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
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
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart(10);
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
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setYearEnd((int) (short) -1);
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
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(100);
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
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url20 = urlBuilder19.build();
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
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) (short) -1);
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
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearEnd((int) (byte) 10);
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
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearEnd((int) '#');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setYearEnd((int) (short) 1);
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
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=1:-1&format=json");
        java.lang.Class<?> wildcardClass14 = urlBuilder9.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
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
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url url16 = urlBuilder15.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setYearStart((int) (short) 1);
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
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder14.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(100);
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
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder13.setYearStart((-1));
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
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
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
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url url14 = urlBuilder13.build();
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
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(0);
        fetchers.Url url21 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder14.setYearEnd((-1));
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
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
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
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
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
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) '#');
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
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) 'a');
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart(0);
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
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url21 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder20.setanalysisMode("");
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
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart(100);
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
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearStart((int) ' ');
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
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/?date=0:-1&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart(1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(urlBuilder17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setYearEnd((int) (short) 0);
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
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=0:1&format=json" + "'", str22, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=0:1&format=json");
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url8 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearEnd((-1));
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (byte) -1);
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
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) -1);
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
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder11.setYearStart((int) 'a');
        fetchers.Url url20 = urlBuilder19.build();
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
        org.junit.Assert.assertNotNull(url20);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=-1:0&format=json");
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
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json/indicator/hi!?date=52:97&format=json");
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
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url11 = urlBuilder2.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        java.lang.String str14 = url11.toString();
        java.lang.String str15 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=52:-1&format=json");
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/hi!?date=52:0&format=json");
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
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart(100);
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
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url19 = urlBuilder18.build();
        java.lang.String str20 = url19.toString();
        java.lang.String str21 = url19.toString();
        java.lang.String str22 = url19.toString();
        java.lang.String str23 = url19.toString();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json" + "'", str22, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json" + "'", str23, "http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json");
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 10);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url url16 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) -1);
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
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:1&format=json");
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
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json");
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
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=100:52&format=json");
        fetchers.Url url24 = urlBuilder23.build();
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
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
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
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
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
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder20.setYearStart(0);
        java.lang.Class<?> wildcardClass28 = urlBuilder27.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
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
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json");
        fetchers.Url url25 = urlBuilder24.build();
        java.lang.String str26 = url25.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=1:100&format=json" + "'", str26, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=1:100&format=json");
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder8.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder8.setYearEnd((int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = urlBuilder8.getClass();
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
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
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
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
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
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder30.setYearStart((int) 'a');
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
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
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
        java.lang.Class<?> wildcardClass20 = urlBuilder16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setYearEnd(10);
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
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:97&format=json");
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
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/null?date=52:10&format=json");
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
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:10&format=json");
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
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (byte) 10);
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
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/hi!?date=1:10&format=json" + "'", str28, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/hi!?date=1:10&format=json");
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:-1&format=json");
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
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setYearStart((int) '4');
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
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (byte) -1);
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
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(1);
        fetchers.Url url15 = urlBuilder12.build();
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
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (short) 1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd(0);
        fetchers.Url url14 = urlBuilder11.build();
        java.lang.Class<?> wildcardClass15 = url14.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setYearEnd((int) (short) -1);
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
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("");
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
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) 1);
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
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) -1);
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
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart(1);
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
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=1:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder23.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder23.setYearEnd((int) (byte) 10);
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
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:35&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:10&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=52:-1&format=json?date=0:35&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
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
        fetchers.Url url16 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass19 = urlBuilder6.getClass();
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
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=52:-1&format=json");
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
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
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
        fetchers.Url url19 = urlBuilder15.build();
        java.lang.String str20 = url19.toString();
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
        org.junit.Assert.assertNotNull(url19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=52:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json?date=52:0&format=json");
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:-1&format=json");
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
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearEnd((int) (short) -1);
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
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (byte) -1);
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
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setYearStart((int) (short) 1);
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
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) -1);
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
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json?date=1:0&format=json");
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
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) 10);
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
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setYearEnd(0);
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
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (byte) 0);
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
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
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
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 100);
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
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=52:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/hi!?date=0:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("");
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearEnd((-1));
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
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearEnd((int) (short) 10);
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
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
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
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        java.lang.String str16 = url13.toString();
        java.lang.String str17 = url13.toString();
        java.lang.String str18 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
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
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart(0);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url url14 = urlBuilder12.build();
        java.lang.String str15 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
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
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url url14 = urlBuilder10.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(url14);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (byte) 1);
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
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:100&format=json");
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
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/?date=1:100&format=json");
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
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearStart(10);
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
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setYearEnd((int) (short) 100);
        fetchers.Url url11 = urlBuilder0.build();
        fetchers.Url url12 = urlBuilder0.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(url12);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 0);
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
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearEnd((int) (byte) 1);
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
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder18.setYearEnd(100);
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
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("");
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=32:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=100:-1&format=json");
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
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
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
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=-1:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 0);
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
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearStart((int) (short) -1);
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
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
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
        java.lang.Class<?> wildcardClass17 = urlBuilder14.getClass();
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
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) ' ');
        fetchers.Url url25 = urlBuilder24.build();
        java.lang.String str26 = url25.toString();
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json/indicator/hi!?date=0:32&format=json" + "'", str26, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json/indicator/hi!?date=0:32&format=json");
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearEnd((int) (byte) 100);
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
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url url9 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart((int) (byte) 1);
        fetchers.Url url14 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder11.setYearEnd((int) (short) 1);
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
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url url12 = urlBuilder8.build();
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
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) '4');
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
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
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
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass24 = urlBuilder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) (short) 1);
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
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd((int) ' ');
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
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearStart((int) (byte) 100);
        java.lang.Class<?> wildcardClass24 = urlBuilder23.getClass();
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
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
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
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:1&format=json");
        fetchers.Url url7 = urlBuilder6.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:-1&format=json");
        fetchers.Url url19 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder16.setYearEnd((int) (byte) 0);
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
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url6 = urlBuilder5.build();
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder5.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json?date=10:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(url6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url url11 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearStart((int) (short) 100);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
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
        fetchers.Url url21 = urlBuilder20.build();
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder20.setYearEnd(0);
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
        org.junit.Assert.assertNotNull(url21);
        org.junit.Assert.assertNotNull(urlBuilder23);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url url14 = urlBuilder8.build();
        java.lang.String str15 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=52:100&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=52:100&format=json");
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder29 = urlBuilder25.setYearStart(1);
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
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/null?date=-1:100&format=json");
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder10.setYearStart((int) (short) 100);
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
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder17.setYearStart((int) (short) 0);
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
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url url15 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder19.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder19.setYearEnd((int) (byte) 10);
        fetchers.Url url26 = urlBuilder25.build();
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
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setYearStart((int) (short) 10);
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
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url url16 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setYearEnd((int) (short) 10);
        java.lang.Class<?> wildcardClass19 = urlBuilder6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/hi!?date=10:1&format=json");
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
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json?date=0:100&format=json");
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
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd(10);
        fetchers.Url url10 = urlBuilder9.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=-1:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url url7 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder6.setYearEnd(10);
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url url13 = urlBuilder11.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/null?date=0:10&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/null?date=0:10&format=json");
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
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
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url url13 = urlBuilder8.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=10:97&format=json");
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:10&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
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
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
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
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearStart(1);
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
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:-1&format=json");
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/?date=0:-1&format=json");
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
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
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
        fetchers.Url url22 = urlBuilder21.build();
        java.lang.String str23 = url22.toString();
        java.lang.String str24 = url22.toString();
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
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:1&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:1&format=json");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:1&format=json" + "'", str24, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=35:1&format=json");
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/?date=100:100&format=json");
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
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
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
        java.lang.String str25 = url24.toString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=1:100&format=json" + "'", str25, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=1:100&format=json");
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
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
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json/indicator/null?date=10:0&format=json");
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
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) '4');
        fetchers.Url url12 = urlBuilder11.build();
        java.lang.String str13 = url12.toString();
        java.lang.String str14 = url12.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/?date=52:0&format=json" + "'", str13, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/?date=52:0&format=json" + "'", str14, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json/indicator/?date=52:0&format=json");
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setYearEnd((int) (byte) 100);
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
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd((int) ' ');
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
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd(10);
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
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setYearEnd((-1));
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
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        java.lang.Class<?> wildcardClass14 = urlBuilder10.getClass();
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
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url url16 = urlBuilder13.build();
        java.lang.String str17 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:52&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json?date=0:52&format=json");
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setYearEnd((int) '#');
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
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=100:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json?date=100:-1&format=json");
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder20.setYearEnd(100);
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
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder20.setYearStart((int) (byte) 0);
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
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:100&format=json");
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
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=0:-1&format=json");
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
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json/indicator/?date=52:10&format=json");
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
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
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
        fetchers.Url url15 = urlBuilder13.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd((int) (byte) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(urlBuilder17);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setanalysisMode("");
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
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url url11 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setYearStart((int) (byte) -1);
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
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json?date=-1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=52:100&format=json");
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
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setYearEnd((-1));
        fetchers.Url url18 = urlBuilder17.build();
        java.lang.String str19 = url18.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=10:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=10:-1&format=json");
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json/indicator/hi!?date=-1:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=10:0&format=json");
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
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        java.lang.String str8 = url7.toString();
        java.lang.String str9 = url7.toString();
        java.lang.String str10 = url7.toString();
        java.lang.String str11 = url7.toString();
        java.lang.String str12 = url7.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json" + "'", str9, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json/indicator/null?date=10:0&format=json");
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
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        java.lang.Class<?> wildcardClass12 = urlBuilder4.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:0&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:0&format=json");
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url url14 = urlBuilder13.build();
        java.lang.String str15 = url14.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json?date=100:52&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json?date=100:52&format=json");
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=10:100&format=json");
        java.lang.Class<?> wildcardClass25 = urlBuilder24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:-1&format=json");
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
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(1);
        fetchers.Url url15 = urlBuilder12.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        java.lang.String str18 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:0&format=json");
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder20.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder25.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
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
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
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
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder15.setYearStart((int) ' ');
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
        org.junit.Assert.assertNotNull(urlBuilder20);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) ' ');
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
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) '4');
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
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
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
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(urlBuilder18);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        java.lang.String str14 = url13.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:-1&format=json");
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) '4');
        java.lang.Class<?> wildcardClass20 = urlBuilder19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setYearEnd((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (short) -1);
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((int) (short) 0);
        java.lang.Class<?> wildcardClass22 = urlBuilder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url url7 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json/indicator/hi!?date=10:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) -1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
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
        java.lang.String str17 = url15.toString();
        java.lang.String str18 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (short) 100);
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
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearEnd((int) (short) 0);
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
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url url19 = urlBuilder8.build();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:100&format=json");
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(100);
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url url16 = urlBuilder14.build();
        java.lang.String str17 = url16.toString();
        java.lang.String str18 = url16.toString();
        java.lang.String str19 = url16.toString();
        java.lang.String str20 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart(100);
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
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        java.lang.String str20 = url19.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/null?date=0:100&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json/indicator/null?date=0:100&format=json");
    }

    @Test
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=52:97&format=json");
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setYearEnd((int) (byte) 10);
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
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
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
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
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
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url url15 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
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
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
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
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) '#');
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
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        java.lang.Class<?> wildcardClass9 = urlBuilder8.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
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
        java.lang.Class<?> wildcardClass28 = urlBuilder21.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) 'a');
        fetchers.Url url15 = urlBuilder14.build();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=97:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country//indicator/?date=97:-1&format=json");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json?date=0:-1&format=json");
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
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 10);
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
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearStart((int) ' ');
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
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 100);
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
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder19.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json?date=52:0&format=json");
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
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=10:-1&format=json?date=10:10&format=json");
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
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=100:52&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearEnd((int) (byte) 1);
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
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 100);
        fetchers.Url url15 = urlBuilder10.build();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (byte) 100);
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
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder10.setYearEnd((int) (byte) 1);
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
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=-1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/?date=1:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json/indicator/?date=100:-1&format=json");
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
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
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
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        java.lang.String str4 = url3.toString();
        java.lang.String str5 = url3.toString();
        java.lang.String str6 = url3.toString();
        java.lang.String str7 = url3.toString();
        java.lang.String str8 = url3.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str4, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str5, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json" + "'", str8, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 100);
        fetchers.Url url9 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart(100);
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
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
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
        java.lang.Class<?> wildcardClass19 = urlBuilder8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder0.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder0.setYearStart(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) 'a');
        fetchers.Url url19 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country//indicator/?date=52:32&format=json");
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
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder14.setYearStart(10);
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
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
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
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder23.setYearEnd((int) (short) 100);
        java.lang.Class<?> wildcardClass26 = urlBuilder25.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (byte) 0);
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
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((-1));
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
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder11.setYearEnd((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (byte) 100);
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
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
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
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url url1 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder3 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder3.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder5.setYearEnd((int) '#');
        fetchers.Url url10 = urlBuilder9.build();
        org.junit.Assert.assertNotNull(url1);
        org.junit.Assert.assertNotNull(urlBuilder3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
    }

    @Test
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder9.setYearStart((-1));
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
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder13.setYearEnd((int) (short) 0);
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
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url url9 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setYearEnd((int) (short) -1);
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
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 0);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder8.setYearStart(1);
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
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=52:-1&format=json");
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
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=1:100&format=json");
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
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((-1));
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
        org.junit.Assert.assertNotNull(urlBuilder26);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart(100);
        fetchers.Url url18 = urlBuilder15.build();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json" + "'", str19, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=100:0&format=json");
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
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
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url url17 = urlBuilder16.build();
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json/indicator/null?date=10:100&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json/indicator/null?date=10:100&format=json");
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=1:0&format=json");
        fetchers.Url url27 = urlBuilder21.build();
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
        org.junit.Assert.assertNotNull(url27);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
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
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/hi!?date=52:100&format=json");
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
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url url13 = urlBuilder6.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder6.setYearStart((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
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
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (byte) 100);
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
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        java.lang.String str17 = url16.toString();
        java.lang.String str18 = url16.toString();
        java.lang.String str19 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json" + "'", str17, "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json" + "'", str18, "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json" + "'", str19, "http://api.worldbank.org/v2/country//indicator/?date=0:-1&format=json");
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(url4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/?date=100:100&format=json");
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
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart((-1));
        fetchers.Url url24 = urlBuilder21.build();
        java.lang.String str25 = url24.toString();
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
        org.junit.Assert.assertNotNull(url24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/?date=-1:-1&format=json" + "'", str25, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json/indicator/?date=-1:-1&format=json");
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/null?date=0:0&format=json");
        fetchers.Url url25 = urlBuilder24.build();
        fetchers.Url.UrlBuilder urlBuilder27 = urlBuilder24.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json?date=0:-1&format=json");
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
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder6.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder6.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) ' ');
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
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (short) 0);
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
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder4.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json");
        fetchers.Url url15 = urlBuilder11.build();
        java.lang.String str16 = url15.toString();
        java.lang.String str17 = url15.toString();
        java.lang.String str18 = url15.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=100:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
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
        fetchers.Url url25 = urlBuilder20.build();
        fetchers.Url url26 = urlBuilder20.build();
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
        org.junit.Assert.assertNotNull(url26);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder19.setYearStart(10);
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
        org.junit.Assert.assertNotNull(urlBuilder24);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setYearStart(10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
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
        fetchers.Url url24 = urlBuilder17.build();
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:97&format=json/indicator/null?date=52:100&format=json");
        java.lang.Class<?> wildcardClass27 = urlBuilder26.getClass();
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
        org.junit.Assert.assertNotNull(urlBuilder26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearStart((int) (byte) -1);
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
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) (short) 100);
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
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("hi!");
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
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearEnd((int) (short) 10);
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
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=35:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        java.lang.String str10 = url9.toString();
        java.lang.String str11 = url9.toString();
        java.lang.String str12 = url9.toString();
        java.lang.String str13 = url9.toString();
        java.lang.String str14 = url9.toString();
        java.lang.String str15 = url9.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str10, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str11, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str12, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str13, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str14, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json" + "'", str15, "http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json");
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 10);
        fetchers.Url url13 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json");
        fetchers.Url url16 = urlBuilder15.build();
        java.lang.String str17 = url16.toString();
        java.lang.String str18 = url16.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertNotNull(urlBuilder15);
        org.junit.Assert.assertNotNull(url16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=52:10&format=json" + "'", str17, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=52:10&format=json");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=52:10&format=json" + "'", str18, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:100&format=json?date=52:10&format=json");
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder13.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((-1));
        fetchers.Url url22 = urlBuilder21.build();
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
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json/indicator/hi!?date=-1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearStart((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder26.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(urlBuilder30);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json?date=52:97&format=json" + "'", str16, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=52:-1&format=json?date=52:97&format=json");
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder11.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=52:10&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder21);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country//indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json?date=52:-1&format=json");
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
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (short) 100);
        fetchers.Url url17 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=32:-1&format=json");
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
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
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
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder11.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:10&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:100&format=json");
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
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder2.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder2.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder2.setYearEnd((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json?date=52:52&format=json");
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
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (byte) 10);
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
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setYearEnd((-1));
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
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
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
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
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
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        java.lang.String str6 = url5.toString();
        java.lang.String str7 = url5.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str6, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str7, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearStart((int) (short) 100);
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
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '4');
        fetchers.Url url15 = urlBuilder14.build();
        fetchers.Url url16 = urlBuilder14.build();
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=0:0&format=json");
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
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url url8 = urlBuilder7.build();
        fetchers.Url url9 = urlBuilder7.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(url8);
        org.junit.Assert.assertNotNull(url9);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url url6 = urlBuilder5.build();
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder5.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:100&format=json");
        fetchers.Url url15 = urlBuilder14.build();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(url6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
        org.junit.Assert.assertNotNull(url15);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json?date=0:0&format=json");
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
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart((int) (byte) 1);
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearStart((int) (short) 1);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (short) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json?date=97:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/null?date=0:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:52&format=json/indicator/hi!?date=0:-1&format=json");
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
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url url7 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=52:-1&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder4.setYearEnd((int) (short) 0);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(url7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=1:97&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd((int) '4');
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
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=10:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearStart((int) (short) -1);
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
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder0.setCountry("http://api.worldbank.org/v2/country//indicator/null?date=52:0&format=json");
        java.lang.Class<?> wildcardClass12 = urlBuilder11.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (short) 100);
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
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder2.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder5.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder7.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=1:52&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearEnd((int) '4');
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
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        java.lang.String str11 = url10.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json" + "'", str11, "http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
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
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder14.setYearStart((int) 'a');
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
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=1:0&format=json");
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
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder2.build();
        fetchers.Url url4 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json?date=52:0&format=json?date=100:100&format=json/indicator/null?date=10:0&format=json");
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
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=100:1&format=json");
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
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
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
        fetchers.Url url21 = urlBuilder16.build();
        java.lang.Class<?> wildcardClass22 = urlBuilder16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder15.setYearEnd(1);
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
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
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
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json?date=-1:-1&format=json/indicator/hi!?date=52:52&format=json");
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
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=35:0&format=json?date=1:100&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
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
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder19.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder23 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=0:-1&format=json?date=100:52&format=json/indicator/hi!?date=52:10&format=json");
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder21.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
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
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url url12 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:100&format=json");
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
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
        org.junit.Assert.assertNotNull(urlBuilder12);
        org.junit.Assert.assertNotNull(urlBuilder14);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json?date=0:-1&format=json");
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (short) 0);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("hi!");
        fetchers.Url url12 = urlBuilder11.build();
        fetchers.Url url13 = urlBuilder11.build();
        java.lang.String str14 = url13.toString();
        java.lang.String str15 = url13.toString();
        java.lang.Class<?> wildcardClass16 = url13.getClass();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(url12);
        org.junit.Assert.assertNotNull(url13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str14, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json" + "'", str15, "http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:0&format=json");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearStart(100);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((-1));
        fetchers.Url url17 = urlBuilder14.build();
        java.lang.String str18 = url17.toString();
        java.lang.String str19 = url17.toString();
        java.lang.String str20 = url17.toString();
        java.lang.String str21 = url17.toString();
        java.lang.String str22 = url17.toString();
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json" + "'", str20, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json" + "'", str21, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json");
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd(100);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) '4');
        fetchers.Url url11 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearEnd((int) (byte) 1);
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
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:32&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearEnd((int) ' ');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=1:10&format=json");
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
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json?date=-1:0&format=json" + "'", str22, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json?date=-1:0&format=json");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json?date=-1:0&format=json" + "'", str23, "http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=10:-1&format=json?date=-1:0&format=json");
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder2.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setCountry("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:-1&format=json?date=35:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setYearStart((int) (short) 0);
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
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        fetchers.Url url18 = urlBuilder13.build();
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
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("");
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
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json");
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
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearStart((int) 'a');
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
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
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
        fetchers.Url url20 = urlBuilder19.build();
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
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd(100);
        fetchers.Url url11 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder10.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setYearStart((int) (byte) 1);
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
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url url13 = urlBuilder8.build();
        fetchers.Url url14 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:100&format=json");
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
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder16.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder16.setYearStart((int) ' ');
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
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart(1);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setYearStart((int) (short) 1);
        fetchers.Url url21 = urlBuilder18.build();
        fetchers.Url url22 = urlBuilder18.build();
        java.lang.Class<?> wildcardClass23 = url22.getClass();
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
        org.junit.Assert.assertNotNull(url22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setCountry("http://api.worldbank.org/v2/country/null/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=52:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart((int) 'a');
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
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder26.setYearEnd((int) (byte) -1);
        fetchers.Url url31 = urlBuilder26.build();
        fetchers.Url.UrlBuilder urlBuilder33 = urlBuilder26.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/null?date=0:100&format=json?date=1:0&format=json");
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
        org.junit.Assert.assertNotNull(urlBuilder33);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
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
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder15.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder15.setYearEnd(0);
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
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
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
        fetchers.Url url18 = urlBuilder17.build();
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
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json?date=1:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=100:100&format=json?date=100:0&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(url9);
        org.junit.Assert.assertNotNull(urlBuilder11);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
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
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setYearStart((int) (short) 0);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=52:0&format=json/indicator/?date=100:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setCountry("");
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
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:35&format=json" + "'", str20, "http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:35&format=json");
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearEnd((int) (byte) -1);
        fetchers.Url url10 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder4.setYearStart((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) ' ');
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
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=97:100&format=json");
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder21 = urlBuilder17.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/?date=100:-1&format=json/indicator/?date=10:-1&format=json");
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
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
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
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json/indicator/hi!?date=52:97&format=json");
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
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd(0);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder7.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder11.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder13.setYearStart((int) (short) 1);
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
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder18.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/?date=100:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder18.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=1:-1&format=json");
        fetchers.Url url23 = urlBuilder18.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder18.setYearEnd(0);
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
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
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
        fetchers.Url.UrlBuilder urlBuilder26 = urlBuilder24.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder26.setYearEnd(1);
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder30.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/?date=-1:-1&format=json?date=0:100&format=json");
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
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json?date=0:1&format=json");
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(urlBuilder6);
        org.junit.Assert.assertNotNull(urlBuilder8);
        org.junit.Assert.assertNotNull(urlBuilder10);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
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
        fetchers.Url url17 = urlBuilder16.build();
        fetchers.Url.UrlBuilder urlBuilder19 = urlBuilder16.setYearEnd((int) (short) 10);
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(urlBuilder4);
        org.junit.Assert.assertNotNull(url5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(urlBuilder11);
        org.junit.Assert.assertNotNull(urlBuilder13);
        org.junit.Assert.assertNotNull(url14);
        org.junit.Assert.assertNotNull(urlBuilder16);
        org.junit.Assert.assertNotNull(url17);
        org.junit.Assert.assertNotNull(urlBuilder19);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart((int) '#');
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) (byte) 1);
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
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder8.setYearEnd(10);
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=10:1&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder8.setanalysisMode("");
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
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url url5 = urlBuilder4.build();
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder4.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder4.setYearStart(10);
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder9.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder9.setCountry("http://api.worldbank.org/v2/country/null/indicator/null?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder9.setYearStart((int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = urlBuilder15.getClass();
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
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
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
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder28.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder30.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/hi!?date=0:97&format=json");
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
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
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
        fetchers.Url url23 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder25 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/hi!/indicator/hi!?date=0:97&format=json");
        fetchers.Url url26 = urlBuilder12.build();
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder12.setYearStart((-1));
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder12.setYearEnd((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(urlBuilder30);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder0.setanalysisMode("");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder12.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json/indicator/hi!?date=0:-1&format=json?date=52:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setYearEnd((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder20 = urlBuilder16.setYearStart((int) (short) 1);
        fetchers.Url.UrlBuilder urlBuilder22 = urlBuilder20.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder24 = urlBuilder22.setYearEnd((int) ' ');
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
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url url3 = urlBuilder0.build();
        fetchers.Url.UrlBuilder urlBuilder5 = urlBuilder0.setCountry("");
        fetchers.Url.UrlBuilder urlBuilder7 = urlBuilder0.setYearEnd((int) (byte) 100);
        fetchers.Url.UrlBuilder urlBuilder9 = urlBuilder7.setYearEnd((int) (byte) 1);
        fetchers.Url url10 = urlBuilder7.build();
        fetchers.Url url11 = urlBuilder7.build();
        java.lang.String str12 = url11.toString();
        java.lang.String str13 = url11.toString();
        org.junit.Assert.assertNotNull(urlBuilder2);
        org.junit.Assert.assertNotNull(url3);
        org.junit.Assert.assertNotNull(urlBuilder5);
        org.junit.Assert.assertNotNull(urlBuilder7);
        org.junit.Assert.assertNotNull(urlBuilder9);
        org.junit.Assert.assertNotNull(url10);
        org.junit.Assert.assertNotNull(url11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json" + "'", str12, "http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json" + "'", str13, "http://api.worldbank.org/v2/country//indicator/null?date=52:1&format=json");
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        fetchers.Url.UrlBuilder urlBuilder28 = urlBuilder22.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:0&format=json/indicator/http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json?date=0:0&format=json");
        fetchers.Url.UrlBuilder urlBuilder30 = urlBuilder22.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder32 = urlBuilder22.setYearStart((int) ' ');
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
        org.junit.Assert.assertNotNull(urlBuilder28);
        org.junit.Assert.assertNotNull(urlBuilder30);
        org.junit.Assert.assertNotNull(urlBuilder32);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder2.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder2.setYearEnd((int) (byte) -1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder2.setYearStart((int) (byte) 0);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setanalysisMode("http://api.worldbank.org/v2/country//indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json");
        fetchers.Url url13 = urlBuilder10.build();
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder10.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/null?date=52:0&format=json/indicator/hi!?date=0:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder17 = urlBuilder15.setYearStart((int) (byte) -1);
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
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
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
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder16.setanalysisMode("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/hi!?date=52:97&format=json/indicator/http://api.worldbank.org/v2/country/hi!/indicator/null?date=0:0&format=json?date=0:-1&format=json");
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
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url url9 = urlBuilder8.build();
        fetchers.Url.UrlBuilder urlBuilder11 = urlBuilder8.setCountry("http://api.worldbank.org/v2/country/http://api.worldbank.org/v2/country/null/indicator/?date=52:100&format=json/indicator/hi!?date=-1:97&format=json");
        fetchers.Url.UrlBuilder urlBuilder13 = urlBuilder8.setYearEnd((int) '#');
        fetchers.Url.UrlBuilder urlBuilder15 = urlBuilder13.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/hi!?date=0:0&format=json");
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
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearStart(0);
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder0.setYearStart((int) (byte) 1);
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setCountry("hi!");
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder8.setYearEnd((int) (short) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setYearEnd((-1));
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder12.setYearStart(0);
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
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        fetchers.Url.UrlBuilder urlBuilder0 = new fetchers.Url.UrlBuilder();
        fetchers.Url.UrlBuilder urlBuilder2 = urlBuilder0.setYearStart((int) '4');
        fetchers.Url.UrlBuilder urlBuilder4 = urlBuilder0.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder6 = urlBuilder4.setYearEnd((int) 'a');
        fetchers.Url.UrlBuilder urlBuilder8 = urlBuilder6.setYearEnd((int) (short) -1);
        fetchers.Url.UrlBuilder urlBuilder10 = urlBuilder6.setYearEnd((int) (byte) 10);
        fetchers.Url.UrlBuilder urlBuilder12 = urlBuilder10.setanalysisMode("http://api.worldbank.org/v2/country/null/indicator/?date=52:-1&format=json");
        fetchers.Url.UrlBuilder urlBuilder14 = urlBuilder10.setanalysisMode("hi!");
        fetchers.Url.UrlBuilder urlBuilder16 = urlBuilder14.setYearEnd((int) '4');
        fetchers.Url.UrlBuilder urlBuilder18 = urlBuilder14.setYearStart(10);
        fetchers.Url url19 = urlBuilder14.build();
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
}

